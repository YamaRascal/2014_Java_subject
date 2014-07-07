/*
 * 2014/06/05
 * Ex081.java
 * 14cm0132
 * 山出　達也
 */

package ex081;

public class Ex081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[]  book = new Book[5];//Book book[0]; Book boo
		
		for( int i = 0; i < book.length; i++){
				book[i] = new Book();
		}
		
		book[0].setDate(
				"基礎からのJavaその１",			//書籍名
				"宮本信二",				//著者名
				"SoftBankCrieative",	//出版社
				20130319,				//年月日
				100,					//定価
				"ISBN978-4-7973-5927-5",//ISBNコード
				5);						//在庫数
		
		book[1].setDate(
				"基礎からのJavaその２",			//書籍名
				"宮本信二",				//著者名
				"SoftBankCrieative",	//出版社
				20130319,				//年月日
				500,					//定価
				"ISBN978-4-7973-5927-5",//ISBNコード
				2);						//在庫数
		
		book[2].setDate(
				"基礎からのJavaその３",			//書籍名
				"宮本信二",				//著者名
				"SoftBankCrieative",	//出版社
				20130319,				//年月日
				1000,					//定価
				"ISBN978-4-7973-5927-5",//ISBNコード
				3);						//在庫数
		
		book[3].setDate(
				"基礎からのJavaその４",			//書籍名
				"宮本信二",				//著者名
				"SoftBankCrieative",	//出版社
				20130319,				//年月日
				1500,					//定価
				"ISBN978-4-7973-5927-5",//ISBNコード
				1);						//在庫数
		
		book[4].setDate(
				"基礎からのJavaその５",			//書籍名
				"宮本信二",				//著者名
				"SoftBankCrieative",	//出版社
				20130319,				//年月日
				2000,					//定価
				"ISBN978-4-7973-5927-5",//ISBNコード
				7);						//在庫数
			
		for(int i=0;i<book.length;i++){
			book[i].printDate();
		}
	}
}
