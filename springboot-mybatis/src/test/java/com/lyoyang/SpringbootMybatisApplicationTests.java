package com.lyoyang;

import com.lyoyang.entity.ChannelFeeConfig;
import com.lyoyang.entity.Department;
import com.lyoyang.entity.Employee;
import com.lyoyang.entity.Student;
import com.lyoyang.mapper.ChannelFeeConfigMapper;
import com.lyoyang.mapper.DepartmentMapper;
import com.lyoyang.mapper.EmployeeMapper;
import com.lyoyang.mapper.StudentMapper;
import com.lyoyang.utils.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class SpringbootMybatisApplicationTests {

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

		String[] spIds = {"829221872970512",
				"829521256910584",
				"829522256610501",
				"829221772300502",
				"829221772980547",
				"829235358120537",
				"829221772300501",
				"829221772300500",
				"829235172980552",
				"829603058120598",
				"829102350940525",
				"829585270110515",
				"829102682990504",
				"829808282990501",
				"829521773920507",
				"829102682990505",
				"829102248160501",
				"829102647220501",
				"829102647220500",
				"829603053110532",
				"829424279110501",
				"829102673920542",
				"829102682990506",
				"829507173920542",
				"829221672970526",
				"829221672980537",
				"829506182990500",
				"829732182990500",
				"829732282990500",
				"829498982990501",
				"829102682990507",
				"829222873920504",
				"829191882990500",
				"829361973920511",
				"829551673920507",
				"829112870110502",
				"829581773920519",
				"829365582990500",
				"829301682990500",
				"829581582990508",
				"829235182990505",
				"829421182990501",
				"829121973720500",
				"829221773920507",
				"829113373920501",
				"829113682990500",
				"829112982990500",
				"829235482990502",
				"829112773920502",
				"829113782990500",
				"829112782990500",
				"829112782990501",
				"829113182990500",
				"829113873920500",
				"829221879970521",
				"829102673920544",
				"829113282990500",
				"829113482990500",
				"829291173920513",
				"829690582990500",
				"829291573920510",
				"829291273920515",
				"829291182990500",
				"829290782990501",
				"829290859980503",
				"829290459980518",
				"829290473920550",
				"829221758120563",
				"829691173920509",
				"829291773110537",
				"829290173920526",
				"829102248160500",
				"829581882990520",
				"829235358120549",
				"829290673920533",
				"829290673920532",
				"829290673920534",
				"829221772300505",
				"829581873920520",
				"829507173920543",
				"829235158120615",
				"829691173920510",
				"829221680430507",
				"829112872980502"};

		for(String spId : spIds) {
			List<ChannelFeeConfig> channelFeeConfigs = buildChannelFeeConfig(spId);
			for(ChannelFeeConfig channelFeeConfig : channelFeeConfigs) {
				channelFeeConfigMapper.insertSelective(channelFeeConfig);
			}
		}
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

}
