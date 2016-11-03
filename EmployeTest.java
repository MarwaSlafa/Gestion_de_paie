public class EmployeTest {

	public static void main(String[] args) {
		Employe []tab=new Employe[3];

 tab[0]=new Employe("Salim","PDG");
  tab[1]=new EmployeTempsPartiel("Halima ","Secrétaire",2000);
 tab[2] =new EmployePleinTemps("AbdlHalim","Agent de sécurité",10000.0,8000.0);

 tab[0].setSalaire(100000.0);
 tab[0].ChaquePaie();
 ((EmployeTempsPartiel) tab[1]).CalculPaie();
 tab[1].ChaquePaie();
 ((EmployePleinTemps) tab[2]).CalculPaie();
 tab[2].ChaquePaie();




	}

}
