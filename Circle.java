/* Write a program that creates a class Circle extending Shape 
 * abstract class and implementing ShapeConstants interface 
 * and has following behavior.
 *     --> Properties: radius.
 *     --> Constructor: To set number of sides.
 *     --> Overrides all the methods from parents.
 */

package com.training.oops;

public class Circle extends Shape implements ShapeConstants {
	
	private double radius;
	
	public Circle() {
		this.noOfSides = 0;
	}
	
	@Override
	public void calculateArea() {
		area = PI * Math.pow(radius, 2);
		System.out.println("Area of circle: "+area);
	}

	@Override
	public void calculatePerimeter() {
		 perimeter = 2*PI*radius;
		 System.out.println("Perimeter of circle: "+perimeter);
	}
	
	@Override
	public void setSides(double length, double width) {
		radius = length;
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setSides(3, 0);
		circle.calculatePerimeter();
		circle.calculateArea();
	}

}
