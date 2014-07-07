package ex082;

public class Book {
	//フィールド変数の定義？
	String title;	//書籍名
	String person;	//著者名
	String company;	//出版社
	int	   ymd;		//年月日
	int	   price;	//定価
	String code;	//ISBNコード
	int	   num;		//在庫数
	
	
	int count =0;	//外部カウント

	void setDate(	String title,	//書籍名			//データを変数に代入
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

	void printDate(int money){	//引数で所持金と個数を渡す
		count=0;
		if(money>=price && num>0){		//所持金が定価より上で在庫があると表示
			System.out.println(					
					"\n書籍名  	>" + title +			
					"\n定価		>"	+ price+		
					"\n在庫数		>" + num +	
					"\n");
			count++;
		}
	}
	
	boolean hyouji(int money){
		if(money>=price && num>0){
			return true;
		}
		return false;
	}
	
	
	void countback(int a,int b,int c,int d,int e){
		a = a+b+c+d+e;
		if(a>0){
			System.out.println("あなたの所持金で買える本は" + a +"本です");
		}else if(a==0){
			System.out.println("あなたの買える本はありません\nご来店ありがとうございました");
			count=999;
		}
	}
	
	int buy(int money){
		if(money>=price && num>0){
			money -=price;
			num--;
		}
		return money;
	}
	

}
