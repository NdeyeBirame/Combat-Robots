package tp1;

//Manon Delforge et Ndeye Birame Dia
public class Robot {
	protected String nom;
	protected float x,y;     // les positions du robot
	protected int numero,orientation; //  on prendra Nord=0 , Est=1 , Sud=2 et Ouest=3
	
	//Les constructeurs
	public Robot() {
		x=0;
		y=0;
		orientation=0;
	}
	public Robot(String nom,float x,float y,int orientation) {
		this.x=x;
		this.y=y;
		this.nom=nom;
		this.orientation=orientation;
	}
	public Robot(Robot robot,String nom) {
		x=robot.x;
		y=robot.y;
		orientation=robot.orientation;
		this.nom=nom;
	}
	//Les méthodes
	public void avancer(int pas) {
		if(orientation==0) {
			y+=pas;
		}
		else if(orientation==1) {
			x+=pas;
		}
		else if(orientation==2) {
			y-=pas;
		}
		else {
			x-=pas;
		}
	}
	
	public void tournerAdroite() {
		if(orientation==3) {
			orientation=0;
		}
		else {
			orientation+=1;
		}
	}
	public String toString() {    
		return "l'abscisse de "+nom+" est "+x+",son ordonnée "+y+" et son orientation ;"+orientation;
		
	}
}
