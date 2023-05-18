package tp1;
import java.util.Random;

//Ndeye Birame DIA


public class LesCombats {
	//Puisque la condition d'arrêt des combats n'est pas précisée dans le Tp, on prendra comme 
	//condition la mort d'un robot(donc si un robot se retrouve avec ptsVie=0)
	// Et on a décidé de prendre 5 robots pour un combat
	
	protected  char grille[][];
	public LesCombats() {
		 grille=new char[50][50];
	}
	public void remplirGrille() {  // permet de remplir la grille (qui est ici comme une matrice) avec des '*'. On y met pas encore les robots
		for(int i=0;i<50;i++) {
			for(int j=0;j<50;j++) {
				grille[i][j]='*';
			}
		}
	}
	public void afficherGrille() {     //permet d'afficher la grille
		for(int i=0;i<50;i++) {
			for(int j=0;j<50;j++) {
				System.out.print(grille[i][j]);
			}
			System.out.print('\n');
		}
	}
	public void robotsGrille(RobotCombat R1,RobotCombat R2,RobotCombat R3,RobotCombat R4,RobotCombat R5) {
		grille[(int)R1.x][(int)R1.y]=R1.caractere;    //puisqu'on a déclarer les positions x et y comme des float on doit les convertir en int
		grille[(int)R2.x][(int)R2.y]=R2.caractere;
		grille[(int)R3.x][(int)R3.y]=R3.caractere;
		grille[(int)R4.x][(int)R4.y]=R4.caractere;
		grille[(int)R5.x][(int)R5.y]=R5.caractere;
		//ici on met nos robots dans le grille (on en a pris 5)
	}
	public void deplacement(RobotCombat R,int max,int min) {     //déplacement d'un robot
        Random rand = new Random();
        int a=rand.nextInt(max - min + 1) + min;
        int b=rand.nextInt(max - min + 1) + min;
        R.x=a;
        R.y=b;	
	} 
	public void onAttaque(RobotCombat R1,RobotCombat R2,RobotCombat R3,RobotCombat R4,RobotCombat R5) {  //un robot attaque les autres robots 
																								//du combat s'il le trouve sur sa nouvelle position
		if(R1.x==R2.x && R1.y==R2.y) {
			R1.attaquerRobot(R2);
			//System.out.println(R1.nom+" attaque "+R2.nom);   //cette instruction nous permet de savoir celui qui attaque et l'attaqué
		}
		else if(R1.x==R3.x && R1.y==R3.y) {
			R1.attaquerRobot(R3);
			//System.out.println(R1.nom+" attaque "+R3.nom);
		}
		else if(R1.x==R4.x && R1.y==R4.y) {
			R1.attaquerRobot(R4);
			//System.out.println(R1.nom+" attaque "+R4.nom);
		}
		else if(R1.x==R5.x && R1.y==R5.y) {
			R1.attaquerRobot(R5);
			//System.out.println(R1.nom+" attaque "+R5.nom);
		}
	}
	public void deplacements(RobotCombat R1,RobotCombat R2,RobotCombat R3,RobotCombat R4,RobotCombat R5) { //ici tous les robots se déplacent
		int i=0;       //permet de connaitre le nombre de déplacement et vérifier ainsi le bon fonctionnement du combat
		while(R1.ptsVie!=0 && R2.ptsVie!=0 && R3.ptsVie!=0 && R4.ptsVie!=0 && R5.ptsVie!=0 ) {
			deplacement(R1,49,0); //on deplace le premier robot aléatoirement tout en combattant les autres robots
			onAttaque(R1,R2,R3,R4,R5); //aprés un déplacement le robot attaque s'il trouve un robot sur place
			deplacement(R2,49,0); 
			onAttaque(R2,R1,R3,R4,R5);
			deplacement(R3,49,0); 
			onAttaque(R3,R2,R1,R4,R5);
			deplacement(R4,49,0); 
			onAttaque(R4,R2,R3,R1,R5);
			deplacement(R5,49,0); 
			onAttaque(R5,R2,R3,R4,R1);
			i++;
		}
		System.out.println("le nombre de deplacement total est "+i);
		robotsGrille(R1,R2,R3,R4,R5);   //on affiche la nouvelle grille
		
	}
}

