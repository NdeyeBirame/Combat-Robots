package tp1;

//Ndeye Birame DIA

public class RobotCombat extends Robot{
	protected int ptsVie,ptsAttaque;
	protected char caractere; // l'attribut nous permettra d'afficher le robot dans la grille
	public RobotCombat(String nom,float x,float y,int orientation,int ptsVie,int ptsAttaque,char caractere) {
		this.nom=nom;
		this.x=x;
		this.y=y;
		this.orientation=orientation;
		this.ptsVie=ptsVie;
		this.ptsAttaque=ptsAttaque;
		this.caractere=caractere;

	}
	public void attaquerRobot(RobotCombat robotCombat) {
		robotCombat.ptsVie-=ptsAttaque;
		if(robotCombat.ptsVie<0) {
			robotCombat.ptsVie=0;
		}
	}
	
}
