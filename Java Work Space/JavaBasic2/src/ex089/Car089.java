package ex089;

public class Car089 {
	String name;
	int year;
	double weight;
	
	Car089(){
	}
	
	Car089(String name){
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
