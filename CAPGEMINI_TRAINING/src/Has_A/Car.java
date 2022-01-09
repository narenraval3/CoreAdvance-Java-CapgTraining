package Has_A;

public class Car 
{
	private Driver driver; //Car has a driver
	private String CarName;
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public Driver getDriver() {
		return driver;
	}
	
	//setter & getter for Car Name-----------------
	public void setCarName(String CarName)
	{
		this.CarName = CarName;
	}
	public String getCarName()
	{
		return CarName;
	}
}
