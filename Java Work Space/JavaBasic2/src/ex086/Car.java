package ex086;

public class Car {
	

	private String name;
	private int MakeYear;
	private double weigth;

	Car(String n,int m,double w){
		name = n;
		MakeYear = m;
		weigth = w;
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
