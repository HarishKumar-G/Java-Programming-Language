/*
 * Java program to illustrate the concept of interface
 */

import java.io.*;

interface Shape1
{
	// abstract method
	void draw();
	double area();
}

class Rectangle1 implements Shape1
{
	int length, width;
	
	// constructor
	Rectangle1(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	@Override
	public void draw()
	{
		System.out.println("Rectangle has been drawn ");
	}
	
	@Override
	public double area() {
		return (double)(length*width);
	}
}

class Circle1 implements Shape1
{
	double pi = 3.14;
	int radius;
	
	// constructor
	Circle1(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle has been drawn");
	}
	
	@Override
	public double area()
	{
		return (double)((pi*radius*radius)/2);
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the Object of Rectangle class and using shape interface reference
		Shape1 rect = new Rectangle1(2, 3);
		System.out.println("Area of rectangle: " + rect.area());
		
		// creating the Objects of circle class
		Shape1 circle = new Circle1(2);
		System.out.println("Area of circle : " + circle.area());
	}
}
