package com.ucx.training.sessions.app1;

import com.ucx.training.sessions.app1.businesslogic.*;
import com.ucx.training.sessions.app1.repository.InMemoryDB;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Address address1 = new Address("Kosovo", "Kosovo", "Prishtina", "1st street", 10000);
        Employee employee1 = new Employee("Steve", "Bald", Position.QA, Gender.MALE, address1);
        employees.add(employee1);

        Address address2 = new Address("Kosovo", "Kosovo", "Prizren", "2st street", 10000);
        Employee employee2 = new Employee("Lady", "Woman", Position.PROGRAMMER, Gender.FEMALE, address2);
        employees.add(employee2);

        Address address3 = new Address("Kosovo", "Kosovo", "Prishtina", "3st street", 10000);
        Employee employee3 = new Employee("Mary", "Jones", Position.PM, Gender.FEMALE, address3);
        employees.add(employee3);
        System.out.println(employee3.calculateWage(3));

        Company company = new Company(1, "Best Company", employees);
        //Save Company to InMemoryDB
        InMemoryDB db = PersistenceFactory.getInMemoryDBInstance();
        db.createOrUpdate(company);
        //Retrieve a company from DB
        Company foundCompany = db.finById(1);
        System.out.println("Company ID: " + foundCompany.getId() + " Company Name: " + foundCompany.getName() + " Nr of employees: " + foundCompany.getEmployees().size());

        db.remove(1);
        Company foundCompany1 = db.finById(1);
        System.out.println(foundCompany1);

    }
}
