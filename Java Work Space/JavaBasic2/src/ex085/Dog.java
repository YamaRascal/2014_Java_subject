package ex085;

public class Dog {
	
	private String name;
	private int birthYear;
	
	Dog(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setbirthYear(int y){
		birthYear = y;
	}
	public int getBirthYear(){
		return birthYear;
	}
}
