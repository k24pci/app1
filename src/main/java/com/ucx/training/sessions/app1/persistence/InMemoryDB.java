package com.ucx.training.sessions.app1.persistence;

import com.ucx.training.sessions.app1.businesslogic.Company;

public interface InMemoryDB {
    void create(Company company);
    Company finById(Integer id);
}
