package com.suprith.designpatterns;
abstract class Vehicle{
	Factory vehicle1,vehicle2;
	Vehicle(Factory vehicle1,Factory vehicle2)
	{
		this.vehicle1=vehicle1;
		this.vehicle2=vehicle2;
	}
	abstract public void manufacture();
}
class Car extends Vehicle { 
	public Car(Factory vehicle1, Factory vehicle2) 
	{ 
		super(vehicle1, vehicle2); 
	} 

	@Override
	public void manufacture() 
	{ 
		System.out.print("Car "); 
		vehicle1.work(); 
		vehicle2.work(); 
	} 
} 

// Refine abstraction 2 in bridge pattern 
class Bike extends Vehicle { 
	public Bike(Factory vehicle1,Factory vehicle2) 
	{ 
		super(vehicle1, vehicle2); 
	} 

	@Override
	public void manufacture() 
	{ 
		System.out.print("Bike "); 
		vehicle1.work(); 
		vehicle2.work(); 
	} 
} 
interface Factory{
	public void work();
}

class Produce implements Factory { 
	public void work() 
	{ 
		System.out.print("Produced"); 
	} 
} 

class Assemble implements Factory { 
	public void work() 
	{ 
		System.out.println(" And\n"+"Assembled!"); 
	} 
} 
public class StructuralBridgeVehicle{
	public void bridge() {
		Vehicle fourWheeler = new Car(new Produce(), new Assemble()); 
       fourWheeler.manufacture(); 
        Vehicle threeWheeler = new Bike(new Produce(), new Assemble()); 
        threeWheeler.manufacture();
	}
}
