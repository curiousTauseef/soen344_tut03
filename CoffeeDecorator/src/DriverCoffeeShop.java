
public class DriverCoffeeShop {
	public static void main(String[] args) {
		Coffee c1 = new MilkDecorator(new SprinklesDecorator(new MilkDecorator(new Filtered())));
		printCoffee(c1);
		
		Coffee e1 = new SprinklesDecorator(new MilkDecorator(new Expresso()));
		printCoffee(e1);
	}
	
	public static void printCoffee(Coffee c){
		System.out.println("Ingredients: " + c.getIngredients());
		System.out.println("Price: " + c.getCost());
	}
}
