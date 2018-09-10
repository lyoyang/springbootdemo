package com.lyoyang.cache;

import com.lyoyang.cache.dao.DeptMapper;
import com.lyoyang.cache.dao.EmplMapper;
import com.lyoyang.cache.entity.Department;
import com.lyoyang.cache.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCacheApplicationTests {

	@Autowired
	private EmplMapper emplMapper;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private DeptMapper deptMapper;

//	@Autowired
//	private RedisTemplate myRedisTemplate;
	@Test
	public void contextLoads() {
//		Employee empl = emplMapper.getEmplById(1);
//		System.out.println(empl);
		Department dept = deptMapper.getDeptById(1);
		System.out.println(dept);
	}

	@Test
	public void test_redis() {
//		stringRedisTemplate.opsForValue().set("name","jim");
		Employee empl = emplMapper.getEmplById(1);
//		redisTemplate.opsForValue().set("empl",empl);
//		myRedisTemplate.opsForValue().set("empl",empl);
//		Object emplll = myRedisTemplate.opsForValue().get("empl");
//		System.out.println(emplll);
	}
}
