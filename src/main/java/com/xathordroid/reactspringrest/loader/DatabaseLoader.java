package com.xathordroid.reactspringrest.loader;

import com.xathordroid.reactspringrest.entity.Employee;
import com.xathordroid.reactspringrest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    
    private final EmployeeRepository repository;
    
    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("Bilbo", "Baggins", "burglar"));
        this.repository.save(new Employee("Sandra", "Tests", "burglar"));
        this.repository.save(new Employee("Another", "Bolson", "burglar"));
        this.repository.save(new Employee("Quinto", "Usuario", "burglar"));
    }
}
