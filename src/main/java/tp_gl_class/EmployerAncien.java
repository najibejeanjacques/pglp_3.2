package tp_gl_class;

public class EmployerAncien extends Employer {

	private String nom ="Ouedraogo";
    private String adresse = "Rue de garches";
	private int nbAnneeAncien;
	
	public EmployerAncien(int nbAnnee) {
		this.nbAnneeAncien = nbAnnee;
		// TODO Auto-generated constructor stub
	}
    
	@Override
	public double calculSalaire() {
		// TODO Auto-generated method stub
		return salaireDeBase+nbAnneeAncien*20;
	}

	
}
