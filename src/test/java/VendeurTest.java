import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendeurTest {
  
  @Test
  public void add_anciennete() {
    Vendeur v = new Vendeur();
    v.add_anciennete();
    assertEquals(2,v.anciennete);
  }
  
  @Test
  public void calcul_salaire() {
    Vendeur v = new Vendeur();
    assertEquals(1500,v.getSalaire());
    v.add_anciennete();
    v.calcul_salaire();
    assertEquals(1540,v.getSalaire());
  }
  
  @Test
  public void verifCommission()
  {
    Vendeur v = new Vendeur();
    v.setCommission(50);
    assertEquals(1570,v.getSalaire());
    assertEquals(1570,v.getSalaire());
  }
}