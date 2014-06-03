package headfirst.chapter03.homemade.condiments;

import headfirst.chapter03.homemade.Beverage;
import headfirst.chapter03.homemade.Condiment;
/**
 * ConcreteDecorator -> Chocolate
 * @author ludovic
 *
 */
public class Chocolate extends Condiment {

	Beverage beverage;
	/**
	 * 
	 * @param beverage The Component to be decorated
	 */
	public Chocolate(final Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDesciption() {
		return this.beverage.getDesciption() + ", Chocolate";
	}

	@Override
	public double cost() {
		// adding the cost of the choco option
		return this.beverage.cost() + 0.20d;
	}

}
