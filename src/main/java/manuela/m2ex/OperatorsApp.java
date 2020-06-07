package manuela.m2ex;

public class OperatorsApp {
	
	public static void main(String[] args) {
	
	String CarModel = "Fiat Cinquecento";
	
	double price = 20000.00;
	
	double moneyInBank = 179000.00;
	
	boolean isDamaged = true;
	
	System.out.println("car model: " + CarModel +" " + "Price: €" + price);
	
	double priceIncremented = price + 1000;
	System.out.println("The price with increment is: " + priceIncremented);
	
	double priceDecremented = price - 1000;
	System.out.println("The price with increment is: " + priceDecremented);
	
	double yourMoneyLeft = moneyInBank - price;
	System.out.println("Your money left: " + yourMoneyLeft);
	
	String damagedText = !isDamaged ? "The car is damaged." : "The car isn't damaged.";
	System.out.println(damagedText);
	
	String worthSeeingMessage = !isDamaged || price < 20000 ? "It's worth seeing the car." : "It's not worth seeing the car.";
    System.out.println(worthSeeingMessage);
    
    String worthRepairing = isDamaged && price <= 20000.00 ? "It's worth repairing the car." : "It's not worth repairing the car.";
    System.out.println(worthRepairing);
    
    price += 1000;
    System.out.println("Increased price: €" + price);
    price -= 1000;
    System.out.println("Decreased price: €" + price);
    price *= 2;
    System.out.println("Doubled price: €" + price);
    price /= 2;
    System.out.println("Half price: €" + price);
    price %= 10000;
    System.out.println("Remained price: €" + price);
	
	}
	
}
