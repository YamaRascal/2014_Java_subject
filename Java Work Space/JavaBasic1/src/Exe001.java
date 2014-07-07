import java.util.Scanner;
import java.util.Random;

public class Exe001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int num1,num2;

		for(;;){
			System.out.print("ジャンケンをします"
					+ "\n0がグー、1がチョキ、2がパーです"
					+ "\n0〜2で入力してください＞");
			num1 = scan.nextInt();
			num2 = rand.nextInt(3);

			if(num1>=3){
				System.out.println("0がグー、1がチョキ、2がパーです\n0〜2で入力してください。値が不正です");
			}else
				if(num1==num2){
					System.out.println("あいこです\nもう一度\n\n");
					continue;}
				else {
					switch(num1){
					case 0:
						if(num2==1){
							System.out.println("あなたが\"グー\"で私がチョキ\nあなたの勝ちです");
							break;
						}else if(num2==2){
							System.out.println("あなたが\"グー\"で私がパー\nあなたの負けです");
							break;
						}
					case 1:
						if(num2==0){
							System.out.println("あなたが\"チョキ\"で私がグー\nあなたの負けです");
							break;
						}else if(num2==2){
							System.out.println("あなたが\"チョキ\"で私がパー\nあなたの勝ちです");
							break;
						}
					case 2:
						if(num2==0){
							System.out.println("あなたが\"パー\"で私がグー\nあなたの勝ちです");
							break;
						}else if(num2==1){
							System.out.println("あなたが\"パー\"で私がチョキ\nあなたの負けです");
							break;
						}
					}
				}
					System.out.print("\nもう一度、やりますか？\nやるなら>1を\nやらないなら>2を\n");
					num1 = scan.nextInt();
					if(num1 == 1){
						continue;
					}else{
						break;
					}
		}
	}

}


