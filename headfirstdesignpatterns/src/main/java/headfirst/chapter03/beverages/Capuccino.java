package headfirst.chapter03.beverages;

import headfirst.chapter03.Beverage;

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
