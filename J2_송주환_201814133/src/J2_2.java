/*
 * 과제:j2_2
 * 이름:송주환	
 * 학번:201814133
*/
import java.util.Scanner;
public class J2_2 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
			int money;
			
			System.out.print("금액을 입력하시오: ");
			money=scanner.nextInt();
			//unit.length=배열의 개수
			for(int i=0;i<unit.length;i++) {
				if(money/unit[i]==0) {
					System.out.print("");
				}
				else 
				{
				 System.out.println(unit[i]+"원 짜리: "+ money/unit[i]+"개");
		         money = money - (money / unit[i])*unit[i];  //
					}				
				}
			scanner.close();
			}
		}


