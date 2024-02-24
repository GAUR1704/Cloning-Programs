package com.prowings.ShallowClonning2;

public class Car implements Cloneable {

	private int make;
	private String model;
	private String name;

	public Car() {

		super();

	}

	public Car(int make, String model, String name) {
		super();
		this.make = make;
		this.model = model;
		this.name = name;
	}

	public int getMake() {
		return make;
	}

	public void setMake(int make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
