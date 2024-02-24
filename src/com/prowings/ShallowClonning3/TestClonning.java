package com.prowings.ShallowClonning3;

public class TestClonning {

	public static void main(String[] args) {

		Book book1 = new Book(150, "Quotes", 10);

		Book book2 = null;

		try {
			book2 = (Book) book1.clone();

		}

		catch (CloneNotSupportedException e) {

			System.out.println("Inside the catch block !!");

			e.printStackTrace();

		}

		finally {

			System.out.println("Finnaly block executed !!");
		}

		System.out.println("Before changing the object !!");
		System.out.println("Book1 : " + book1);
		System.out.println("Book2 : " + book2);

		book2.setBookName("Motivational Quotes");

		System.out.println("After changing the object !!");
		System.out.println("Book1 : " + book1);
		System.out.println("Book2 : " + book2);

	}

}
