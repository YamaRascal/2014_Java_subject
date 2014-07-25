package ex105;

public class CD {
	private String title;
	private String artistName;
	
	CD(String title,String artistName){
		this.title=title;
		this.artistName=artistName;
	}
	
	public String getTitle(){
		return title;
	}
	public String getArtistName(){
		return artistName;
	}
	
	public String toString(){
		return "CD タイトル : " + title + "アーティスト名 : " + artistName;
	}
	
	
	
}
