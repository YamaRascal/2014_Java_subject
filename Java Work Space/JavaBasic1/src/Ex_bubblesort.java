/*
 * 2014/05/23
 * Ex_bubblesort.java
 * 14cm0132
 * 山出　達也
 */
import java.util.Scanner;
import java.util.Random;
public class Ex_bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();


		int maxscan , choice;

		System.out.print("1=Random,2=Manual 入力してください > ");
		choice = scan.nextInt();

		if(choice == 1 ){
			System.out.print("ランダムで表示したい数の個数を入力 >");
			int num = scan.nextInt();
			System.out.print("ランダムで表示したい数の上限値を入力 >");
			int maxrand = scan.nextInt();

			int [] max = new int[num];

			for(int i=0;i<num;i++){

				max[i] =rand.nextInt(maxrand);

			}

			/////////////////Randomで入力されたものを表示
			for(int i=0;i<num;i++){
				System.out.println((i+1) +"番目に入力した数のは" + max[i] + "です");
				//System.out.print(max[i] + "  \n\n");
			}

			int escape = 0;	//変数同士を比べたときに上書きしないための逃げ道
			/////////////////入れ替え条件ループ
			for(int i1 = 0;i1<num-1;i1++){
				for(int i=0;i<num;i++){
					if(max[num-2-i]>max[num-1-i]){
						escape =max[num-2-i];
						max[num-2-i]=max[num-1-i];
						max[num-1-i] = escape;

					}
					if(num-2-i==0){
						break;
					}
				}}

			for(int i=0;i<num;i++){
				//System.out.println((i+1) +"番目に入力した数のは" + max[i] + "です");
				System.out.print(max[i] + "  ");
			}


		}
		else if(choice ==2){
			//////////////////ソートしたい数の個数の入力

			System.out.print("ソートしたい数の個数を入力してください \n例）14　25　36の三つなら　3　と入力>");
			maxscan = scan.nextInt();
			int [] max = new int[maxscan];		//maxscanの数だけmax配列を用意
			//////////////////ソートしたい数、本体の入力
			for(int i=0;i<maxscan;i++){
				System.out.print("それでは\nソートしたい数を1つずつ入力してください >");
				max[i] =scan.nextInt();
			}

			/////////////////入力したものの表示
			for(int i=0;i<maxscan;i++){
				System.out.println((i+1) +"番目に入力した数のは" + max[i] + "です");
				//System.out.print(max[i] + "  \n\n");
			}

			int escape = 0;	//変数同士を比べたときに上書きしないための逃げ道
			/////////////////入れ替え条件ループ
			for(int i1 = 0;i1<maxscan-1;i1++){
				for(int i=0;i<maxscan;i++){
					if(max[maxscan-2-i]>max[maxscan-1-i]){
						escape =max[maxscan-2-i];
						max[maxscan-2-i]=max[maxscan-1-i];
						max[maxscan-1-i] = escape;

					}
					if(maxscan-2-i==0){
						break;
					}
				}
			}

			for(int i=0;i<maxscan;i++){
				//System.out.println((i+1) +"番目に入力した数のは" + max[i] + "です");
				System.out.print(max[i] + "  ");
			}


		}


	}

}
