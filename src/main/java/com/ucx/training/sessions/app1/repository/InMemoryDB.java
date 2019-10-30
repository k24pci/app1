package com.ucx.training.sessions.app1.repository;

import com.ucx.training.sessions.app1.businesslogic.Company;
import com.ucx.training.sessions.app1.exception.CompanyNotFoundException;

public interface InMemoryDB {
    void createOrUpdate(Company company);
    Company finById(Integer id) throws CompanyNotFoundException;
    void remove(Integer id);
    void removeAll();
}
