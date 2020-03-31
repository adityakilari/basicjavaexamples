
// Different ways to retrieve multiple values from methods


package javaBasic;

import java.util.Arrays;
import java.util.List;
//import java.util.Set;

//public class variablesandthiskeyword {
//	public static void main(String[]args) {
//		car c = new car();
//		System.out.println(c.SetValues("white",23.5,4,45,"ford ecosport",4));
//	}
//	}
//class car{
//	int tires;
//	int seats;
//	int tankcapacity;
//	double milageperltr;
//	String name;
//	String color;
//	
//	
//	public  List<Object> SetValues(String color, double milageperltr, int seats, int tankcapacity,String name, int tires){
//		this.color = color;
//		this.milageperltr=milageperltr;
//		this.seats=seats;
//		this.tankcapacity=tankcapacity;
//		this.name=name;
//		this.tires=tires;
//		
//		return Arrays.asList(color,milageperltr,seats,tankcapacity,name,tires);
//		
//	}
//}

public class variablesandthiskeyword{
	public static void main (String[]args) {
		man sp = getNameAndAge();
		System.out.println("Name:"+sp.getName());
		System.out.println("Age:"+sp.getAge());
	}
	public static man getNameAndAge() {
		return new man("Aditya",22);
		
	}
}

class man{
	String name;
	int age;
	
	
	public man(String name, int age) {
		this.name = name;
		this.age = age;
	
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}




