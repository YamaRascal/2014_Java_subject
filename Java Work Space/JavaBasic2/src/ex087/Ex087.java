package ex087;

public class Ex087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("フィット",2005,1.53);
		Car c2 = new Car("プリウス",2010,1.4);
		Car c3 = new Car("GT-R",2014,1.74);
		
		c1.showCount();
		System.out.println(c1.getName()+","+c1.MakeYear()+","+c1.getWeigth());
		System.out.println(c2.getName()+","+c2.MakeYear()+","+c2.getWeigth());
		System.out.println(c3.getName()+","+c3.MakeYear()+","+c3.getWeigth());
	}

}
