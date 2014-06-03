package headfirst.chapter03.beverages;

import headfirst.chapter03.Beverage;
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
