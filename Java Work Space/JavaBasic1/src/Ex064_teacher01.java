
public class Ex064_teacher01 {
		public static void main(String[]augs){
			int escape;
			int [] num = new int[52];
			int len = num.length;
			
			for(int i=0;i<len;i++){		//配列への代入
				num[i]=i+1;
			}
			
			for(int i = 0;i<5;i++){		
				int n = (int)(Math.random()*len);
				System.out.println(num[n]);
				
				escape =num[n];		//データの退避
				num[n]=num[len-1];	//最終行との入れ替え
				num[len-1]=escape;	//退避させたデータの代入
				len--;
			}
			
		}
}
