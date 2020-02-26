import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendeurTest {
  
  @Test
  public void add_anciennete() {
    Vendeur v = new Vendeur();
    v.add_anciennete();
    assertEquals(1, v.anciennete);
  }
  
  @Test
  public void calcul_salaire() {
    Vendeur v = new Vendeur();
    assertEquals(1500, v.calcul_salaire());
    v.add_anciennete();
    assertEquals(1520, v.calcul_salaire());
  }
  
  @Test
  public void verifCommission()
  {
    Vendeur v = new Vendeur();
    v.setCommission(50);
    assertEquals(1550, v.calcul_salaire());
  }
}