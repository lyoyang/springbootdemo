package com.lyoyang.rabbitmq;

import com.lyoyang.rabbitmq.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRabbitmqApplicationTests {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private AmqpAdmin amqpAdmin;

	@Test
	public void create_exchange() {
//		创建交换器
//		amqpAdmin.declareExchange(new DirectExchange("admin.exchange"));
//		创建队列
//		amqpAdmin.declareQueue(new Queue("admin.queue",true));
//		绑定
		amqpAdmin.declareBinding(new Binding("admin.queue", Binding.DestinationType.QUEUE, "admin.exchange","admin.haha",null));
	}

	@Test
	public void contextLoads() {

		String exchange = "exchange.direct";
		String routeKey = "atguigu.news";
		String message = "this is a news hello";
		Message msg = new Message(message.getBytes(),new MessageProperties());
		rabbitTemplate.send(exchange,routeKey,msg);
	}

	@Test
	public void test_obj() {

		String exchange = "exchange.direct";
		String routeKey = "atguigu";
		User user = new User(1, "jim", "male");
		rabbitTemplate.convertAndSend(exchange,routeKey,user);
	}

	@Test
	public void test_get() {
		String routeKey = "atguigu";
		Object o = rabbitTemplate.receiveAndConvert(routeKey);
		System.out.println(o.getClass());
		System.out.println(o + "----->");
	}
	@Test
	public void test_broadcast() {
		String exchange = "exchange.fanout";
		String routeKey = "atguigu";
		String message = "这是一条广播消息";
		Message msg = new Message(message.getBytes(),new MessageProperties());
		rabbitTemplate.send(exchange,routeKey,msg);
	}

}
