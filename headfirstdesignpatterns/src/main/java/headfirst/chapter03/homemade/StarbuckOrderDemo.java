package headfirst.chapter03.homemade;

import headfirst.chapter03.homemade.beverages.Capuccino;
import headfirst.chapter03.homemade.beverages.Espresso;
import headfirst.chapter03.homemade.condiments.Chocolate;
import headfirst.chapter03.homemade.condiments.Marshmallow;
import headfirst.chapter03.homemade.condiments.Milk;
import headfirst.chapter03.homemade.condiments.Moka;
/**
 * illustrate decorator pattern usage
 * @author ludovic
 *
 */
public class StarbuckOrderDemo {
	public static void main(String[] args) {
		//a pedagogic way to call the decorator pattern
		Beverage espresso = new Espresso();
		espresso = new Milk(espresso);
		espresso = new Moka(espresso);
		espresso = new Marshmallow(espresso);
		System.out.println(espresso.getDesciption());
		
		//the jdk input stream way to call the decorator pattern
		Beverage capuccino = new Chocolate(new Moka(new Milk(new Capuccino())));
		System.out.println(capuccino.getDesciption());
	}
}
