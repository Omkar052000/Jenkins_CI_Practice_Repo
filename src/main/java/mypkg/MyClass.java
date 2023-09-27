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
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		int l;
		int b;
		int s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		l = sc.nextInt();
		System.out.println("Enter Breadth: ");
		b = sc.nextInt();
		System.out.println("Area of Rectangle is: "+ ob.areaRect(l , b));
		System.out.println("Enter the value of Side: ");
		s = sc.nextInt();
		System.out.println("Area of Square is: "+ ob.areaSquare(s));
	}

}
