
public class Trio implements MenuItem {
//fields
	private String name;
private double price;
	Sandwich sandwich;
	Salad salad;
	Drink drink;
//constructors
public Trio(Sandwich aSandwich, Salad aSalad, Drink aDrink){
	this.sandwich = aSandwich;
	this.salad = aSalad;
	this.drink = aDrink;
	this.name = aSandwich.getName() + "/"+ aSalad.getName() +"/"+aDrink.getName();
    if ((aSandwich.getPrice() < aSalad.getPrice()) && (aSandwich.getPrice() < aDrink.getPrice())){
        this.price = aSalad.getPrice() + aDrink.getPrice();
    }else if (aSalad.getPrice() < aDrink.getPrice()){
        this.price = aSandwich.getPrice() + aDrink.getPrice();
    }else{
        this.price = aSandwich.getPrice() + aSalad.getPrice();
    }
}

//method	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
//method
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
}
