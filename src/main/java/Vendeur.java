public class Vendeur extends Employer {
  
  private int commission;
  
  public Vendeur()
  {
    this.salaire= 1500;
    this.anciennete = 1;
  }
  
  public void add_anciennete()
  {
    this.anciennete ++;
  }
  
  public void calcul_salaire() {
    this.salaire += 20*this.anciennete + this.commission;
  }
}
