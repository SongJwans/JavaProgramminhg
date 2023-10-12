/*
 * 과제:J8_Airplane
 * 이름:송주환	
 * 학번:201814133
 */
public class Airplane {
	
	private String id,company;
	private int passenger;

	public Airplane(String id,String company, int passenger) {
		this.id=id;
		this.company=company;
		this.passenger=passenger;
	}	
	public String getID() {return this.id;}
	public String getCompany() {return this.company;}
	public int getPassenger() {return this.passenger;}
	
	@Override
	public String toString() {
		return getID()+" "+getCompany()+" "+getPassenger();
	}

}
