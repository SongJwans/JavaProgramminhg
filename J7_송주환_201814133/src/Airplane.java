/*
 * 과제:J6_Airplane
 * 이름:송주환	
 * 학번:201814133
 */
public class Airplane {

	private String company,type,id;

	public Airplane(String company,String type, String id) {
		this.company=company;
		this.type=type;
		this.id=id;
	}//생성사 설정
	String getCompany() 
	{		return company;
	}
	String getType() {
		return type;
	}
	String getID() {
		return id;
	}
}
