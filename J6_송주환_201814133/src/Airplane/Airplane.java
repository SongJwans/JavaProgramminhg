/*
 * 과제:J6_Airplane
 * 이름:송주환	
 * 학번:201814133
 */
package Airplane;
import java.util.Scanner;
public abstract class Airplane { 
	private String id, type; 
	abstract void takeoff();//비행기가 이륙하는 메소드
	abstract void landing();//비행기가 착륙하는 메소드
	abstract void flight();//비행기가 주행하는 메소드
	abstract void showInfo();
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
	void takeoff() {
		System.out.println(getType()+" "+getID()+"가 이륙합니다.");
	}
	void landing() {
		System.out.println(getType()+" "+getID()+"가 착륙합니다.");
	}
	void flight() {
		System.out.println(getType()+" "+getID()+"가 비행합니다.");
	}
	public void showInfo() {
		System.out.println("식별 번호: "+getID());
		System.out.println("비행기 타입: "+getType());
		System.out.println("탑승 인원수: "+getPassenger());
		System.out.println();
	}
}
class Fighter extends Airplane implements Weapon{// Fighter 클래스는 Weapon 인터페이스를 구현한다.
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
		System.out.println();
		System.out.println("식별 번호: "+getID());
		System.out.println("비행기 타입: "+getType());
		System.out.println("스텔스 모드: "+getStealth());
		System.out.println();
	}// 오버라이딩
	void takeoff() {
		System.out.println(getType()+" "+getID()+"가 이륙합니다.");
	}
	void landing() {
		System.out.println(getType()+" "+getID()+"가 착륙합니다.");
	}
	void flight() {
		System.out.println(getType()+" "+getID()+"가 비행합니다.");
	}

	public void loadWeapon() {
		System.out.println(getID()+" 무기 장착");
		for(int i=0;i<weaponList.length;i++) {
			System.out.println(weaponList[i]+" 무기가 장착되었습니다.");
		}
		System.out.println();
	}//반복문을 활용하여 weapongList 배열에 저장된 무기를 장작한다.
	public void showWeapon() {
		System.out.println(getID()+" 무기 목록");
		for(int i=0; i<weaponList.length; i++) {
			System.out.println((i+1)+": "+weaponList[i]);
		}
	}
	public void selectWeapon() {
		Scanner scanner= new Scanner(System.in);
		System.out.print("무기를 선택하시오: ");
		int weapon= scanner.nextInt();
		switch(weapon) {
		case 1:
			System.out.println(weaponList[--weapon]+"이 발사되었습니다.");
			break;
		case 2:	
			System.out.println(weaponList[--weapon]+"가 발사되었습니다.");
			break;
		case 3:
			System.out.println(weaponList[--weapon]+"이 투하되었습니다.");
			break;
		}
		System.out.println();
		scanner.close();
	}
}
