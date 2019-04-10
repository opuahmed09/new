package oop;

public class Polymorphism extends ConcreteCar {
//Method Overloading
	//same method , different parameters
	
	public void calculator(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void calculator(int a,int b,int d) {
		int c = a+b;
		double g = c/d;
		System.out.println(g);
	}
	
	//Method Overriding
	@Override
	public void autoHeadLight(int a) {
		System.out.println(a+"headlight --- polymorphism class");

	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Polymorphism polymorphism = new Polymorphism();
		polymorphism.calculator(10,12);
		polymorphism.calculator(10,12,2);
		
		polymorphism.autoHeadLight(11);
		
		
	}

}
