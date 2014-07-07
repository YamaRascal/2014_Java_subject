package ex080;

public class Person {

	String name;
	int age;
	String tel;
	String adress;
	
	
	void setName(String name){
		this.name = name;
	}
	void setAge(int age){
		this.age = age;
	}
	void setTel(String tel){
		this.tel = tel;
	}
	void setAdress(String adress){
		this.adress = adress;
	}

	void printDate(){
		System.out.println
		("名前＞" + name + 
				"\n年齢＞" + age + 
				"\n電話番号＞" + tel +
				"\n住所＞" + adress + "\n");
	}
}
