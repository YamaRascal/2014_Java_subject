package ex090;

public class Music090 {
	String name = "NoName";
	String song = "NoName";
	int price = 0;
	
	 static void description(){
		System.out.println("曲の情報を表示する");
	}
	 Music090(){
	 }
	 Music090(String name,String song,int price){
		 this.name = name;
		 this.song = song;
		 this.price = price;
	 }
	 
	 void setDate(String name,String song,int price){
		 this.name = name;
		 this.song = song;
		 this.price = price; 
	 }
	 
	 void printDate(){
		 System.out.println(name+","+song+","+price);
	 }
	
	
}
