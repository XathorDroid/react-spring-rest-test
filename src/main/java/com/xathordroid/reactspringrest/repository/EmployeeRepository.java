package com.xathordroid.reactspringrest.repository;

import com.xathordroid.reactspringrest.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {}
