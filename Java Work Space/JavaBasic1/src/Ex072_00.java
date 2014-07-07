/*
 * 2014/05/29
 * Ex072_00.java
 * 14cm0132
 * 山出　達也
 */

public class Ex072_00 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =1;
		boolean sosuu;	
		int [] num = new int[1000];
		int [] cnt = new int[1000];
		for(int i=2;i<=num.length;i++){
			if(i>2&&i%2==0){
				continue;
			}else{
				sosuu =isSosu(i);
				if(sosuu == true){
					cnt[count-1]=i;
					count++;
					if(i==num.length){
						count=-2;
						break;
					}
				}else{
					continue;
				}
			}
			for(int i2=0;i2<=count-2;i2++){
				System.out.println("素数は >" + cnt[i2]);
			}
		}
	}
	public static boolean isSosu(int i){	//素数判定
		int count =0;
		for(int cnt=1;cnt<=i;cnt++){
			if(i%cnt==0){
				count++;
				if(cnt==i && count==2){
					return true;
				}else if(cnt==i){
					continue;
				}
			}else {
				continue;
			}
		}
		return false;
	}
}


/*
		int count1 = 1000;		//判定する数の数
		int count2 = 2;			//素数の元

		int []num = new int[count1];	//判定する数　とりあえず1000ぐらいに

		int []prime =new int[count2];		//prime=素数
		prime[0]=2;
		prime[1]=3;

		add(num[],count1);

		isSosu(num[]);

		for

	}
	public static void add(int num[],int count1){	//判定する数の配列への入力
		for(int i=1;i<=count1;i++){
			num[i-1]=i;
		}
	}

	public static boolean isSosu(int num[],int count1){		//素数判定
		for(int i=0;i<count1;i++){

		}
	}
 */

