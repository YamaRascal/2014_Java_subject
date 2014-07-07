package ex102;

public class Ex102 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Squeare s1 = new Squeare("red",200,200,150,250,100,100);
		Squeare s2 = new Squeare("blue",300,400,200,450,200,100);
		
		Circle c1 = new Circle("yellow",200,200,150);
		Circle c2 = new Circle("green",300,400,200);
		
		Triangle t1 = new Triangle("purple",200,200,150,250,100,100,150,250);
		Triangle t2 = new Triangle("orenge",200,200,150,250,100,100,150,250);
		
		
		s1.printDate();
		s2.printDate();
		
		c1.printDate();
		c2.printDate();
		
		t1.printDate();
		t2.printDate();
	}

}

