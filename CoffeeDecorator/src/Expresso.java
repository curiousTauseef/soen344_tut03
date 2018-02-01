
public class Expresso extends Coffee{
	public Expresso(){
		super();
	}

	@Override
	public double getCost() {
		return 2.5;
	}

	@Override
	public String getIngredients() {
		return "Expresso Coffee";
	}
	
}
