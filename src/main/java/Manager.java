public class Manager extends Employer {
  public Manager()
  {
    this.salaire = 1500;
    this.anciennete=1;
  }
  public void calcul_salaire() {
    this.salaire += 20*this.anciennete;
  }
}
