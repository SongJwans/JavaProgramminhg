/*
 * 과제:j1_2
 * 이름:송주환	
 * 학번:201814133
*/
import java.util.Scanner;
public class J1_2 {

	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			
			
			System.out.print("첫 번째 실수를 입력하세요: ");
			double a=scanner.nextDouble();
			System.out.print("두 번째 실수를 입력하세요:");	
			double b=scanner.nextDouble();
			System.out.print("세 번째 실수를 입력하세요:");	
			double c=scanner.nextDouble();
			
			if(a<b) 
			{
					if(a<c)
						System.out.print("세 실수 중 가장 작은 수는 "+a+"입니다.");
					else	
						System.out.print("세 실수 중 가장 작은 수는 "+c+"입니다.");
					}
		
			else {
					if(b<c)
						System.out.print("세 실수 중 가장 작은 수는 "+b+"입니다.");
					else
						System.out.print("세 실수 중 가장 작은 수는 "+c+"입니다.");
			}
				
			scanner.close();
			}
	}