package com.ucx.training.sessions.app1.repository;

import com.ucx.training.sessions.app1.businesslogic.Company;

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
        if (company == null) throw new RuntimeException("Company cannot be null!");
        storage.put(company.getId(), company);
    }

    public Company finById(Integer id){
        if (id == null) throw new RuntimeException("ID cannot be null!");
        return storage.get(id);
    }

    public void remove(Integer id){
        if (id == null) throw new RuntimeException("Id can not be null!");
        storage.remove(id);
    }

    public void removeAll(){
        storage.clear();
    }
}
