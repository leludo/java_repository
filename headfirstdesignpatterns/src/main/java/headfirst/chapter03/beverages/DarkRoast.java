package headfirst.chapter03.beverages;

import headfirst.chapter03.Beverage;
/**
 * ConcreteComponent -> DarkRoast
 * @author ludovic
 *
 */
public class DarkRoast implements Beverage {

	
	public String getDesciption() {
		return "DarkRoast";
	}
	public double cost() {
		return 2d;	
	}
}
