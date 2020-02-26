# pglp_3.2

 1) Proposons une solution respectant OCP:
 
 -On crée une classe abstraite qui calcul le salaire pour chaque type d'employé
  
      public abstract class CalculerSalaire 
      {     
        private String nom;
        private String adress;
        public abstract double calculSalaire();
      }
        
   -On défini la classe qui calcul le salaire d'un employé en fonction de son anciennetté:
   
      public class EmployeAncien extends CalculerSalaire
      {      
          @Override
           public double calculSalaire(int nbAnneeAncien)
           {
              return 1500 + 20*nbAnneeAncien;
            }
      }
   
   -On défini la classe qui calcul le salaire d'un vendeur
   
     public class Vendeur extends CalculerSalaire
      {      
         @Override
         private double calculSalaire(int nbAnneeAncien, double commission)
        {
          return 1500 + 20*nbAnneeAncien + commission;
        }
      }
   
   -Créons une méthode qui calcul la somme totale des salaires de l'entreprise ui sera définie par la classe     EmployerSlaireTotal
     
     public class EmployerSalaireTotal extends CalculerSalaire
      {      
         @Override
         private double calculSalaire(Vendeur B,EmployerAncien C)
        {
          return B.calculSalaire()+C.calculSalaire();
        }
      }
   
   
2) Pour le verifier, ajoutons la classe manager:

          public class Manager extends CalculerSalaire
          {      
             @Override
             private double SalaireTotal(EmployeAncien B,int nbSubordonee)
             {
                return B.calculSalaire()+100*nbSubordonee;
             }
          }


