/*
 * 과제:J8_AirplaneFinder
 * 이름:송주환	
 * 학번:201814133
 */
import java.io.*;
import java.util.*;

public class AirplaneFinder {
	static HashMap<String,Airplane> h = new HashMap<String,Airplane>();
	Scanner scanner=new Scanner(System.in);
	public void readAirplaneFile() {
		FileReader fin=null;
		BufferedReader read=null;
		try {
			fin = new FileReader("C:\\Java\\airplane.txt");
			read= new BufferedReader(fin);
			String Line="";
			while((Line=read.readLine())!=null) {
				String [] array=Line.split(" ");
				String id=array[0];
				String company=array[1];
				int passenger=Integer.parseInt(array[2]);
				Airplane airplane=new Airplane(id,company,passenger);
				h.put(id, airplane);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}
	public void writeAirplaneFile() {
		FileWriter write=null;
		try {
			write =new FileWriter("C:\\Java\\airplane.txt",true);
			while(true) {
				System.out.print("새로운 비행기 정보를 입력하시겠습니까? (Y/N): ");
				String answer =scanner.next();
				if (answer.equals("Y"))
				{
					System.out.print("비행기 식별번호: ");
					String id= scanner.next(); 
					System.out.print("비행기 제조회사: ");
					String company= scanner.next(); 
					System.out.print("비행기 탑승인원: ");
					int passenger= scanner.nextInt();
					write.write("\r\n");
					write.write(id+" "+company+" "+passenger);
					System.out.println();
				}
				else if(answer.equals("N"))
					break;
			}
			write.close();
		}
		catch(IOException e){
			System.out.println("파일 입출력 오류");
		}
	}
	void findAirplane() {
		System.out.print("검색할 비행기 식별번호를 입력하세요: ");
		String id=scanner.next();
		if(h.get(id)==null)
			System.out.println("존재하지 않는 비행기 식별번호 입니다.");
		else
			System.out.println(h.get(id));
		System.out.println();
	}
	public static void main(String[] args) {
		AirplaneFinder a=new AirplaneFinder();
		a.readAirplaneFile();
		a.findAirplane();
		a.writeAirplaneFile();
	}
}