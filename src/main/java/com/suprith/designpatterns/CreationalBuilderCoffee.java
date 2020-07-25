package com.suprith.designpatterns;

public class CreationalBuilderCoffee{
    private String type;
    private boolean sugar;
    private boolean milk;
    private int serves;
    CreationalBuilderCoffee(String type,boolean sugar,boolean milk,int serves)
    {
    	this.type=type;
    	this.sugar=sugar;
    	this.milk=milk;
    	this.serves=serves;
    }

public String toString() {
return String.format
("Coffee [Type=%s, Sugar=%s, Milk=%s, Serves=%d]", this.type, this.sugar, this.milk, this.serves);
}
}
