/*
 * 과제:J6_AirplaneManager
 * 이름:송주환	
 * 학번:201814133
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class AirplaneManager {
	ArrayList<Airplane> A = new ArrayList<Airplane>();
	int count=1;
	static Scanner scanner=new Scanner(System.in);
	void regist() { //비행기 등록 기능
		System.out.println("=== 아래 정보를 입력하세요.===");
		System.out.print("비행기 제조회사: ");
		String company=scanner.next();
		System.out.print("비행기 타입정보: ");
		String type = scanner.next();
		System.out.println();
		String id =generateID(company, type);
		Airplane airplane= new Airplane(company, type,id);
		A.add(airplane);//Airplane 객체를 ArrayList에 순차적으로 저장
	}
	String generateID(String company, String type) {//인수로 전달받아 "(String company, String type)"
		
		String id="";
		if(company.equals("아시아나"))
			id+="A";
		else if(company.equals("대한항공"))
			id+="K";
		else
			id+="Z";
		if(type.equals("여객기"))
			id+="L";
		else if(type.equals("전투기"))
			id+="F";
		else
			id+="Z";
		id +=String.format("%03d",count);
		count++;
		return id;
	}
	
	void showAll() {
		Iterator<Airplane> it=A.iterator();
		while(it.hasNext()) {
			System.out.println("--------------------------");
			Airplane airplane=it.next();
			System.out.println("비행기 제조회사: "+airplane.getCompany());
			System.out.println("비행기 타입정보: "+airplane.getType());
			System.out.println("비행기 식별번호: "+airplane.getID());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		AirplaneManager manager=new AirplaneManager();
		manager.regist();
		manager.regist();
		manager.regist();
		scanner.close();
		manager.showAll();
	}
}
