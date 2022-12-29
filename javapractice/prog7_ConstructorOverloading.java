package javapractice;

class Area {
int length=2,breadth=5;
Area()
{
System.out.println("This a default constructor");
int area = length*breadth;
System.out.println("Area of Rectangle is : "+area);
}
Area(int l, int b)
{
length=l;
breadth=b;
System.out.println("This a Paramaterized Constructor");
int area = length*breadth;
System.out.println("Area of Rectangle is : "+area);
}
}
public class prog7_ConstructorOverloading {
public static void main(String[] args) {
//object creation
System.out.println("\nDefault Constructor values : \nLength : 2 and Breadth : 5");
Area A1=new Area();
Area A2=new Area(5,10);
}
}