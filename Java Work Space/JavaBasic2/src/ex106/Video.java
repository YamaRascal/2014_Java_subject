package ex106;

public class Video  extends RentalItem{
	String category;
	
	Video(String title,String category){
		setTitle(title);
		this.category=category;
	}
	
	public String getCategory(){
		return category;
	}
	
	public String toString(){
		return "\nVideo タイトル : " + getTitle() + "ジャンル : " + category;
	}
}
