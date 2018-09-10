package com.lyoyang.springbootredis;

import com.google.common.collect.Lists;
import com.lyoyang.springbootredis.entity.User;
import com.lyoyang.springbootredis.service.RedisService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

	@Autowired
	RedisService redisService;

	@Before
	public void setUp(){}

	@Test
	public void getUser() {
//		User user = redisService.getUser("user:12");
		List<User> userList = redisService.getUserList("userList");
		System.out.println(userList.size());
	}

	@Test
	public void test_print(){
		System.out.println(123);
	}

	@Test
	public void addUser() {
		User user = new User();
		user.setId(12);
		user.setAge(23);
		user.setUsername("gaoyang");
		user.setBirthday(new Date());
		user.setGender("男");
		user.setPassword("12345");
		redisService.add("user:" + user.getId(), user, 343435L);
	}

	@Test
	public void addUserList() {
		ArrayList<User> list = Lists.newArrayList();
		for(int i=0; i<10; i++) {
			User user = new User(i+1, "测试客户：" + i, new Date(), "male");
			list.add(user);
		}
		redisService.add("userList",list,3453535L);
	}
}
