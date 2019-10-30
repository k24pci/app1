package com.ucx.training.sessions.app1.repository;

import com.ucx.training.sessions.app1.businesslogic.Company;
import com.ucx.training.sessions.app1.exception.CompanyNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDBImpl implements InMemoryDB
{
    private Map<Integer, Company> storage;

    public InMemoryDBImpl(){
        // Initialize storage
        storage = new HashMap<>();
    }

    public void createOrUpdate(Company company){
        if (company == null) throw new IllegalArgumentException("Company cannot be null!");
        storage.put(company.getId(), company);
    }

    public Company finById(Integer id) throws CompanyNotFoundException{
        if (id == null) throw new IllegalArgumentException("ID cannot be null!");
        Company foundCompany = storage.get(id);
        if (foundCompany == null) throw new CompanyNotFoundException("Company cannot be found!");
        return foundCompany;
    }

    public void remove(Integer id){
        if (id == null) throw new IllegalArgumentException("Id can not be null!");
        storage.remove(id);
    }

    public void removeAll(){
        storage.clear();
    }
}
