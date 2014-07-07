package ex097;
import java.util.Random;
public class Ex097 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] array ={0,1,2,3,4};
		int r1,r2;
		Random rand = new Random();
		try{
		for(int i=0;i<5;i++){
			r1 = rand.nextInt(array.length);
			r2 = rand.nextInt(array.length);
			System.out.println(r1/r2);
		}
		}catch(java.lang.ArithmeticException e){
			System.out.println("エラー：ゼロで割られました");
			return;
		}
	}

}
