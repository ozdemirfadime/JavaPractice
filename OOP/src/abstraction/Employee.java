package abstraction;

public class Employee extends Custumer{
	private String emplId;

	public String getEmplId() {
		return emplId;
	}

	public void setEmplId(String emplId) {
		this.emplId = emplId;
	}
	@Override
	public String  getCustumerInfo() {
		return String.format(" custumer %s empleyee id %s name %s adres",getName(),getEmplId(),getAddress());
		
	}
	

}
