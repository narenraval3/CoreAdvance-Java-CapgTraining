package Has_A;

public class Driver 
{
	private Car car;   //Driver has a Car
	private String DriverName;
	
	public void setCar(Car car)
	{
		this.car = car;
	}
	
	public Car getCar()
	{
		return car;
	}
	
	//setter & getter for Driver Name----------------
	public void setDriverName(String DriverName)
	{
		this.DriverName = DriverName;
	}
	public String getDriverName()
	{
		return DriverName;
	}
}
