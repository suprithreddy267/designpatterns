package com.suprith.designpatterns;

interface Bird 
{  
	public void fly(); 
	public void makeSound(); 
} 
class Sparrow implements Bird 
{ 
	public void fly() 
	{ 
		System.out.println("Flying"); 
	} 
	public void makeSound() 
	{ 
		System.out.println("Chirp Chirp"); 
	} 
} 

interface ToyDuck 
{  
	public void squeak(); 
} 

class PlasticToyDuck implements ToyDuck 
{ 
	public void squeak() 
	{ 
		System.out.println("Squeak"); 
	} 
} 

class BirdAdapter implements ToyDuck 
{  
	Bird bird; 
	public BirdAdapter(Bird bird) 
	{ 
		this.bird = bird; 
	} 

	public void squeak() 
	{ 
		bird.makeSound(); 
	} 
} 

public class StructuralAdapterBird 
{ 
	public void adapts() {
		Sparrow sparrow = new Sparrow(); 
		ToyDuck toyDuck = new PlasticToyDuck(); 
		ToyDuck birdAdapter = new BirdAdapter(sparrow); 
		System.out.print("Sparrow does "); 
		sparrow.fly(); 
		sparrow.makeSound(); 
		System.out.print("ToyDuck does "); 
		toyDuck.squeak(); 
		System.out.println("BirdAdapter toyduck does ..."); 
		birdAdapter.squeak(); 
	} 
} 