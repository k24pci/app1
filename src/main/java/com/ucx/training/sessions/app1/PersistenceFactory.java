package com.ucx.training.sessions.app1;

import com.ucx.training.sessions.app1.persistence.InMemoryDB;
import com.ucx.training.sessions.app1.persistence.InMemoryDBImpl;

public class PersistenceFactory {
    public static InMemoryDB getInMemoryDBInstance(){
        return new InMemoryDBImpl();
    }
}
