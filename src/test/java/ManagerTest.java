import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
  
  @Test
  public void add_employer() {
    Manager manager = new Manager();
    manager.add_employer(5);
    assertEquals(5, manager.getManage());
  }
  
  @Test
  public void calcul_salaire() {
    Manager manager = new Manager();
    manager.add_employer(5);
    assertEquals(2000, manager.calcul_salaire());
  }
}