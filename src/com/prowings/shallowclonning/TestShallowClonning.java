package com.prowings.shallowclonning;

public class TestShallowClonning {

	public static void main(String[] args) {

		Employee emp1 = new Employee(10, "Gaurav", "Pune");

		Employee emp2 = new Employee(10, "Gaurav", "Pune");

		try {

			emp2 = (Employee) emp1.clone();
		} 
		catch (CloneNotSupportedException e) {

//			e.printStackTrace();
		}

		System.out.println("Before changing the object !!");

		System.out.println("Employee1 : " + emp1);
		
		System.out.println("Employee2 : " + emp2);

		emp1.setName("Shyam");

		System.out.println("After changing the object !!");

		System.out.println("Employee1 : " + emp1);
		
		System.out.println("Employee2 : " + emp2);

	}

}
