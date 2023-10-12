/*
 * 과제:J6_Weapon
 * 이름:송주환	
 * 학번:201814133
 */
package Airplane;
interface Weapon {
	String [] weaponList= {"미사일", "레이저", "폭탄"};
	void loadWeapon();
	void showWeapon();
	void selectWeapon();
}
