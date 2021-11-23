package com.codeclan.example.employee_data;

import com.codeclan.example.employee_data.models.Employee;
import com.codeclan.example.employee_data.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeDataApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee() {
		Employee employee1 = new Employee("Betty", 50, 12345, "betty@gmail.com");
		employeeRepository.save(employee1);
	}

}
