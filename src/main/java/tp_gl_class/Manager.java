package tp_gl_class;

public class Manager extends Employer {
	private String nom;
    private String adress;
    private int nbSubordonne;
    
    public Manager(int nbSub) {
		// TODO Auto-generated constructor stub
    	this.nbSubordonne = nbSub;
	}
	@Override
	public double calculSalaire() {
		// TODO Auto-generated method stub
		return salaireDeBase+100*nbSubordonne;
	}
    

}
