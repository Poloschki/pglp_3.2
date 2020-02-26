public class Vendeur extends Employer {
  
  private int commission;
  
  public Vendeur()
  {
    this.salaire= 1500;
    this.anciennete = 1;
    this.commission = 0;
    listEmployer.add(this.getSalaire());
  }
  
  public void add_anciennete()
  {
    this.anciennete ++;
  }
  public void setCommission(int value)
  {
    this.commission += value;
  }
  
  @Override
  public void calcul_salaire() {
    this.salaire = super.salaire + this.commission;
  }
}
