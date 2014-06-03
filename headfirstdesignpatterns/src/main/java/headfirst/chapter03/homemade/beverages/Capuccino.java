package headfirst.chapter03.homemade.beverages;

import headfirst.chapter03.homemade.Beverage;

/**
 * ConcreteComponent ->  Capuccino
 * @author ludovic
 *
 */
public class Capuccino implements Beverage {

	public String getDesciption() {
		return "Capuccino";
	}
	public double cost() {
		return 0.5d;	
	}
}
