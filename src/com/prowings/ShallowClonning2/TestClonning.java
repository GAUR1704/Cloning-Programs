package com.prowings.ShallowClonning2;

import java.io.IOException;

public class TestClonning {

	public static void main(String[] args) {

		Car car1 = new Car(2022, "A7", "Audi");

//		Car car2 = new Car(2022, "A7", "Audi");

		Car car2 = null;

		try {

			car2 =  (Car) car1.clone();

		}
		catch (CloneNotSupportedException e) {
			
			System.out.println("inside the catch block");

			e.printStackTrace();
		}
		System.out.println("Before changing the object.");
		System.out.println("Car1 : " + car1);
		System.out.println("Car2 : " + car2);

		car1.setName("Mercedez");

		System.out.println("Before changing the object.");
		System.out.println("Car1 : " + car1);
		System.out.println("Car2 : " + car2);

	}

}
