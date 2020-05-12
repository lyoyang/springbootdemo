package com.lyoyang.springsecurity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityOauthAppTests {

	@Test
	public void test_encodePwd() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String admin = encoder.encode("admin");
		System.out.println(admin);
	}

}
