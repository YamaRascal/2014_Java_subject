package ex095;

public class Ex095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,20,30,40,50};
		
		try{
		for(int i=0; i<6; i++){			//配列をオーバーしてアクセスしている
			System.out.println(array[i]);
		}
		}catch(Exception e){
			System.out.println("配列がオーバーしました\n"+e);
		}
	}

}
