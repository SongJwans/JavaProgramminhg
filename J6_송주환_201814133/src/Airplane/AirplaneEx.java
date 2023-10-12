/*
 * 과제:J6_AirplaneEx
 * 이름:송주환	
 * 학번:201814133
 */
package Airplane;
public class AirplaneEx {
	public static void main(String[] args) {
		Airliner A = new Airliner("A100",300);
		A.showInfo();
		A.takeoff();
		A.flight();
		A.landing();
		Fighter B = new Fighter("F300",false);
		B.showInfo();
		B.loadWeapon();
		B.takeoff();
		B.flight();
		B.showWeapon();
		B.selectWeapon();
		B.landing();
	}
}

