package com.ucx.training.sessions.app1;

import com.ucx.training.sessions.app1.businesslogic.Employee;
import com.ucx.training.sessions.app1.businesslogic.Position;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void testCalculateWage(){
        Employee mockEmployee = MockData.getEmployee(Position.PM);
        assertEquals(Double.valueOf(100),Double.valueOf(mockEmployee.calculateWage(10)));

    }
}
