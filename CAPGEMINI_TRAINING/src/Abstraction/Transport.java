package Abstraction;

abstract class Vehicle
{
	public abstract void Bus();
	
	public void Car()
	 {
		 System.out.println("This is Complete Method's Private Car");
	 }
	
	public static void Plane()
	{
		System.out.println("This is Static Method's Plane");
	}
}

class PublicVehicle extends Vehicle
{
	public void Bus()
	{
		System.out.println("Public Bus");
	}
}

public class Transport {

	public static void main(String[] args) {
		
		PublicVehicle pv = new PublicVehicle();
		pv.Bus();
		pv.Car();
			
		Vehicle.Plane();  //Or,
		//pv.Plane(); 
		
	}
}
