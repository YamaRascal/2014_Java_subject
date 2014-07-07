package ex087;

public class Car {
	
	static int count;
	private String name;
	private int MakeYear;
	private double weigth;

	Car(String n,int m,double w){
		name = n;
		MakeYear = m;
		weigth = w;
		count++;
	}
	
	public void showCount(){
		System.out.println("台数は"+count+"です。");
	}
	
	public String getName(){
		return name;
	}
	

	public int MakeYear(){
		return MakeYear;
	}

	
	public double getWeigth(){
		return weigth;
	}
	
}
