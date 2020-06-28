package com.lyoyang;

import com.lyoyang.entity.Order;
import com.lyoyang.producer.OrderProducer;
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

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private AmqpAdmin amqpAdmin;

	@Autowired
	private OrderProducer orderProducer;



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


	@Test
	public void sendMsg() {
		String msg = "hello, a simple msg test";
		orderProducer.send(msg, null);
	}

	@Test
	public void sendOrder() {

		Order order = Order.builder().transId("34354356346576575675")
				.accDate("2020-06-25")
				.fee(new BigDecimal("23.45")).build();

		orderProducer.sendOrder(order);
	}

}
