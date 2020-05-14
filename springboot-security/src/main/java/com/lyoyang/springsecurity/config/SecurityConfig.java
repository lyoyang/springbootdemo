package com.lyoyang.springsecurity.config;

import com.lyoyang.springsecurity.filter.JwtAuthenticationTokenFilter;
import com.lyoyang.springsecurity.handler.MyAuthenticationFailureHandler;
import com.lyoyang.springsecurity.handler.MyLoginSuccessHandler;
import com.lyoyang.springsecurity.handler.MyLogoutSuccessHandler;
import com.lyoyang.springsecurity.service.PersistentLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.devtools.restart.FailureHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.session.security.SpringSessionBackedSessionRegistry;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private UserDetailsService userDetailsService;

    @Resource
    private PersistentLoginService persistentLoginService;

    @Autowired
    private FindByIndexNameSessionRepository sessionRepository;


    @Resource
    private JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;


    @Autowired
    private AuthenticationDetailsSource<HttpServletRequest, WebAuthenticationDetails> myWebauthenticationDetailsSource;


//    @Resource
//    private DataSource dataSource;


//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(myAuthenticationProvider);
//    }

    @Bean
    public SpringSessionBackedSessionRegistry sessionRegistry(){
        return new SpringSessionBackedSessionRegistry(sessionRepository);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/css/**","/js/**","/fonts/**").permitAll()
                .antMatchers("/admin/api/**").hasRole("ADMIN")
                .antMatchers("/user/api/**").hasRole("USER")
                .antMatchers("/app/api", "/captcha.jpg").permitAll()
                .anyRequest().authenticated()
                .and().cors().disable().csrf().disable()
                .formLogin()
//                .authenticationDetailsSource(myWebauthenticationDetailsSource)
                .loginPage("/login").permitAll()
                .failureHandler(new MyAuthenticationFailureHandler())
                .and().logout().logoutSuccessHandler(new MyLogoutSuccessHandler()).permitAll()
                .and().rememberMe().tokenRepository(persistentLoginService).userDetailsService(userDetailsService)
                .and().sessionManagement().maximumSessions(1).sessionRegistry(sessionRegistry());

                http.addFilterAt(customAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);
//                http.addFilterBefore(new VerificationCodeFilter(), UsernamePasswordAuthenticationFilter.class);
    }




    @Bean
    CustomAuthenticationFilter customAuthenticationFilter() throws Exception {
        CustomAuthenticationFilter filter = new CustomAuthenticationFilter();
        filter.setAuthenticationSuccessHandler(new MyLoginSuccessHandler());
        filter.setAuthenticationFailureHandler(new MyAuthenticationFailureHandler());
        filter.setFilterProcessesUrl("/doLogin");
        //这句很关键，重用WebSecurityConfigurerAdapter配置的AuthenticationManager，不然要自己组装AuthenticationManager
        filter.setAuthenticationManager(authenticationManagerBean());
        filter.setAuthenticationDetailsSource(myWebauthenticationDetailsSource);
        return filter;
    }


//
//    @Bean
//    public UserDetailsService userDetailService() {
//        InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager();
//        detailsManager.createUser(User.withUsername("user").password("123456").roles("USER").build());
//        detailsManager.createUser(User.withUsername("admin").password("123456").roles("USER", "ADMIN").build());
//        return detailsManager;
//    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//        JdbcUserDetailsManager manager = new JdbcUserDetailsManager();
//        manager.setDataSource(dataSource);
//        if (!manager.userExists("user")) {
//            manager.createUser(User.withUsername("user").password("12345").roles("USER").build());
//        }
//        if (!manager.userExists("admin")) {
//            manager.createUser(User.withUsername("admin").password("12345").roles("ADMIN", "USER").build());
//        }
//        return manager;
//
//    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
        return passwordEncoder;
    }
}
