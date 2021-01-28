package com.lyoyang;

import com.lyoyang.entity.ChannelFeeConfig;
import com.lyoyang.entity.Department;
import com.lyoyang.entity.Employee;
import com.lyoyang.entity.Student;
import com.lyoyang.mapper.ChannelFeeConfigMapper;
import com.lyoyang.mapper.DepartmentMapper;
import com.lyoyang.mapper.EmployeeMapper;
import com.lyoyang.mapper.StudentMapper;
import com.lyoyang.service.CustomService;
import com.lyoyang.service.StudentService;
import com.lyoyang.utils.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
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

	@Resource
	private CustomService customService;

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

	@Resource
	private StudentService studentService;

	@Test
	public void testTransactional() {
		Student student = new Student();
		student.setUsername("loance");
		student.setAge(23);
		student.setGender("22");
		studentService.saveStudent(student);
	}


	@Test
	public void testTra() throws InterruptedException {
		customService.saveStudent();
		Thread.currentThread().join();



	}


}
