/*
 * 과제:J4_AirplaneEx
 * 이름:송주환	
 * 학번:201814133
 */
import java.util.Scanner;
class AirplaneEx {
	public static void main(String[] args) {
		Airplane [] Ex=new Airplane[3];
		Scanner scanner=new Scanner(System.in);
		System.out.println("[비행기 정보 입력]");
		for(int i=0;i<Ex.length;i++) {
			System.out.print("비행기 모델: ");
			String model=scanner.next();
			System.out.print("비행기 회사: ");
			String company=scanner.next();
			System.out.print("탑승 인원수: ");
			int number=scanner.nextInt();
			System.out.println();
			Ex[i]=new Airplane(model,company,number);//배열 원소 객체 생성
		}
		System.out.println("[주입할 연료 및 비행할 거리 입력]" );
		for(int i=0;i<Ex.length;i++) {
			System.out.print(Ex[i].getModel()+"("+Ex[i].getCompany()+") 주입할 연료: ");
			double fuel=scanner.nextDouble(); 
			Ex[i].addFuel(fuel);    
			System.out.print(Ex[i].getModel()+"("+Ex[i].getCompany()+") 비행할 거리: ");
			double milege=scanner.nextDouble();
			Ex[i].getMilege(milege);
			Ex[i].flight();
		}
		System.out.println("[비행기 정보 출력]");
		for(int i=0;i<Ex.length;i++) {
			Ex[i].showAirplane();
		}
		System.out.println("[누적 승객 인원수 정보 출력]");
		System.out.println("누적 승객 인원 수: "+Airplane.total()+"명");
		scanner.close();
	}
}