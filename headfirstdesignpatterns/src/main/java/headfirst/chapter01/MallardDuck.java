/**
 * 
 */
package headfirst.chapter01;

/**
 * The mallard (/ˈmælɑrd/ or /ˈmælərd/) or wild duck (Anas platyrhynchos) is a
 * dabbling duck which breeds throughout the temperate and subtropical Americas,
 * Europe, Asia, and North Africa, and has been introduced to New Zealand and
 * Australia.
 * 
 * see <a href="http://en.wikipedia.org/wiki/Mallard">Mallard duck article on
 * wikipedia</a>
 * 
 * @author ludovic
 *
 */
public class MallardDuck extends Duck {
	@Override
	void display() {
		System.out.println("I'm a deco duck.");
		
	}
public MallardDuck() {
	flyingDelegate=new HighFlyDelegate();
	soundDelegate=new LoudSoundDelegate();
}
	
}
