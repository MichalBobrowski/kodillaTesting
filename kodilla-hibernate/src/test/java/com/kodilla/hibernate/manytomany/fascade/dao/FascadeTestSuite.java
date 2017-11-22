package com.kodilla.hibernate.manytomany.fascade.dao;


import com.kodilla.hibernate.company.Employee;
import com.kodilla.hibernate.manytomany.fascade.*;
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
public class FascadeTestSuite {

    @Autowired
    private ManyToManyFascade fascade;

    @Autowired
    private CompanyEmployeeDataService companyEmployeeDataService;

    @Test
    public void searchCompanyForSubStringTest() {
        //given
        CompanyDto company1 = new CompanyDto(1, "Firma");
        CompanyDto company2 = new CompanyDto(2, "Birma");
        CompanyDto company3 = new CompanyDto(3, "Korporacja");

        List<CompanyDto> companyDtoList = new ArrayList<>();

        companyDtoList.add(company1);
        companyDtoList.add(company2);
        companyDtoList.add(company3);

        companyEmployeeDataService.setCompanyDtoList(companyDtoList);

        //when & then
        try {
            List<CompanyDto> result = fascade.searchCompanyForSubString("irm");
            Assert.assertEquals(2, result.size());
        } catch (SearchException e) {
        }
    }

    @Test
    public void searchEmployeeForSubStringTest(){
        //given
        EmployeeDto employee1 = new EmployeeDto(1, "name1", "Januszowski" );
        EmployeeDto employee2 = new EmployeeDto(2, "name2", "Puszowski" );
        EmployeeDto employee3 = new EmployeeDto(1, "name3", "Inny" );

        List<EmployeeDto> employeeDtoList = new ArrayList<>();

        employeeDtoList.add(employee1);
        employeeDtoList.add(employee2);
        employeeDtoList.add(employee3);

        companyEmployeeDataService.setEmployeeDtoList(employeeDtoList);

        //when & then
        try{
            List<EmployeeDto> result = fascade.searchEmployeeForSubString("usz");
            Assert.assertEquals(2, result.size());
        }catch (SearchException e){}
    }
}
