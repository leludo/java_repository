package headfirst.chapter03.homemade.beverages;

import headfirst.chapter03.homemade.Beverage;
/**
 * ConcreteComponent -> Espresso
 * @author ludovic
 *
 */
public class Espresso implements Beverage {

	
	public String getDesciption() {
		return "Expresso";
	}
	
	public double cost() {
		return 1.1d;	
	}
}
