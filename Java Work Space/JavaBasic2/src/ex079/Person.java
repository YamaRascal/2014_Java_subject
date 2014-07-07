package ex079;

public class Person {

	String name;
	String tel;
	String adress;
	int age;
	
	void showInfo1(){
		System.out.println(name + "さんの年齢は" + age + "です");
	}
	/*
	void showInfo2(){
		System.out.println(name + "さんの電話番号は" + tel + "、住所は" + adress + "です");
	}
	*/
	
	void showTel(){
		System.out.print(name + "さんの電話番号は、" + tel +"、");
	}
	
	void showAdress(){
		System.out.println("住所は" + adress + "です");
	}
}
