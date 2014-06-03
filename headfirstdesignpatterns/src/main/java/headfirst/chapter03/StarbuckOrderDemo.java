package headfirst.chapter03;

import headfirst.chapter03.beverages.Espresso;
import headfirst.chapter03.condiments.Marshmallow;
import headfirst.chapter03.condiments.Milk;
import headfirst.chapter03.condiments.Moka;

public class StarbuckOrderDemo {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		espresso = new Milk(espresso);
		espresso = new Moka(espresso);
		espresso = new Marshmallow(espresso);
		System.out.println(espresso.getDesciption());
	}
}
