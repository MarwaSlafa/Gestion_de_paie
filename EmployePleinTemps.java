public class EmployePleinTemps extends Employe {
	private double montant;
	private double prime;

	public EmployePleinTemps(String nom,String fonction,double montant,double prime){
		super(nom,fonction);
		this.montant=montant;
		this.prime=prime;
	}
	public double getMontant(){
		return montant;
	}
	public void setMontant(double montant){
		this.montant=montant;
	}
	public double CalculPaie(){
		setSalaire(montant*4+prime);
		return getSalaire();
	}

}
