package OOPSImplementation;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Engine starts");
		
	}
	
	@Override
	public void stop() {
		System.out.println("Engine stops");
		
	}

	@Override
	public void accelerate(int speed) {
		System.out.println("speeding up by " + speed);
	}

	@Override
	public void applyBrakes() {
		System.out.println("speeding down");
		
	}
	
	

}
