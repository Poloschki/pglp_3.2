public class Manager extends Employer {
  
  private int manage;
  
  public Manager()
  {
    this.manage = 0;
  }
  
  public void add_employer(int nb) {
    this.manage += nb;
  }
  
  public int getManage() {
    return this.manage;
  }
  
  public void setManage(int manage) {
    this.manage = manage;
  }
  
  @Override
  public int calcul_salaire() {
    return super.calcul_salaire() + 100 * this.manage;
  }
}

