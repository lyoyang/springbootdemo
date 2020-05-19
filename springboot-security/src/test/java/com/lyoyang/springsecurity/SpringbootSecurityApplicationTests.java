package com.lyoyang.springsecurity;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SecurityApplication.class)
public class SpringbootSecurityApplicationTests {

	private MockMvc mvc;

	@BeforeEach
	public void setup(WebApplicationContext webApplicationContext) {
		mvc = MockMvcBuilders
				.webAppContextSetup(webApplicationContext)
				.apply(springSecurity())
				.build();
	}

	@Test
	public void testSign() throws Exception {
		ResultActions resultActions = mvc.perform(formLogin("/doLogin").user("yangbing").password("12345"));
		System.out.println(resultActions);
	}


}
