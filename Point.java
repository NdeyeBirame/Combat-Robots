package tp1;
//Manon Delforge et Ndeye Birame Dia

public class Point {
	protected float x,y;
	public Point(float x,float y) {
		this.x=x;
		this.y=y;	
	}
	public Point() {
		x=0;
		y=0;	
	}
	public float getX() {
		return x;
		
	}
	public float getY() {
		return y;
	}
	public void deplacerPoint(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void afficherPoint() {
		System.out.println("x="+x+"	y="+y);		
	}
}
