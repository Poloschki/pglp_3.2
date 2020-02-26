import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployerTest {
  
  @Test
  public void getSalaire() {
    Employer employer = new Employer();
    assertEquals(1500, employer.calcul_salaire());
  }
  
  @Test
  public void add_anciennete() {
    Employer employer = new Employer();
    employer.add_anciennete();
    assertEquals(1, employer.getAnciennete());
  }
  
  @Test
  public void test_calcul() {
    Employer employer = new Employer();
    assertEquals(1500, employer.calcul_salaire());
    employer.add_anciennete();
    assertEquals(1520, employer.calcul_salaire());
  }
}