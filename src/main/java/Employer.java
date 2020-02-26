public abstract class Employer {
  
  public int salaire;
  public int anciennete;
  
  public int getSalaire() {
    return salaire;
  }
  
  public abstract void calcul_salaire();
  
  
  public void add_anciennete() {
    this.anciennete++;
  }
  
  public void Affiche_Salaire()
  {
    System.out.println(this.getSalaire());
  }
  
  
/*  public static void main(String[] args) {
    Travailleur t= new Travailleur();
    Vendeur v = new Vendeur();
    
    t.add_anciennete();
    System.out.println(t.getSalaire());
    System.out.println(v.getSalaire());
    
  }
  */
}