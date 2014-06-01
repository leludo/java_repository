package headfirst.chapter01;

public class RubberDuck extends Duck {
	@Override
	void display() {
		System.out.println("I'm a deco duck.");

	}

	public RubberDuck() {
		flyingDelegate = new NotFlyingDelegate();
		soundDelegate = new LoudSoundDelegate();
	}

}
