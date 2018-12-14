package com.lyoyang;

import com.lyoyang.entity.Department;
import com.lyoyang.entity.Employee;
import com.lyoyang.entity.Student;
import com.lyoyang.mapper.DepartmentMapper;
import com.lyoyang.mapper.EmployeeMapper;
import com.lyoyang.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private EmployeeMapper employeeMapper;

	@Autowired
	private DepartmentMapper departmentMapper;

	@Autowired
	private StudentMapper studentMapper;
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

}
