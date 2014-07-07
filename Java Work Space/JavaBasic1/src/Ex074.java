/*
 * 2014/05/30
 * Ex074.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;
public class Ex074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int num1,num2;
		System.out.print("要素数を入力 >");
		num1 = scan.nextInt();
		System.out.print("乱数の上限を入力　>");
		num2 = scan.nextInt();
		int [] ran=new int[num1];

		init(ran,num1,num2);		//乱数の入力メソッド呼び出し
		sort(ran);							//バブルソートメソッド呼び出し
		showInfo(ran,num1);			//データの出力メソッド呼び出し

	}
	public static void init(int [] ran,int num1,int num2){		//乱数で配列を初期化
		for(int i=0;i<num1;i++){
			ran[i]= (int)(Math.random()*num2);
		}
	}
	public static void sort(int [] ran){						//ソートメソッド（バブルソート）昇順
		int escape = 0;
		for(int cnt=0;cnt<ran.length;cnt++){
			for(int i =ran.length-1;i>0;i--){
				if(ran[i]<ran[i-1]){							//ここの符号で昇順、降順を切り替えられる
					escape = ran[i-1];
					ran[i-1]=ran[i];
					ran[i]=escape;
				}
			}
		}
	}
	public static void showInfo(int [] ran,int num1){			//データの出力メソッド
		for(int i = 0;i<num1;i++){
			System.out.println("要素["+ i + "]は"+ ran[i]);
		}
	}

}