package headfirst.chapter01;
/**
 * The ducky strategy pattern
 * @author ludovic
 *
 */
public class DuckyDemo {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.proceedFly();
		mallardDuck.proceedQuack();
	}

}
