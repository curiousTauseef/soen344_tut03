

public class SprinklesDecorator extends CoffeeDecorator{

	public SprinklesDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}

	public double getCost() {
		return this.decoratedCoffee.getCost() + 0.10;
	}

	public String getIngredients() {
		return this.decoratedCoffee.getIngredients() + " Sprinkles";
	}

}
