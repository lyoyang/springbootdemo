package com.lyoyang.springbootjpa;

import com.lyoyang.springbootjpa.dao.UserDao;
import com.lyoyang.springbootjpa.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	public void getUserByName_test() {
		User user = userDao.findByUsername("李宁");
		System.out.println("start------>");
		System.out.println(user);
		System.out.println("end------>");
	}
}
