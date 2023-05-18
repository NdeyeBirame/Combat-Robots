package tp1;

//Manon Delforge et Ndeye Birame Dia

public class TestRobot {
	public static void main(String[] args) {
		Robot r1 = new Robot("Birame",2,2,3);
		r1.avancer(2);
		r1.tournerAdroite();
		System.out.println("le robot est a la position ("+r1.x+","+r1.y+")");
		
		System.out.println(r1);  // l'instruction nous affichait ce qui semble etre l'adresse de r1 mais aprés 
								//l'ajout de la methodes String toString elle nous affiche les attributs
		
		
		
		//on teste les combats
		LesCombats combat1=new LesCombats();
		combat1.remplirGrille();
		RobotCombat R1=new RobotCombat("Dia",2,4,0,2,4,'1');
		RobotCombat R2=new RobotCombat("gadiaga",0,0,0,2,4,'2');
		RobotCombat R3=new RobotCombat("Delforge",10,10,2,4,10,'3');
		RobotCombat R4=new RobotCombat("Diouf",	35,10,3,2,4,'4');
		RobotCombat R5=new RobotCombat("Dieng",49,49,2,2,4,'5');
		
		combat1.deplacements(R1,R2,R3,R4,R5);
		combat1.afficherGrille();
		
		
		
	}

}
