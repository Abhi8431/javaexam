package javapractice;

import java.util.Scanner;
public class prog7_MethodOverloading {
public static void main(String args[])
{
System.out.println("Method Overloading");
Scanner obj = new Scanner(System.in);
int length,breadth,radius;
System.out.println("Enter Length and breadth for rectangle : ");
length=obj.nextInt();
breadth=obj.nextInt();
System.out.println("Enter radius for a circle : ");
radius=obj.nextInt();
prog7_MethodOverloading X = new prog7_MethodOverloading();
X.area(length, breadth);
X.area(radius);
}
void area(int l,int b)
{
int area = l*b;
System.out.println("Area of Rectangle is : "+area);
}
void area(int r)
{
double area = 3.14*r*r;
System.out.println("Area of Circle is : "+area);
}
}
