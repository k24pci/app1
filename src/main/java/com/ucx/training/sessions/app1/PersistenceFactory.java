package com.ucx.training.sessions.app1;

import com.ucx.training.sessions.app1.repository.InMemoryDB;
import com.ucx.training.sessions.app1.repository.InMemoryDBImpl;

public class PersistenceFactory {
    public static InMemoryDB getInMemoryDBInstance(){
        return new InMemoryDBImpl();
    }
}
