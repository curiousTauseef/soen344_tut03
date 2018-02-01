
public class MilkDecorator extends AbstractCoffeeDecorator {

	public MilkDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
		this.decoratedCoffee.addToCost(0.80);
		this.decoratedCoffee.addIngredient(" Milk");
	}

}
