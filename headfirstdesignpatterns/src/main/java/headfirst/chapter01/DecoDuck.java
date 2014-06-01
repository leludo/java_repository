package headfirst.chapter01;

public class DecoDuck extends Duck {

	@Override
	void display() {
		System.out.println("I'm a deco duck.");
		
	}

	public DecoDuck() {
		flyingDelegate=new NotFlyingDelegate();
		soundDelegate=new NoSoundDelegate();
	}

}
