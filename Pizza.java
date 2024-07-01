import java.util.*;
public class Pizza {
private int price;
private Boolean veg;

private int extraCheesePrice=100;
private int extraToppingsPrice=150;
private int takeAwayPrice=20;
private int basePizzaPrice;
private boolean isExtraCheeseAdded=false;
private boolean isExtraToppingsAdded=false;
private boolean isOptedForTakeAway=false;

Scanner sc= new Scanner(System.in);
public Pizza(Boolean veg) {
	this.veg=veg;
	if(this.veg) {
		this.price=300;
	}
	else {
		this.price=400;
	}
	
basePizzaPrice=this.price;	
}

public void addExtraCheese() {
	
	System.out.print("boolean extracheese value : ");
	boolean isExtraCheeseAdded = sc.nextBoolean();
	if( isExtraCheeseAdded==true)
	{	
	this.price +=extraCheesePrice ;
	System.out.println("Enter extracheese value : "+ this.price);
	}
	else {
		isExtraCheeseAdded=false;
		this.price =this.price ;
		}
}


public void addExtraToppings() {
	
	System.out.print("boolean extraToppings value:");
	boolean isExtraToppingsAdded = sc.nextBoolean();
	if( isExtraToppingsAdded==true)
	{	
	this.price +=extraToppingsPrice ;
	System.out.println("Enter extraToppings value : "+this.price);
		
	}
	else {
		isExtraToppingsAdded=false;
		this.price =this.price ;
	}	
}

public void addtakeAway() {
	System.out.print("boolean TakeAway  value: ");
	boolean istakeAwayAdded = sc.nextBoolean();
	if( istakeAwayAdded==true)
	{	
	this.price += takeAwayPrice ;
	System.out.println("Enter TakeAway value : "+this.price);
	}
	else {
		istakeAwayAdded=false;
		this.price =this.price ;
	}
}

public void getBill() {
	String bill="";
	System.out.println("Pizza:"+basePizzaPrice);
	if(isExtraCheeseAdded) {
		bill +="extra cheese added:"+ extraCheesePrice+ "\n";
		
	}
	if(isExtraToppingsAdded) {
		bill +="extra toppings added:"+ extraToppingsPrice+ "\n";
	}
	if(isOptedForTakeAway) {
		bill +="takeAwayOpted:"+takeAwayPrice+ "\n";
	}
	bill +="Bill: " +this.price + "\n";
	System.out.println(bill);
}

	public static void main(String[] args  ) {
		
Pizza basePizza=new Pizza(false);

basePizza.addExtraCheese();
basePizza.addExtraToppings();
basePizza.addtakeAway();
basePizza.getBill();
	}

}