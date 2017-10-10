package com.kodilla.hibernate.company.dao;

import com.kodilla.hibernate.company.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompanyDao extends CrudRepository<Company, Integer> {
    @Query(nativeQuery = true)
    List<Company> retriveCompanyWithNameStarting(@Param("NAMECODE")String nameCode);
}
