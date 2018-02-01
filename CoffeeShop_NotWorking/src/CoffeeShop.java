
public class CoffeeShop {

	public static void main(String[] args) {
		Coffee c1 = new SugarDecorator(new MilkDecorator(new MexicanCoffee()));
		printCoffee(c1);
		c1 = new SugarDecorator(c1);
		printCoffee(c1);
		
	}

	public static void printCoffee(Coffee c){
		System.out.println("Cost: "+ c.getCost());
		System.out.println("Ingredients: "+ c.getIngredients());
	}
}
