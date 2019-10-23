package com.ucx.training.sessions.app1.persistence;

import com.ucx.training.sessions.app1.businesslogic.Company;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDB {
    private Map<Integer, Company> storage;

    public InMemoryDB(){
        // Initialize storage
        storage = new HashMap<>();
    }

    public void create(Company company){
        if (company == null) throw new RuntimeException("Company cannot be null!");
        storage.put(company.getId(), company);
    }

    public Company finById(Integer id){
        if (id == null) throw new RuntimeException("ID cannot be null!");
        return storage.get(id);
    }
}
