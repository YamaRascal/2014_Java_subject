package ex088;

public class Car088 {
	String name;
	int year;
	double weight;
	
	Car088(){
	}
	
	Car088(String name){
		this.name=name;
	}
	
	void setDate(String name,int year,double weight){
		this.name=name;
		this.year=year;
		this.weight=weight;
	}
	
	void setDate(int year,double weight){
		this.year=year;
		this.weight=weight;
	}
	
	int getMakeYear(){
		return year;
	}
	
	
	String getName(){
		return name;
	}
	
	double getWeight(){
		return weight;
	}
}
