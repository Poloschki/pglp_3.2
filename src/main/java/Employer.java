import java.util.ArrayList;

public class Employer {
  
  public int salaire = 1500;
  public int anciennete = 0;
  public ArrayList<Integer> listEmployer = new ArrayList<>();
  
  
  public int getAnciennete() {
    return this.anciennete;
  }
  
  public void add_anciennete() {
    this.anciennete++;
  }
  
  public int calcul_salaire() {
    this.salaire = 1500 + 20 * this.getAnciennete();
    return this.salaire;
  }
  
  public void Affiche_Salaire() {
    System.out.println(this.calcul_salaire());
  }
  
  public void salaire_Total() {
    int total = 0;
    for (int i = 0; i < listEmployer.size(); i++) {
      total = listEmployer.get(i);
    }
    System.out.println(total);
  }
  
}