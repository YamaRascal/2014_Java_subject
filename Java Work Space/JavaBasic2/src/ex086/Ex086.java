package ex086;

public class Ex086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("フィット",2005,1.53);

		System.out.println("この車は"+c1.MakeYear()+"年製の"+c1.getName()+"です");
		
		System.out.println("車体重量は"+c1.getWeigth()+"トンです。");
	}

}
