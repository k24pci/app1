package com.ucx.training.sessions.app1;

import com.ucx.training.sessions.app1.businesslogic.*;

import java.util.ArrayList;
import java.util.List;

public class MockData {
    private MockData(){
    }

    public static Company getCompany(){
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

        Company company = new Company(1, "Best Company", employees);

        return company;
    }

    public static Employee getEmployee(Position position){

        Address address3 = new Address("Kosovo", "Kosovo", "Prishtina", "3st street", 10000);
        return new Employee("Mary", "Jones", position, Gender.FEMALE, address3);
    }
}
