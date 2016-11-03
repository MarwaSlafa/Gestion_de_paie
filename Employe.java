public class Employe {
	private String nom;
	private String fonction;
	private double salaire;

	public Employe(String nom,String fonction){
		this.nom=nom;
		this.fonction=fonction;
	}
	public String getNom(){
		return this	.nom;}

	public String getFonction(){
		return this.fonction;
	}
	public double getSalaire(){
		return this.salaire;
	}
   public void setSalaire(double salaire){
	   this.salaire=salaire;
   }
   public void ChaquePaie(){
	   System.out.println("payer à l'ordre de " +nom+ "("+fonction+")***"+salaire);
   }
   public double CalculPaie(){
	   return salaire;
   }
}
