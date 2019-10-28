package com.ucx.training.sessions.app1;

import com.ucx.training.sessions.app1.businesslogic.Company;
import com.ucx.training.sessions.app1.repository.InMemoryDB;
import com.ucx.training.sessions.app1.repository.InMemoryDBImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryDBImplTest
{
    @Test
    public void testCreateOrUpdate(){
        Company mockCompany = createMockCompany();
        assertNotNull(mockCompany);
        assertEquals(3, mockCompany.getEmployees().size());
        removeCompany(mockCompany);
    }

    @Test
    public void testRemove(){
        Company mockCompany = createMockCompany();
        InMemoryDB db = PersistenceFactory.getInMemoryDBInstance();
        db.remove(mockCompany.getId());
        Company foundCompany = db.finById(mockCompany.getId());
        assertNull(foundCompany);
        removeCompany(mockCompany);
    }

    @Test(expected = RuntimeException.class)
    public void testCreate_whenCompanyIsNull(){
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.createOrUpdate(null);
    }

    @Test(expected = RuntimeException.class)
    public void testFind_whenIdIsNull(){
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.finById(null);
    }

    private Company createMockCompany(){
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
