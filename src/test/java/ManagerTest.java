import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Andy", "NI000000001", 30000.00, "Codeclan");

    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2000.00);
        assertEquals(32000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.00,manager.payBonus(), 0.01 );
    }

}
