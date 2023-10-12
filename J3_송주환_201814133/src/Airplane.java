/*
 * 과제:J3_Airplane
 * 이름:송주환	
 * 학번:201814133
*/
public class Airplane {
		String model,company;
		int number;
		void setModel(String model){
			this.model=model;
		}//: 비행기 모델을 설정
		void setCompany(String company){
			this.company=company;
		}// 비행기 회사을 설정
		void setNumber(int number){
			this.number=number;
		}//최대 승객수을 설정
		String getModel() {
			return model;
		}//비행기모델을 반환
		String getCompany() {
			return company;
		}//비행기회사를 반환
		int getNumber() {
			return number;
		}//최대 승객수를 반환
		
		public void showAirplane() {
			System.out.println("비행기 모델: "+getModel());
			System.out.println("비행기 회사: "+getCompany());
			System.out.println("최대 승객수: "+getNumber());
			System.out.println();
		}//위 메소드를 활용하여 모델,회사,승객수를 출력하는 메소드
		//생성자 시작
		public Airplane() {}//기본 생성자
		public Airplane(String model, String company) {
			this.model=model;
			this.company=company;
		}
		public Airplane(String model, String company, int number) {
			this.model=model;
			this.company=company;
			this.number=number;
		}
		
	public static void main(String[] args) {
		
		Airplane plane1;
		plane1= new Airplane();
		plane1.setModel("A100");
		plane1.setCompany("아시아나");
		plane1.setNumber(300);
		plane1.showAirplane();
		
		Airplane plane2;
		plane2= new Airplane("K300","코리아나");
		plane2.setNumber(400);
		plane2.showAirplane();
		
		Airplane plane3;
		plane3= new Airplane("S200","성공회에어",500);
		plane3.showAirplane();
		

	}

}
