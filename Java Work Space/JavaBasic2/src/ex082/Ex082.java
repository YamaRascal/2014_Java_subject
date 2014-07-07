/*
 * 2014/06/05
 * Ex082.java
 * 14cm0132
 * 山出　達也
 */

package ex082;
import java.util.Scanner;
public class Ex082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Book  book1 = new Book();
		Book  book2 = new Book();
		Book  book3 = new Book();
		Book  book4 = new Book();
		Book  book5 = new Book();

		book1.setDate(
				"基礎からのJavaその１",			//書籍名
				"宮本信二",				//著者名
				"SoftBankCrieative",	//出版社
				20130319,				//年月日
				100,					//定価
				"ISBN978-4-7973-5927-5",//ISBNコード
				5);						//在庫数

		book2.setDate(
				"基礎からのJavaその２",			//書籍名
				"宮本信二",				//著者名
				"SoftBankCrieative",	//出版社
				20130319,				//年月日
				500,					//定価
				"ISBN978-4-7973-5927-5",//ISBNコード
				2);						//在庫数

		book3.setDate(
				"基礎からのJavaその３",			//書籍名
				"宮本信二",				//著者名
				"SoftBankCrieative",	//出版社
				20130319,				//年月日
				1000,					//定価
				"ISBN978-4-7973-5927-5",//ISBNコード
				3);						//在庫数

		book4.setDate(
				"基礎からのJavaその４",			//書籍名
				"宮本信二",				//著者名
				"SoftBankCrieative",	//出版社
				20130319,				//年月日
				1500,					//定価
				"ISBN978-4-7973-5927-5",//ISBNコード
				1);						//在庫数

		book5.setDate(
				"基礎からのJavaその５",			//書籍名
				"宮本信二",				//著者名
				"SoftBankCrieative",	//出版社
				20130319,				//年月日
				2000,					//定価
				"ISBN978-4-7973-5927-5",//ISBNコード
				7);						//在庫数
		System.out.print("所持金を入力 >");
		int money =scan.nextInt();

		for(;;){
			System.out.println("あなたの今の所持金は" + money + "円です");
			book1.printDate(money);
			book2.printDate(money);
			book3.printDate(money);
			book4.printDate(money);
			book5.printDate(money);

			book1.countback(book1.count,book2.count,book3.count,book4.count,book5.count);
			if(book1.count==999){
				break;
			}
			System.out.println("どの本を買いますか？");
			
			boolean boo1 =book1.hyouji(money);
			boolean boo2 =book2.hyouji(money);
			boolean boo3 =book3.hyouji(money);
			boolean boo4 =book4.hyouji(money);
			boolean boo5 =book5.hyouji(money);
			
			if(boo1==true){
				System.out.println("その1をかうなら　1　を");
			}
			if(boo2==true){
				System.out.println("その2をかうなら　2　を");
			}
			if(boo3==true){
				System.out.println("その3をかうなら　3　を");
			}
			if(boo4==true){
				System.out.println("その4をかうなら　4　を");
			}
			if(boo5==true){
				System.out.println("その5をかうなら　5　を");
			}
			
			
			int buy = scan.nextInt();

			if(buy==1&&money>=book1.price){
				money = book1.buy(money);
				System.out.println("その1を買いました");
			}
			else 
				if(buy==2&&money>=book2.price){
					money = book2.buy(money);
					System.out.println("その2を買いました");
				}
				else 
					if(buy==3&&money>=book3.price){
						money = book3.buy(money);
						System.out.println("その3を買いました");
					}
					else
						if(buy==4&&money>=book4.price){
							money = book4.buy(money);
							System.out.println("その4を買いました");
						}
						else if(buy==5&&money>=book5.price){
							money = book5.buy(money);
							System.out.println("その5を買いました");
						}else{
							System.out.print("入力エラーです\nやり直すなら　１　を\n終了するなら　２　を\n入力してください");
							int buffer =scan.nextInt();
							if(buffer==1){
								continue;
							}else{
								System.out.println("終了します");
								break;
							}
						}
			System.out.print("まだ買い物を続けますか？"
					+ "\n続けるなら	１　　を"
					+ "\n終了するなら	２　　を"
					+ "\n入力してください　＞");
			int ans =scan.nextInt();
			if(ans==1){
				continue;
			}else{
				System.out.println("不正なデータが入力された為終了します");
				break;
			}
		}
	}

}
