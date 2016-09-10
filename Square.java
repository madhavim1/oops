/* Write a program to depict the behavior of method overloading 
 * and overriding.
 */

package com.training.oops;

public class Square extends Shape implements ShapeConstants{
	double side;
	public Square() {
		this.noOfSides = 4;
	}

	@Override
	public void calculateArea() {
		area = Math.pow(side, 2);
		System.out.println("Area of Square: "+area);
	}

	@Override
	public void calculatePerimeter() {
		perimeter = (this.noOfSides)*side;
		System.out.println("Perimeter of Square: "+perimeter);
	}
	
	@Override
	public void setSides(double length, double width) {
		side = length;
	}
	
	public void setSides(int length, int width) {
		side = length;
	}
	
	public void setSides(double side) {
		this.side = side;
	}
	
	public static void main(String args[]) {
		Square s = new Square();
		s.setSides(2);
		s.calculateArea();
		s.calculatePerimeter();
		s.setSides(3,3);
		s.calculateArea();
		s.calculatePerimeter();
	}
}
