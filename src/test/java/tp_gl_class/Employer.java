package tp_gl_class;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Employer {

	EmployerInitial A = new EmployerInitial();
	EmployerAncien B = new EmployerAncien(23);
	Vendeur C = new Vendeur(10, 2500.34);
	Manager D = new Manager(100);
	double salTotal;
	
	@Test
	public void salaireTotal() {
		salTotal = A.calculSalaire()+B.calculSalaire()+C.calculSalaire()+D.calculSalaire();
		assertEquals("La valeur du salaire total n'est pas ca",salTotal, 299001.3);
	}
	
	@Test
	public void salaireEmpolyerInitial() {
		
	}
	
	@Test
	public void salaireEmpolyerAncien() {
		
	}
	
	@Test
	public void salaireVendeur() {
		
	}
	
	@Test
	public void salaireManager() {
		
	}
}
