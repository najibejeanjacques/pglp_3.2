package tp_gl_class;

public class Vendeur extends Employer {
	private String nom;
    private String adress;
	private int nbAnneeAncien;
	private double commission;
	
	public Vendeur(int nbAnnee, double commission)
	{
		this.nbAnneeAncien = nbAnnee;
		this.commission    = commission;
	}

	@Override
	public double calculSalaire() {
		// TODO Auto-generated method stub
		return salaireDeBase+20*nbAnneeAncien+commission;
	}
	
	
}
