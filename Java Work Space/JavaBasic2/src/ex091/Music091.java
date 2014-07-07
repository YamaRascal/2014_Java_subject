package ex091;

public  class Music091 {
	static String name = "NoName";
	static String song = "Noname";
	static int price = 0;
	static int count = 0;
	
	Music091(String name,String song,int price){
		this.name = name;
		 this.song = song;
		 this.price = price;
		 count++;
	}
	static int getTotalCount(){
		return count;
	}
}
