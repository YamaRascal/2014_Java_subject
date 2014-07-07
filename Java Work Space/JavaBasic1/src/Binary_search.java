//二分探索		先生作	
//例

import java.util.Scanner;
public class Binary_search {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x;
		System.out.print("探したい値　入力> ");
		x = scan.nextInt();

		int [] score = {10,20,30,40,50,60,70,80,90,100};
		int lo = 0;		//初めの一つ
		int hi = score.length-1;	//全体の長さ
		int k =(lo+hi)/2;		

		for(;;){
			if(x ==score[k]){
				System.out.println("探索する値" + x + "は存在します");
				break;
			}else 
				if(x>score[k]){
					lo = k +1;
					k = lo;
				}else
					if(x<score[k]){
						hi = k-1;
					k = hi;
					}
			if(lo>hi){
				System.out.println("探索する値" + x + "は存在しません");
				break;
			}

		}
	}
}
