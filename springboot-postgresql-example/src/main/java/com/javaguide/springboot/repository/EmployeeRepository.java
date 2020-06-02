package com.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaguide.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	

}
