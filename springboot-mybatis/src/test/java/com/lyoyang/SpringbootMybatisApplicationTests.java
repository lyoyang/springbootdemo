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

}
