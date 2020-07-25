package com.suprith.designpatterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	System.out.println("\nUsing Creational Design Pattern\n");
        CreationalBuilderCoffee coffee=new CreationalBuilderCoffee("Capuccino",true,true,1);
        System.out.println(coffee);
        System.out.println();
        CreationalPrototypeCoffee table=new CreationalPrototypeCoffee();
        System.out.println("Table-1:"+table.getOrders(1));
        System.out.println("Table-2:"+table.getOrders(2));
        System.out.println("\nUsing Structural Design Pattern\n");
        StructuralAdapterBird bird=new StructuralAdapterBird();
        bird.adapts();
        System.out.println();
        StructuralBridgeVehicle vehicle=new StructuralBridgeVehicle();
        vehicle.bridge();
        System.out.println("\nUsing Behavioral Design Pattern\n");
        BehavioralState mobile=new BehavioralState();
        mobile.changeState();
        System.out.println();
        BehavioralStrategy cookie=new BehavioralStrategy();
        cookie.getCookie();;
    }
}
