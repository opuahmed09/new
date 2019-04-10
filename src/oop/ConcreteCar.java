package oop;

public class ConcreteCar extends AbstractCar implements InterfaceCar,InterfaceCar2 {
	//implements -- interface
	//extends -- abstract class
	//extend first , implement second
	@Override
	public void start() {
		
	}

	@Override
	public void stop() {
		
	}

	@Override
	public void move() {
	System.out.println("moving functionality--generating car concrete-- coming from interface");
		autoBreak();
		System.out.println(a);
	}

	@Override
	public void light() {
		
	}
	
	public void autoHeadLight(int a) {
		System.out.println(a+"headlight --- concrete class");
	}

	@Override
	public void autoHeadLight() {
		// TODO Auto-generated method stub
		
	}
	


}
