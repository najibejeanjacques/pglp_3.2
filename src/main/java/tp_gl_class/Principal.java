package tp_gl_class;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployerInitial A = new EmployerInitial();
		EmployerAncien B = new EmployerAncien(23);
		Vendeur C = new Vendeur(10, 2500.34);
		Manager D = new Manager(100);
		double salTotal;
		
		salTotal = A.calculSalaire()+B.calculSalaire()+C.calculSalaire()+D.calculSalaire();
		System.out.println("Le salaire total de l'entreprise vaut: "+salTotal);
		
	}

}
