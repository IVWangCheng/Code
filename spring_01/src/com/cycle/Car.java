package com.cycle;

public class Car {
     private String brand;
     Car()
     {
    	 System.out.println("constructor...");
     }
    
     public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("setBrand...");
		this.brand = brand;
	}

	private void inni()
     {
    	 System.out.println("inni...");
     }
     private void destroy() {
    	 System.out.println("destroy...");
		
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
    
}
