package com.codeclan.example.employee_data;

import com.codeclan.example.employee_data.models.Department;
import com.codeclan.example.employee_data.models.Employee;
import com.codeclan.example.employee_data.models.Project;
import com.codeclan.example.employee_data.repositories.DepartmentRepository;
import com.codeclan.example.employee_data.repositories.EmployeeRepository;
import com.codeclan.example.employee_data.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeDataApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee() {
		Department department1 = new Department("Sales");
		departmentRepository.save(department1);
		Employee employee1 = new Employee("Betty", 50, 12345, "betty@gmail.com", department1);
		employeeRepository.save(employee1);
		Project project1 = new Project("Clean Office", 7);
		projectRepository.save(project1);
		project1.addEmployee(employee1);
		projectRepository.save(project1);
	}

}
