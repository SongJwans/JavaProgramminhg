/*
 * 과제:J5_Airplane
 * 이름:송주환	
 * 학번:201814133
 */
public class Airplane { 
	private String id, type; 
	void setID(String id){
		this.id=id;
	}// 식별 번호를 설정하는 메소드
	void setType(String type){
		this.type=type;
	}// 비행기 타입을 설정하는 메소드
	String getID() {
		return this.id;
	}// 식별 번호를 반환하는 메소드
	String getType() {
		return this.type;
	}// 비행기 타입을 반환하는 메소드
	public void showInfo() {
		System.out.println("식별 번호: "+getID());
		System.out.println("비행기 타입: "+getType());
	}// 식별 번호와 비행기 타입을 출력하는 메소드
	public Airplane(String id, String type) {
		setID(id);
		setType(type);
	}//생성사 설정
}//Airplane 클래스
class Airliner extends Airplane{
	private int passenger;//탑승 인원수
	public Airliner(String id) {
		super(id, "여객기");
		setPassenger(0);
	}
	public Airliner(String id, int passenger) {
		super(id, "여객기");
		setPassenger(passenger);
	}
	void setPassenger(int passenger) {
		this.passenger=passenger;
	}//탑승 인원수를 설정
	int getPassenger() {
		return this.passenger;
	}//탑승 인원수를 반환
	public void showInfo() {
		System.out.println("식별 번호: "+getID());
		System.out.println("비행기 타입: "+getType());
		System.out.println("탑승 인원수: "+getPassenger());
		System.out.println();
	}
}
class Fighter extends Airplane{
	private boolean stealth;
	public Fighter(String id) {
		super(id, "전투기");
		stealthOff();
	}
	public Fighter(String id, boolean stealth) {
		super(id , "전투기");
		if(stealth==true)
			stealthOn();
		else 
			stealthOff();
	}
	void stealthOn() {
		stealth=true;
	}
	void stealthOff() {
		stealth=false;
	}
	boolean getStealth(){
		return stealth;
	}
	public void showInfo() {
		System.out.println("식별 번호: "+getID());
		System.out.println("비행기 타입: "+getType());
		System.out.println("스텔스 모드: "+getStealth());
		System.out.println();
	}// 오버라이딩
}
