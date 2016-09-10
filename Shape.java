/* Write a program creating an abstract class Shape 
 * with properties (noOfSides,area,perimeter) and 
 * methods(calculateArea,calculatePerimeter,setSides.
 */

package com.training.oops;

public abstract class Shape {
	
	protected int noOfSides;
	protected double area;
	protected double perimeter;
	
	public int getNoOfSides() {
		return noOfSides;
	}

	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(long area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(long perimeter) {
		this.perimeter = perimeter;
	}
	
	public abstract void calculateArea();
	
	public abstract void calculatePerimeter();
	
	public abstract void setSides(double length, double width);
	
}
