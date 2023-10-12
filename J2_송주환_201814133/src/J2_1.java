/*
 * 과제:j2_1
 * 이름:송주환	
 * 학번:201814133
*/

import java.util.Scanner;
public class J2_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start,end,mul;
		System.out.print("시작: ");
		start=scanner.nextInt();
		System.out.print("종료: ");
		end=scanner.nextInt();
		System.out.print("배수: ");
		mul=scanner.nextInt();
		int sum=0;
		int sum2=0;
		int x=start;
		//반복 횟수를 알수 없으므로 while문을 쓴다.
		while(x>=start&x<=end) {
			if(x%mul==0) {
				sum+=x;
			}
			else {
				sum2+=x;
			}
			x++;
		}
		System.out.println(start+"부터 "+end+"까지 "+mul+"의 배수에 속하는 수들의 합:"+sum);
		System.out.println(start+"부터 "+end+"까지 "+mul+"의 배수를 제외한 수들의 합:"+sum2);
		scanner.close();
	}

}
