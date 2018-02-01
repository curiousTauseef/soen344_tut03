
public class SugarDecorator extends AbstractCoffeeDecorator {

	public SugarDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
		this.decoratedCoffee.addToCost(0.10);
		this.decoratedCoffee.addIngredient(" Sugar");
	}

}
