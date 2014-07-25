package ex106;

public class CD  extends RentalItem{
	private String artistName;
	
	CD(String title,String artistName){
		setTitle(title);
		this.artistName=artistName;
	}
	
	public String getArtistName(){
		return artistName;
	}
	
	public String toString(){
		return "\nCD タイトル : " + getTitle() + "アーティスト名 : " + artistName;
	}
	
	
	
}
