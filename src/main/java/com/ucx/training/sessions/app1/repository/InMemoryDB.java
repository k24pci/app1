package com.ucx.training.sessions.app1.repository;

import com.ucx.training.sessions.app1.businesslogic.Company;

public interface InMemoryDB {
    void createOrUpdate(Company company);
    Company finById(Integer id);
    void remove(Integer id);
    void removeAll();
}
