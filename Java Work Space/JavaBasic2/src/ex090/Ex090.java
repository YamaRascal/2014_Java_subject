package ex090;

public class Ex090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Music090.description();
		
		
		Music090 m1 = new Music090("椎名林檎","NIPPON",250);

		m1.printDate();
		
		Music090 m2 = new Music090();
		m2.printDate();
		m2.setDate("氣志團","喧嘩上等",100);
		m2.printDate();
		
	}

}
