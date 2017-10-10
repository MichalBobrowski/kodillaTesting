package com.kodilla.hibernate.company.dao;

import com.kodilla.hibernate.company.Company;
import com.kodilla.hibernate.company.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;

    @Test
    public void retriveEmployeeWithLastnameTest(){
        //given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalsyId = lindaKovalsky.getId();

        List<Employee> result = employeeDao.retriveEmployeeWithLastname("Smith");

        //then
        Assert.assertEquals(1, result.size());

        //clean up
        employeeDao.delete(johnSmithId);
        employeeDao.delete(stephanieClarcksonId);
        employeeDao.delete(lindaKovalsyId);
    }

    @Test
    public void retriveCompanyWithNameStarting(){
        //given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //when
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        List<Company> result = new ArrayList<>();
        result = companyDao.retriveCompanyWithNameStarting("gre");

        //then
        Assert.assertEquals(1, result.size());

        //clean up
        result.clear();
        companyDao.delete(softwareMachineId);
        companyDao.delete(dataMaestersId);
        companyDao.delete(greyMatterId);
    }
}
