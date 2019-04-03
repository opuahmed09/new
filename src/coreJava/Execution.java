package coreJava;

public class Execution {
	public static void main (String [] args) {
		//Computer 
		//Object Creation Of A Class
		Computer refVar1 = new Computer();
		//Class Name + reference variable = new + Constructor Name 
		refVar1.model = "Asus";
		System.out.println(refVar1.model);
		Computer refVar2 = new Computer(2019);
		Computer refVar3 = new Computer("Mac");
		System.out.println("its the one "+refVar3.model);
		System.out.println(Computer.keys);
		
		//Math
		Math math = new Math();
		int newValue = math.calculator1(7,8);
		int newValue3 = math.calculator1(7,98);
		System.out.println(newValue);
		
	
		int newValue2= Math.calculator2(10, 5);
		System.out.println(newValue2);
		
	}
	
}
