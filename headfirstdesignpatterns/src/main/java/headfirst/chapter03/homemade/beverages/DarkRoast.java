package headfirst.chapter03.homemade.beverages;

import headfirst.chapter03.homemade.Beverage;
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
