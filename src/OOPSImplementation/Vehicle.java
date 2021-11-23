package OOPSImplementation;

public interface Vehicle {
	
	int price = 100000;
	
	void start();
	void stop();
	void accelerate(int speed);
	void applyBrakes();
	
	default int changeGear() {
		System.out.println("Changing gear");
		return 0;
	}
}
