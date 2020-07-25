package com.suprith.designpatterns;

class Cookie{
	String flavor="Chocolate";
	String toppings="nuts";
	public String getFlavor() {
		return(this.flavor);
	}
	public void setFlavor(String flavor) {
		this.flavor=flavor;
	}
	public void setToppings(String toppings) {
		this.toppings=toppings;
	}
	public String getToppings() {
		return(this.toppings);
	} 
}
class ButterCookie extends Cookie{
	public void setFlavor() {
		this.flavor="Butter";
	}
}
class BehavioralStrategy{
	public void getCookie() {
		Cookie cookie=new ButterCookie();
		System.out.println("Your cookie is ready "+
		cookie.getFlavor()+" with"+cookie.getToppings());
		cookie=new Cookie();
		cookie.setFlavor("Vanilla");
		cookie.setToppings("Choco chips");
		System.out.println("Your cookie is ready "+
		cookie.getFlavor()+" with "+cookie.getToppings());
	}
}