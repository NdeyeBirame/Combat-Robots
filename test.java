package tp1;

//Ndeye Birame DIA

public class test {
	public static void main(String[] args) {
		//les instances
		Point p1=new Point(10,10);
		Point p2=new Point(50,50);
		Cercle c1=new Cercle(1,0,5);
		Cercle c2=new Cercle(0,0,7);
		//test des méthodes afficher
		p1.afficherPoint();
		p2.afficherPoint();
		c1.afficherCercle();
		c2.afficherCercle();
		//Affichage des x de chaque point
		System.out.println("x1="+p1.getX()+"\t x2="+p2.getX());
		//Affichage des surfaces et circonferences
		System.out.println("s1="+c1.surface()+"\t s2="+c2.surface());
		System.out.println("cir1="+c1.circonference()+"\t cir2="+c2.circonference());
		//deplacement et affichage
		p1.deplacerPoint(100,100);
		p1.afficherPoint();
	}

}
