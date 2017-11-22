package com.kodilla.hibernate.manytomany.fascade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.springframework.data.repository.query.parser.Part.Type.LIKE;

@Service
public class ManyToManyFascade {

    @Autowired
    private CompanyEmployeeDataService dataService;

    public ManyToManyFascade() {
    }


    public CompanyEmployeeDataService getDataService() {
        return dataService;
    }

    public List<CompanyDto> searchCompanyForSubString (String partOfCompanyName) throws SearchException{

        List<CompanyDto> result = dataService.getCompanyDtoList().stream()
                .filter(a -> a.getName().contains(partOfCompanyName))
                .collect(Collectors.toList());
        if(result.size() != 0) return result;
        else{
            throw new SearchException(SearchException.ERROR_NO_COMPANY);
        }
    }

    public List<EmployeeDto> searchEmployeeForSubString (String partOfEmployeeName) throws SearchException{
        List<EmployeeDto> result = dataService.getEmployeeDtoList().stream()
                .filter(a -> a.getLastname().contains(partOfEmployeeName))
                .collect(Collectors.toList());
        if (result.size() != 0) return result;
        else throw new SearchException(SearchException.ERROR_NO_EMPLOYEE);
    }

}
