package com.ucx.training.sessions.app1.repository;

import com.ucx.training.sessions.app1.MockData;
import com.ucx.training.sessions.app1.PersistenceFactory;
import com.ucx.training.sessions.app1.businesslogic.Company;
import com.ucx.training.sessions.app1.exception.CompanyNotFoundException;
import com.ucx.training.sessions.app1.repository.InMemoryDB;
import com.ucx.training.sessions.app1.repository.InMemoryDBImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryDBImplTest
{
    @Test
    public void testCreateOrUpdate() throws CompanyNotFoundException{
        Company mockCompany = createMockCompany();
        assertNotNull(mockCompany);
        assertEquals(3, mockCompany.getEmployees().size());
        removeCompany(mockCompany);
    }

    @Test(expected = CompanyNotFoundException.class)
    public void testRemove() throws CompanyNotFoundException{
        Company mockCompany = createMockCompany();
        InMemoryDB db = PersistenceFactory.getInMemoryDBInstance();
        db.remove(mockCompany.getId());
        db.finById(mockCompany.getId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate_whenCompanyIsNull(){
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.createOrUpdate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFind_whenIdIsNull() throws CompanyNotFoundException{
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.finById(null);
    }

    private Company createMockCompany() throws CompanyNotFoundException{
        Company company = MockData.getCompany();
        InMemoryDB db = PersistenceFactory.getInMemoryDBInstance();
        db.createOrUpdate(company);
        return db.finById(company.getId());
    }

    private void removeCompany(Company company){
        InMemoryDB db = PersistenceFactory.getInMemoryDBInstance();
        db.remove(company.getId());
    }
}
