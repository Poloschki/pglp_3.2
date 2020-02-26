import java.util.ArrayList;

public  class Employer {
  
  public int salaire;
  public int anciennete;
  public ArrayList<Integer> listEmployer = new ArrayList<>();
  
  
  public int getSalaire() {
    this.calcul_salaire();
    return salaire;
  }
  // TODO: faire une fonction non abstraite
  public void calcul_salaire()
  {
    this.salaire = 1500 + 20*this.anciennete;
  }
  
  
  public void add_anciennete() {
    this.anciennete++;
  }
  
  public void Affiche_Salaire()
  {
    System.out.println(this.getSalaire());
  }
  
  public void salaire_Total()
  { int total =0;
    for (int i = 0; i< listEmployer.size() ; i++)
    {
      total = listEmployer.get(i);
    }
    System.out.println(total);
  }
  
}