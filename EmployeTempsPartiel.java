public class EmployeTempsPartiel extends Employe {
	private double montant_heur;
	final int heur=35;

	public EmployeTempsPartiel(String nom,String fonction ,double montant_heur){
		super(nom,fonction);
		this.montant_heur=montant_heur;}

 public double getMontant_heur(){
	 return montant_heur;
 }
 public void setMontant_heur(double montant_heur){
	 this.montant_heur=montant_heur;
 }
 public double CalculPaie(){
	 setSalaire(montant_heur*heur);
	 return getSalaire();
 }
}
