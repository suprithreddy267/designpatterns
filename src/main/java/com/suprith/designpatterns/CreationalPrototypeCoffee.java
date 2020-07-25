package com.suprith.designpatterns;

interface CoffeeInf{
	CoffeeInf clone();
}
class CoffeeAtTable1 implements CoffeeInf{
    private String type;
    private int serves;
    CoffeeAtTable1(String type,int serves)
    {
    	this.type=type;
    	this.serves=serves;
    }
    public CoffeeInf clone() {
    	return(new CoffeeAtTable1("Espresso",2)); 
     }
	public String toString() {
        return String.format
       ("Coffee [Type=%s, Serves=%d]", this.type, this.serves);
    }
}
class CoffeeAtTable2 implements CoffeeInf{
	 private String type;
     private int serves;
     CoffeeAtTable2(String type,int serves)
     {
     	this.type=type;
     	this.serves=serves;
     }
     public CoffeeInf clone() {
    	return(new CoffeeAtTable2("Mocha",3)); 
     }
	public String toString() {
	return String.format
	("Coffee [Type=%s, Serves=%d]", this.type, this.serves);
	}
}
public class CreationalPrototypeCoffee{
	
	public String getOrders(int num)
	{
		if(num==1) {
		CoffeeAtTable1 table1 = new CoffeeAtTable1("Espresso",2);
		 table1.clone();
		return(table1.toString());
		}
		else if(num==2)
		{
			CoffeeAtTable2 table2 = new CoffeeAtTable2("Mocha",3);
			 table2.clone();
			return(table2.toString());
		}
		else {
			return("Sorry all tables are booked!!Please wait for some time");
		}
	}
}
