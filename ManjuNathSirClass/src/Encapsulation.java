
public class Encapsulation {
	
	private int airId;
	private String airName;
	
	public int getAirId()
	{
		return airId;
	}
	public void setAirId(int airId)
	{
		this.airId = airId;
	}
	
	public void setAirName(String airName)
	{
		this.airName = airName;
	}
	public String getAirName()
	{
		return airName;
	}

	public static void main(String[] args) {
		
		Encapsulation enc = new Encapsulation();
		enc.getAirId();
		enc.getAirName();
	}

}
