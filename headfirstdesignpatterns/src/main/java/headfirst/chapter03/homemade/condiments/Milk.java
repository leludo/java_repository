package headfirst.chapter03.homemade.condiments;

import headfirst.chapter03.homemade.Beverage;
import headfirst.chapter03.homemade.Condiment;
/**
 * ConcreteDecorator -> Marshmallow
 * @author ludovic
 *
 */
public class Milk extends Condiment {

	Beverage beverage;
	
	/**
	 * 
	 * @param beverage The Component to be decorated
	 */
	public Milk(final Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDesciption() {
		return this.beverage.getDesciption() + ", Milk";
	}

	@Override
	public double cost() {
		// adding the cost of the Moka option
		return this.beverage.cost() + 0.10d;
	}

}
