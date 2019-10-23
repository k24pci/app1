package com.ucx.training.sessions.app1;

import com.ucx.training.sessions.app1.businesslogic.Company;
import com.ucx.training.sessions.app1.persistence.InMemoryDB;
import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryDBTest {
    @Test
    public void testCreate(){
        Company company = MockData.getCompany();
        InMemoryDB db = new InMemoryDB();
        db.create(company);
        Company foundCompany = db.finById(company.getId());
        assertNotNull(foundCompany);
        assertEquals(company.getId(), foundCompany.getId());
        assertEquals(3, foundCompany.getEmployees().size());
    }

    @Test(expected = RuntimeException.class)
    public void testCreate_whenCompanyIsNull(){
        InMemoryDB db = new InMemoryDB();
        db.create(null);
    }

    @Test(expected = RuntimeException.class)
    public void testFind_whenIdIsNull(){
        InMemoryDB db = new InMemoryDB();
        db.finById(null);
    }
}
