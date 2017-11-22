package com.kodilla.hibernate.manytomany.fascade;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyEmployeeDataService {

    private List<CompanyDto> companyDtoList;
    private List<EmployeeDto> employeeDtoList;

    public CompanyEmployeeDataService(){
    }

    public List<CompanyDto> getCompanyDtoList() {
        return companyDtoList;
    }

    public List<EmployeeDto> getEmployeeDtoList() {
        return employeeDtoList;
    }

    public void setCompanyDtoList(List<CompanyDto> companyDtoList) {
        this.companyDtoList = companyDtoList;
    }

    public void setEmployeeDtoList(List<EmployeeDto> employeeDtoList) {
        this.employeeDtoList = employeeDtoList;
    }
}
