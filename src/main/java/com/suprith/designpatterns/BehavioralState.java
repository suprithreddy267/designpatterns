package com.suprith.designpatterns;

interface MobileState 
{ 
	public void alert(AlertState state); 
} 

class AlertState
{ 
	private MobileState currentState; 

	public AlertState() 
	{ 
		currentState = new Vibration(); 
	} 

	public void setState(MobileState state) 
	{ 
		currentState = state; 
	} 

	public void alert() 
	{ 
		currentState.alert(this); 
	} 
} 

class Vibration implements MobileState 
{ 
	public void alert(AlertState st) 
	{ 
		System.out.println("Vibration mode set"); 
	} 

} 

class Silent implements MobileState 
{ 
	public void alert(AlertState st) 
	{ 
		System.out.println("Silent mode set"); 
	} 

} 
public class BehavioralState{
	public void changeState() {
		AlertState state=new AlertState();
		state.alert();
		state.setState(new Silent());
		state.alert();
	}
}
