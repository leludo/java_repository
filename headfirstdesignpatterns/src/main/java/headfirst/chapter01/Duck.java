package headfirst.chapter01;

public abstract class Duck {

	protected SoundDelegate soundDelegate;
	protected FlyingDelegate flyingDelegate;
	
	 abstract void display();
	 
	 void proceedQuack(){
		 soundDelegate.makeNoise();
	 }
	  void proceedFly(){
		  flyingDelegate.fly();
	  }
	
}
