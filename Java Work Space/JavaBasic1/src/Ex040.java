/*
 * 2014/05/08
 * Ex040.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;

public class Ex040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//変数　月、お金、結果、学生1、学生2
		int ms ,mo ;
		double res, stu1,stu2;
		
		//入力
		System.out.print("学生なら　1　を入力して、\nそれ以外の方は　2 を押してください");
		stu1 = scan.nextInt();
		System.out.print("1ヶ月分ですか？\n3ヶ月分ですか？\n6ヶ月分ですか？");
		ms = scan.nextInt();
		System.out.print("片道料金はいくらですか？ですか？");
		mo = scan.nextInt();
		
		res =((ms*30)*mo*1.08); //税込み　素
		
		//月ごとの割引
		if(ms == 1 ){
			res = res*0.97;		
		}else if(ms == 3){
			res =res*0.96;
		}else if(ms ==6){
			res =res*0.95;
		}else {
			System.out.println("1ヶ月か3ヶ月分か6ヶ月で入力してください");
		}
		
		//学割と結果の表示
		if(stu1 == 1){
			stu2 =res/2;
			System.out.println("料金は、" + Math.round(stu2) + ("円（税込み）です"));
		}else if(stu1 == 2){
			stu2 = res ;
			System.out.println("料金は、" + Math.round(stu2) + ("円（税込み）です"));
		}else System.out.println("正しく有りません。学生かどうかで1か2を入力してください");
		
		
	
	}

}
