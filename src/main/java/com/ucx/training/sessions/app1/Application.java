package com.ucx.training.sessions.app1;

import com.ucx.training.sessions.app1.businesslogic.Address;
import com.ucx.training.sessions.app1.businesslogic.Company;
import com.ucx.training.sessions.app1.businesslogic.Employee;
import com.ucx.training.sessions.app1.businesslogic.Gender;
import com.ucx.training.sessions.app1.persistence.InMemoryDB;
import com.ucx.training.sessions.app1.persistence.InMemoryDBImpl;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Address address1 = new Address("Kosovo", "Kosovo", "Prishtina", "1st street", 10000);
        Employee employee1 = new Employee("Steve", "Bald", "QA", Gender.MALE, address1);
        employees.add(employee1);

        Address address2 = new Address("Kosovo", "Kosovo", "Prizren", "2st street", 10000);
        Employee employee2 = new Employee("Lady", "Woman", "HR", Gender.FEMALE, address2);
        employees.add(employee2);

        Address address3 = new Address("Kosovo", "Kosovo", "Prishtina", "3st street", 10000);
        Employee employee3 = new Employee("Mary", "Jones", "Developer", Gender.FEMALE, address3);
        employees.add(employee3);

        Company company = new Company(1, "Best Company", employees);
        //Save Company to InMemoryDB
        InMemoryDB db = PersistenceFactory.getInMemoryDBInstance();
        db.create(company);
        //Retrieve a company from DB
        Company foundCompany = db.finById(1);
        System.out.println("Company ID: " + foundCompany.getId() + " Company Name: " + foundCompany.getName() + " Nr of employees: " + foundCompany.getEmployees().size());
    }
}
