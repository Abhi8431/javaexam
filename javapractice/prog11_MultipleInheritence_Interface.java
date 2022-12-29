package javapractice;

import java.util.Scanner;
interface department
{
String dname();
}
interface student
{
String sname();
}
class ABC implements department,student
{
Scanner obj=new Scanner(System.in);
public String dname()
{
System.out.println("Enter Department Name : ");
String deptname=obj.next();
return deptname;
}
public String sname()
{
System.out.println("Enter Student Name : ");
String studname=obj.next();
return studname;
}
}
public class prog11_MultipleInheritence_Interface {
public static void main(String args[])
{
ABC ob = new ABC();
String deptname=ob.dname();
String studname=ob.sname();
System.out.println("Department Name : "+deptname);
System.out.println("Student Name : "+studname);
}
}