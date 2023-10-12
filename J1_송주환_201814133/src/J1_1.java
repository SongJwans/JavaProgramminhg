/*
 * 과제:j1_1
 * 이름:송주환	
 * 학번:201814133
*/

import java.util.Scanner;
public class J1_1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
	
		System.out.print("이름:");
		String name=scanner.next();
		System.out.print("생년:");	
		int age=scanner.nextInt();
		
		
		System.out.println("이름은 "+name+"이고 "+(2022-age)+"이다.");
		
		scanner.close();
	}

}