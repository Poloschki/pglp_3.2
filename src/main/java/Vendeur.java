public class Vendeur extends Employer {
  
  private int commission;
  
  public Vendeur()
  {
    this.commission = 0;
    listEmployer.add(this.calcul_salaire());
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
  public int calcul_salaire() {
    return super.calcul_salaire() + this.commission;
  }
}
