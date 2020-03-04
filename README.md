# pglp_3.2

 1) Proposons une solution respectant OCP:

 -On crée une classe abstraite pour un EmployerInitial qui calcul le salaire d'un d'employé initial
  
      public abstract class Employer 
      {
		private String nom ="Ouedraogo";
		private String adresse = "Rue de garches";
		public abstract double calculSalaire();
      }
 
 -On crée une classe abstraite pour un EmployerInitial qui calcul le salaire pour chaque type d'employé
  
      public class EmployerInitial extends Employer 
      {     	
		private String nom ="Ouedraogo";
		private String adresse = "Rue de garches";
		@Override
		public double calculSalaire() {
		// TODO Auto-generated method stub
			return salaireDeBase;
		}
      }
        
   -On défini la classe qui calcul le salaire d'un employé en fonction de son anciennetté:
   
      public class EmployeAncien extends Employer
      {      
           
	   
		private String nom ="Ouedraogo";
		private String adresse = "Rue de garches";
		private int nbAnneeAncien;
	
		public EmployerAncien(int nbAnnee) {
		this.nbAnneeAncien = nbAnnee;
		// TODO Auto-generated constructor stub
		}

           public double calculSalaire(int nbAnneeAncien)
           {
              return 1500 + 20*nbAnneeAncien;
            }
      }
   
   -On défini la classe qui calcul le salaire d'un vendeur
   
     public class Vendeur extends Employer
      {      
         private String nom ="Ouedraogo";
		private String adresse = "Rue de garches";
		private int nbAnneeAncien;
		private double commission;
		
		public Vendeur(int nbAnnee, double commission)
		{
			this.nbAnneeAncien = nbAnnee;
			this.commission    = commission;
		}
         private double calculSalaire(int nbAnneeAncien, double commission)
        {
          return 1500 + 20*nbAnneeAncien + commission;
        }
      }
   
   
2) Pour le verifier, ajoutons la classe manager:

          public class Manager extends Employer
          {     
		private String nom ="Ouedraogo";
		private String adresse = "Rue de garches";
		private int nbSubordonne;    
		public Manager(int nbSub) {
		// TODO Auto-generated constructor stub
		this.nbSubordonne = nbSub;
	} 

             @Override
             private double SalaireTotal(EmployeAncien B,int nbSubordonee)
             {
                return B.calculSalaire()+100*nbSubordonee;
             }
          }


