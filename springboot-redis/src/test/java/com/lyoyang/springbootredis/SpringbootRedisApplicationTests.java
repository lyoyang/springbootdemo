package com.lyoyang.springbootredis;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.lyoyang.springbootredis.entity.FeeConfig;
import com.lyoyang.springbootredis.entity.User;
import com.lyoyang.springbootredis.service.RedisService;
import org.apache.commons.lang.StringUtils;
import org.assertj.core.util.DateUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

	@Autowired
	private RedisService redisService;

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


	class MyThread implements Runnable {
		private static final String KEY = "MCH_FEE";
		private String key;
		private long expireTime;
		private int times;
		private long sleepTime;

        public MyThread(String key, long expireTime, int times, long sleepTime) {
            this.key = key;
            this.expireTime = expireTime;
            this.times = times;
            this.sleepTime = sleepTime;
        }

        @Override
		public void run() {
			boolean lock = redisService.lock(KEY, expireTime, times, sleepTime);
			if(lock) {
				System.out.println(Thread.currentThread() + "获得锁");
			}
		}
	}

	@Test
	public void testLock() {
		String subKey = "mch_fee";
		FeeConfig feeConfig = new FeeConfig();
		feeConfig.setMchId("0000566554");
		feeConfig.setChannelId("12");
		feeConfig.setDeviceId("0600");
		feeConfig.setTransType("05");
		feeConfig.setRatioValue(new BigDecimal("433"));
		feeConfig.setCardType("01");
		feeConfig.setBelongBank("01");
		feeConfig.setDeviceType("02");
		String key = buildMchFeeKey(feeConfig);
		FeeConfig queryData = (FeeConfig) redisService.get(key, subKey);
		if (queryData == null) {
			redisService.putObject(key, subKey, feeConfig, 10);
		}
	}



	private String buildMchFeeKey(FeeConfig param) {
		StringBuilder key = new StringBuilder();
		if (StringUtils.isNotEmpty(param.getMchId())) {
			key.append(param.getMchId());
		}
		if (StringUtils.isNotEmpty(param.getChannelId())) {
			key.append(param.getChannelId());
		}
		if (StringUtils.isNotEmpty(param.getDeviceId())) {
			key.append(param.getDeviceId());
		}
//		if (StringUtils.isNotEmpty(param.getSubDeviceId())) {
//			key.append(param.getSubDeviceId());
//		}
		if (StringUtils.isNotEmpty(param.getTransType())) {
			key.append(param.getTransType());
		}
		if (StringUtils.isNotEmpty(param.getCardType())) {
			key.append(param.getCardType());
		}
		if (StringUtils.isNotEmpty(param.getBelongBank())) {
			key.append(param.getBelongBank());
		}
		if (StringUtils.isNotEmpty(param.getCardholderProperty())) {
			key.append(param.getCardholderProperty());
		}
		key.append("mchFee");
		return key.toString();
	}


}
