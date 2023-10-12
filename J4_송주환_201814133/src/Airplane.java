/*
 * 과제:J4_Airplane
 * 이름:송주환	
 * 학번:201814133
 */
public class Airplane { 
	private String model,company;
	private int number;
	private double milege,fuel=0;
	private final double L=36.5;//연비는 1.0km당 36.5L가 필요하다고 가정
	private static int total;//누적 승객 인원수
	static int total() {
		return total;
	}//누적 승객 인원수를 반환하는 메소드
	void setModel(String model){
		this.model=model;
	}// 비행기 모델을 설정
	void setCompany(String company){
		this.company=company;
	}// 비행기 회사을 설정
	void setNumber(int number){
		this.number=number;
	}// 탑승 인원수을 설정
	String getModel() {
		return model;
	}// 비행기 모델을 반환
	String getCompany() {
		return company;
	}// 비행기 회사를 반환
	int getNumber() {
		return number;
	}// 탑승 인원수를 반환
	void addFuel (double fuel){ 
		this.fuel+=fuel;} //주입할 연료량 정보를 전달 받아 현재 연료량을 증가하는 메소드
	void getMilege(double milege) {
		this.milege=milege;
	}// 총 비행거리를 반환하는 메소드
	double getFuel() {
		return fuel;
	}// 현재 연료량을 반환하는 메소드 

	public void flight() {
		getFuel();
		if(this.milege*L<this.fuel) {
			total+=this.number;//누적 승객 인원수
			this.fuel-=this.milege*L;//현재 연료량
			System.out.println("비행 가능");
			System.out.println();
		}
		else {
			this.milege=0;//현재 연료량
			System.out.println("비행 불가");
			System.out.println();
		}
	}
	public void showAirplane() {
		System.out.println("비행기 번호: "+getModel());
		System.out.println("비행기 회사: "+getCompany());
		System.out.println("탑승 인원수: "+getNumber()+"명");
		System.out.println("총 비행거리: "+this.milege+"km");
		System.out.println("현재 연료량: "+this.fuel+"L");
		System.out.println();
	}
	public Airplane(String model, String company, int number) {
		this.model=model;
		this.company=company;
		this.number=number;
	}//생성사 설정
}
