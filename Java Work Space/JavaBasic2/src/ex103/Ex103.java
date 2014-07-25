package eex103;

public class Ex103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Squeare s1 = new Squeare("red",200,200,150,250,100,100);
		Squeare s2 = new Squeare("blue",300,400,200,450,200,100);

		Triangle t1 = new Triangle("purple",200,200,150,250,100,100,150,250);
		Triangle t2 = new Triangle("orenge",200,200,150,250,100,100,150,250);
		
		s1.rotate(30);
		s2.rotate(-30);
		
		t1.rotate(30);
		t2.rotate(-30);
		
		s1.printDate();
		s2.printDate();

		t1.printDate();
		t2.printDate();
	}
}