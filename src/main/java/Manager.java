public class Manager extends Employer {
  
  private int manage = 0;
  
  public Manager()
  {
    this.salaire = 1500;
    this.anciennete=1;
  }
  
  public void add_employer(int nb)
  {
    this.manage += nb;
  }
  
  public void setManage(int manage)
  {
    this.manage = manage;
  }
  @Override
  public void calcul_salaire() {
    this.salaire = super.salaire + 100*this.manage;
  }
}

