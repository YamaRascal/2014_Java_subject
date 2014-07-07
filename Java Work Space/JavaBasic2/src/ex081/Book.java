package ex081;

public class Book {

	String title;	//書籍名
	String person;	//著者名
	String company;	//出版社
	int	   ymd;		//年月日
	int	   price;	//定価
	String code;	//ISBNコード
	int	   num;		//在庫数
	
	void setDate(	String title,	//書籍名
						String person,	//著者名
						String company,	//出版社
						int	   ymd,		//年月日
						int	   price,	//定価
						String code,	//ISBNコード
						int	   num		//在庫数
						){
		this.title = title;
		this.person=person;
		this.company=company;
		this.ymd=ymd;
		this.price=price;
		this.code=code;
		this.num=num;
	}
	
	void printDate(){
		System.out.println(
				"書籍名  		>" + title +	
				"\n著者名		>" + person+	
				"\n出版社		>" + company+	
				"\n年月日		>" + ymd +		
				"\n定価		>"	+ price+	
				"\nISBNコード	>" + code+	
				"\n在庫数		>" + num +	
				"\n");
		
	}
}
