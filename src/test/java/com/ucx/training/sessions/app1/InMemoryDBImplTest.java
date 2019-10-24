package com.ucx.training.sessions.app1;

import com.ucx.training.sessions.app1.businesslogic.Company;
import com.ucx.training.sessions.app1.persistence.InMemoryDBImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryDBImplTest
{
    @Test
    public void testCreate(){
        Company company = MockData.getCompany();
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.create(company);
        Company foundCompany = db.finById(company.getId());
        assertNotNull(foundCompany);
        assertEquals(company.getId(), foundCompany.getId());
        assertEquals(3, foundCompany.getEmployees().size());
    }

    @Test(expected = RuntimeException.class)
    public void testCreate_whenCompanyIsNull(){
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.create(null);
    }

    @Test(expected = RuntimeException.class)
    public void testFind_whenIdIsNull(){
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.finById(null);
    }
}
