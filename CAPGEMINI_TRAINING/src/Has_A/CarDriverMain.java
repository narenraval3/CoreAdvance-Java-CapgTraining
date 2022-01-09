package Has_A;

public class CarDriverMain {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.setCarName("Lamborghini");
		
		
		Driver d = new Driver();
		d.setDriverName("Baalu");
		
		c.setDriver(d);
			
		System.out.println(c.getDriver().getDriverName());
		
		System.out.println(c.getCarName());
	}

}
