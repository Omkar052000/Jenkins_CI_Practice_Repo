package mypkg;

import java.util.Scanner;

public class MyClass {
	public int areaRect(int l , int b)
	{
		return (l*b);
	}
	public int areaSquare(int s)
	{
		return (s*s);
	}
	public float areaCircle(float r)
	{
		return (float) (3.14 * r * r);
	}
	public void show()
	{
		System.out.println("Hi, GFG");
		System.out.println("Hi, GFG");
	}
	public int areaCube(int s)
	{
		return (6 * s);
	}
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		int l;
		int b;
		int s;
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		l = sc.nextInt();
		System.out.println("Enter Breadth: ");
		b = sc.nextInt();
		System.out.println("Area of Rectangle is: "+ ob.areaRect(l , b));
		System.out.println("Enter the value of Side: ");
		s = sc.nextInt();
		System.out.println("Area of Square is: "+ ob.areaSquare(s));
		System.out.println("Enter the value of r: ");
		r = sc.nextInt();
		System.out.println("Area of Square is: "+ ob.areaCircle(r));
		System.out.println("Enter the value of s: ");
		s = sc.nextInt();
		System.out.println("Area of Cube is: "+ ob.areaCube(s));
	}

}
