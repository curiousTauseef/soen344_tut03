
public abstract class AbstractCoffeeDecorator extends Coffee{
	protected Coffee decoratedCoffee;
	
	public AbstractCoffeeDecorator(Coffee decoratedCoffee){
		this.decoratedCoffee = decoratedCoffee;
	}
	
}
