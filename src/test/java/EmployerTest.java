import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployerTest {
  
  @Test
  public void getSalaire() {
    Vendeur v = new Vendeur();
    assertEquals(1500, v.calcul_salaire());
  }
  
  @Test
  public void calcul_prime() {
  
  }
  
  @Test
  public void setSalaire() {
  }
  
  @Test
  public void add_anciennete() {
  }
}