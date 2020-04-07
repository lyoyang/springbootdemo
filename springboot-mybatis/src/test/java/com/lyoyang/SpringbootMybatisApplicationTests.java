package com.lyoyang;

import com.lyoyang.entity.*;
import com.lyoyang.mapper.*;
import com.lyoyang.utils.AESUtil;
import com.lyoyang.utils.DateUtil;
import org.apache.catalina.security.SecurityUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class SpringbootMybatisApplicationTests {

	private static final Logger LOG = LoggerFactory.getLogger(SpringbootMybatisApplicationTests.class);
	@Autowired
	private DataSource dataSource;

	@Autowired
	private EmployeeMapper employeeMapper;

	@Autowired
	private DepartmentMapper departmentMapper;

	@Autowired
	private StudentMapper studentMapper;

	@Autowired
	private ChannelFeeConfigMapper channelFeeConfigMapper;

	@Test
	public void contextLoads() throws SQLException {
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		connection.close();
	}


	@Test
	public void test_saveEmploy() {
		Employee employee = new Employee();
		employee.setLastName("bruce");
		employeeMapper.saveEmployee(employee);
		System.out.println(employee.getId());
	}

	@Test
	public void test_saveDeot() {
		Department department = new Department();
		department.setDepartmentName("test");
		departmentMapper.insertDept(department);
		System.out.println(department.getId() + ">>>>>>>");
	}

	@Test
	public void test_batch() {
		int i = studentMapper.updateBatch(getStuList());
		System.out.println(i);
	}

	private List<Student> getStuList() {
		ArrayList<Student> list = new ArrayList<>();
		Student stu = new Student();
		for(int i = 1; i<=3; i++) {
			stu.setId(i);
			stu.setUsername("jim" + i);
			stu.setAge(i);
			list.add(stu);
		}
		return list;
	}

	@Test
	public void testData() {
		ChannelFeeConfig channelFeeConfig = new ChannelFeeConfig();
		channelFeeConfig.setRemark("test");
		channelFeeConfig.setSubMchId("43534534");
		channelFeeConfig.setRouterTypeId("4532");
		channelFeeConfig.setChannelId("456546456");
		channelFeeConfig.setSpMid(null);
		channelFeeConfigMapper.insert(channelFeeConfig);
	}

	private List<ChannelFeeConfig> buildChannelFeeConfig(String spMid) {
		List<ChannelFeeConfig> list = new ArrayList<>();
		for(int i = 2; i<=6; i = i+2) {
			ChannelFeeConfig channelFeeConfig = new ChannelFeeConfig();
			channelFeeConfig.setChannelId("11");
			channelFeeConfig.setSpMid(spMid);
			channelFeeConfig.setSubMchId(spMid);
			channelFeeConfig.setTransType("05");
			channelFeeConfig.setFeeMode("1");
			channelFeeConfig.setRatioValue(new BigDecimal("0.0051"));
			channelFeeConfig.setFeeValue(BigDecimal.ZERO);
			channelFeeConfig.setRateMaxValue(new BigDecimal("1000000"));
			channelFeeConfig.setRateMinValue(BigDecimal.ZERO);
			channelFeeConfig.setMerRefundFee("0");
			channelFeeConfig.setMonthType("0");
			channelFeeConfig.setStatus("0");
			channelFeeConfig.setBeginDate(DateUtil.getDateFromString("2019-01-01 00:00:00", DateUtil.FORMAT_DATETIME));
			channelFeeConfig.setRouterTypeId("5229");
			channelFeeConfig.setRemark("2019-04-22 配置 0.004000");
			channelFeeConfig.setCardType(Integer.toString(i));
			list.add(channelFeeConfig);
		}
		return list;
	}



	private List<String> list = Arrays.asList("0109013604DW2QkxD0VuON2NeE",
			"01090143316q9NsySPQ6kAn21U",
			"010901435541X6zvb3td8awJJG",
			"01090154167L3S0PYoOf9SWo9O",
			"0109015819SqM18YGI2cMXWCz3",
			"0109015918phEO67zci8L2P37v",
			"0109020315yQxK1JP8XDXWnDli",
			"0109040532OFKFXAF8109UbQCn",
			"010904233304HYI9E08Mey7PiO",
			"010904364241VImvyLDcTkdMlQ",
			"0109044023CkFNETRE14kV9l0U",
			"0109044611e80aNxGw8nca6a85",
			"0109052042gc6tSwI10Aug3CW8");

	private Random random = new Random();


	private static final ExecutorService SERVICE = Executors.newFixedThreadPool(100);

	private static final AtomicLong atomic = new AtomicLong(1);

	@Resource
	private AccountMapper accountMapper;

	@Resource
	private AccountIsamMapper accountIsamMapper;

	@Test
	public void makeData() throws InterruptedException {
		for (int i = 1; i <= 2000000; i++) {
			SERVICE.execute(() -> {
				ThreadLocalRandom current = ThreadLocalRandom.current();
//				String passwd = AESUtil.encrypt("", list.get(random.nextInt(13)) + current.nextInt(999999999));
//				Account account = new Account();
//				account.setLevel(Integer.toString(random.nextInt(12)));
//				account.setBalance(new BigDecimal(random.nextDouble()));
//				account.setName("acc" + atomic.getAndIncrement());
//				account.setPasswd(passwd);
				AccountIsam account = new AccountIsam();
				account.setLevel(Integer.toString(random.nextInt(12)));
				account.setBalance(new BigDecimal(random.nextDouble()));
				account.setName("acc");
				account.setPasswd("passwd");
				LOG.info("添加数据，name=" + account.getName());
//				accountMapper.insertSelective(account);
				accountIsamMapper.insertSelective(account);
			});
		}
		Thread.currentThread().join();
		LOG.info("添加完成");
	}

	@Resource
	private CalculationUnStatisticalMapper calculationUnStatisticalMapper;

	@Test
	public void calcIncome() throws InterruptedException {
		CalculationUnStatisticalExample example = new CalculationUnStatisticalExample();
		example.createCriteria().andAccDateEqualTo("2020-03-11");
		List<CalculationUnStatistical> unStatisticals = calculationUnStatisticalMapper.selectByExample(example);
		if (!CollectionUtils.isEmpty(unStatisticals)) {
			for (CalculationUnStatistical unStatistical : unStatisticals) {
				SERVICE.execute(new CalcRunner(unStatistical));
			}
		}

		Thread.currentThread().join();
		LOG.info("计算完成");
	}

	class CalcRunner implements Runnable {

		private CalculationUnStatistical calculationUnStatistical;

		private BigDecimal feeRatio = new BigDecimal("0.008");
		private BigDecimal ipaynowCostRatio = new BigDecimal("0.0063");
		private BigDecimal ksCostRatio = new BigDecimal("0.006");

		public CalcRunner(CalculationUnStatistical calculationUnStatistical) {
			this.calculationUnStatistical = calculationUnStatistical;
		}

		@Override
		public void run() {
			LOG.info("计算收益，transId=" + calculationUnStatistical.getTransId());
			BigDecimal amount = calculationUnStatistical.getAmount();
			//手续费(交易金额*手续费率)
			BigDecimal fee = calculationUnStatistical.getFee();
			//商户结算金额(交易金额-手续费)
			BigDecimal settleAmount = calculationUnStatistical.getSettleAmount();
			BigDecimal ksFee = amount.multiply(ksCostRatio).setScale(0, BigDecimal.ROUND_HALF_UP);
			//客商实收金额(交易金额-(交易金额*客商成本))
			BigDecimal ksRealAmount = amount.subtract(ksFee);
			//客商结算金额(客商实收金额-商户结算金额)
			BigDecimal ksSettleAmount = ksRealAmount.subtract(settleAmount);
			// 客商的纯收益 交易金额*（我司成本-客商成本）
//			BigDecimal ksIncomeAmount = calculationUnStatistical.getSpFee().subtract(ksFee);
			BigDecimal ksIncomeAmount = amount.multiply((ipaynowCostRatio.subtract(ksCostRatio))).setScale(0, BigDecimal.ROUND_HALF_UP);
			// 我是收益 客商结算金额-客商的纯收益

//        BigDecimal ipaynowIncomeAmount = ksSettleAmount.subtract(ksIncomeAmount);
			BigDecimal ipaynowIncomeAmount = amount.multiply((feeRatio.subtract(ipaynowCostRatio)))
					.setScale(0, BigDecimal.ROUND_HALF_UP);
			if (ipaynowIncomeAmount.compareTo((ksSettleAmount.subtract(ksIncomeAmount))) <= 0) {
				if ((ipaynowIncomeAmount.add(ksIncomeAmount)).compareTo(ksSettleAmount) != 0) {
					ipaynowIncomeAmount = ksSettleAmount.subtract(ksIncomeAmount);
				}
			} else {
				ipaynowIncomeAmount = ksSettleAmount.subtract(ksIncomeAmount);
			}
			calculationUnStatistical.setIpaynowAmount(ipaynowIncomeAmount);
			calculationUnStatistical.setRemark("update2");
			calculationUnStatisticalMapper.updateByPrimaryKeySelective(calculationUnStatistical);
		}
	}


}
