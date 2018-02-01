
public class SprinklesDecorator extends AbstractCoffeeDecorator {

	public SprinklesDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
		this.decoratedCoffee.addToCost(0.30);
		this.decoratedCoffee.addIngredient(" Sprinkles");
	}

}
