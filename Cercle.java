package tp1;

//Ndeye  Birame  DIA

public class Cercle {
	protected Point centre;
	protected double circonference,surface;
	protected float rayon;
	public Cercle(float x,float y,float rayon){
		centre=new Point(x,y);
		this.rayon=rayon;
	}
	public Cercle() {
		centre=new Point();
		rayon=10;
	}
	public float get1Rayon() {
		return rayon;	
	}
	public float get1X() {
		return centre.getX();
	}
	public float get1Y() {
		return centre.getY();
	}
	public double circonference() {
		circonference=2*Math.PI*rayon;
		return circonference;
	}
	public double surface() {
		surface=Math.PI*rayon*rayon;
		return surface;
	}
	public void afficherCercle() {
		System.out.println("Cercle de centre A de coordonnée("+get1X()+";"+get1Y()+") et de rayon r= "+rayon);
	}
	
}
