
/*
 * 과제:J5_AirplaneEx
 * 이름:송주환	
 * 학번:201814133
 */
public class AirplaneEx {
	public static void main(String[] args) {
		Airliner A = new Airliner("A100");
		A.showInfo();
		Airliner B = new Airliner("A200",500);
		B.showInfo();
		Fighter C = new Fighter("F300");
		C.showInfo();
		Fighter D = new Fighter("F400",true);
		D.showInfo();

	}

}
