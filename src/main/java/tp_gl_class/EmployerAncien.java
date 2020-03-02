package tp_gl_class;

public class EmployerAncien extends Employer {

	private String nom;
    private String adress;
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
