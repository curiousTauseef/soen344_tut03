
public class SugarDecorator extends CoffeeDecorator {

	public SugarDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}
	
	public double getCost(){
		return this.decoratedCoffee.getCost() + 0.25;
	}
	
	public String getIngredients(){
		return this.decoratedCoffee.getIngredients() + " Sugar";
	}
}
