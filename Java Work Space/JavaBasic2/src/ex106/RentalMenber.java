package ex106;

public class RentalMenber{
	static int	allID =1; 			//累計会員 No
	int id ;				//会員 ID
	String name;			//会員名
	String driverLicenseNo;	//免許証番号
	CD[ ] rentalCDs = new CD[2];
	Video[ ] rentalVideos = new Video[2];

	RentalMenber(String name, String driverLicenseNo){
		this.name=name;
		this.driverLicenseNo=driverLicenseNo;
		id = allID++;

	}
	public void doRentalCD(CD rentalCD){
		for(int i=0;i<rentalCDs.length;i++){
			if(rentalCDs[i]==null){
				rentalCDs[i]=rentalCD;
				break;
			}
			if(i==rentalCDs.length){
				System.out.println("既に2枚借りています");
			}
		}
	}
	public void doRentalVideo(Video rentalVideo){
		for(int i=0;i<rentalVideos.length;i++){
			if(rentalVideos[i]==null){
				rentalVideos[i]=rentalVideo;
				break;
			}
			if(i==rentalCDs.length){
				System.out.println("既に2枚借りています");
			}
		}
	}

	public String toString(){
		return "会員 ID:" + id + "会員名:" + name + "\n借入 CD\n" 
				+ (rentalCDs[0]==null?"":rentalCDs[0].toString())
				+ (rentalCDs[1]==null?"":rentalCDs[1].toString())
				+"\n借入　Video"
				+ (rentalVideos[0]==null?"":rentalVideos[0].toString())
				+ (rentalVideos[1]==null?"":rentalVideos[1].toString())
				+ "\n\n";
	}


}
