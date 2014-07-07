package ex084;

public class Car {

		private String name;
		private int MakeYear;
		private double weigth;
		
		public void setName(String n){
			name = n;
		}
		
		public String getName(){
			return name;
		}
		
		public void setMake(int y){
			MakeYear = y;
		}
		public int MakeYear(){
			return MakeYear;
		}
		
		public void setWeigth(double w){
			weigth = w;
		}
		
		public double getWeigth(){
			return weigth;
		}

}
