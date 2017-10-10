package com.kodilla.hibernate.company;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamedNativeQuery(
        name = "Company.retriveCompanyWithNameStarting",
        query = "SELECT * FROM COMPANIES WHERE SUBSTRING(COMPANY_NAME FROM 1 FOR 3) = :NAMECODE",
        resultClass = Company.class
)
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
