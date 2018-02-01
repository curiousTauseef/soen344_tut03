
public abstract class Coffee {
	private double cost;
	private String  ingredients;
	
	public Coffee(){
		this.cost = 0.0;
		this.ingredients = "";
	}
	
	public abstract double getCost();
	public abstract String getIngredients();
}
