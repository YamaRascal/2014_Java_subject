package ex089;

public class Ex089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car089 c1 = new Car089();
		c1.setDate("プリウス",2011,1.4);
		
		Car089 c2 = new Car089("アクセラ");
		c2.setDate(2014,1.55);
		printCar(c1,c2);
	}
	
	public static void printCar(Car089 c1,Car089 c2){
		System.out.println(c1.getMakeYear() 
				+ "年製の" + c1.getName() 
				+ "の車重は" + c1.getWeight() + "トンです");
		
		System.out.println(c2.getMakeYear() 
				+ "年製の" + c2.getName() 
				+ "の車重は" + c2.getWeight() + "トンです");
	
	}

}
