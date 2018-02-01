

public class MilkDecorator extends CoffeeDecorator {

	public MilkDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}

	@Override
	public double getCost() {
		return this.decoratedCoffee.getCost() + 0.75;
	}

	@Override
	public String getIngredients() {
		return this.decoratedCoffee.getIngredients() + " Milk";
	}

}
