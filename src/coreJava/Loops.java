package coreJava;

import java.util.ArrayList;

public class Loops {

	public static void main(String[] args) {
//Loops
		// For loop
		
		//write value of x 5 times
		// s = o means this is where my condition starts
		// s<6 means this is where my condition ends 
		//++ means incremental
		//-- means decremental
		for (int s = 0; s<5;s-- ){// java set up on his mind : 5 times loop need to run
		//System.out.println("I don't love java : And value of s is = "+s);
		}

		
		//While loop
		int a = 0;
		while (a<5) {
			//System.out.println("I don't love java : And value of s is = "+a);
			a++;
		}
		
		//enhanced for loop
		//create an array and insert 3 names
		String array[] = {"Apu","Sourav","Adnan","Nusrat"};
		int array2[]= {1,2,3,4};
		//System.out.println("lenth of array is "+array.length);
		
		for(String s: array) {
			///System.out.println("my name is "+s);
		}
		
		//do while
		int z = 10;
		do {
			//System.out.println("my number is "+z);
			z++;
		}
		while (z<20);
		
		ArrayList <String> arrayList = new ArrayList<>();
		System.out.println(arrayList.size());
		for(int b =0; b<5;b++) {
			System.out.println(b);
			arrayList.add("Apu");
		}
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(3));
		

		
		
		
		
		
		
	}

}
