package com.kodilla.hibernate.company.dao;

import com.kodilla.hibernate.company.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> retriveEmployeeWithLastname(@Param("LASTNAME") String name);

}
