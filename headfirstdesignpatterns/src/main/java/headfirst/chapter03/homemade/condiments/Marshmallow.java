package headfirst.chapter03.homemade.condiments;

import headfirst.chapter03.homemade.Beverage;
import headfirst.chapter03.homemade.Condiment;
/**
 * ConcreteDecorator => Marshmallow
 * @author ludovic
 *
 */
public class Marshmallow extends Condiment {

	Beverage beverage;
	
	/**
	 * 
	 * @param beverage The Component to be decorated
	 */
	public Marshmallow(final Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDesciption() {
		
		return this.beverage.getDesciption() + ", Marshmallow";
	}

	@Override
	public double cost() {
		// adding the cost of the Marshmallow option
		return this.beverage.cost() + 0.20d;
	}

}
