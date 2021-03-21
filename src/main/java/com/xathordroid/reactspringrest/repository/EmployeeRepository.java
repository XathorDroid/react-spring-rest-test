package com.xathordroid.reactspringrest.repository;

import com.xathordroid.reactspringrest.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {}
