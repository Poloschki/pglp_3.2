import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployerTest {
  
  @Test
  public void getSalaire() {
    Vendeur v = new Vendeur();
    assertEquals(1500,v.getSalaire());
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