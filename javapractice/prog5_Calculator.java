package javapractice;

import java.util.Scanner;
public class prog5_Calculator {
public static void main(String args[])
{
System.out.println("SIMPLE CALCULATOR");
Scanner obj = new Scanner(System.in);
int m,n;
while(true)
{
System.out.println("ENTER CHOICE\n 1.ADDITION\n 2.SUB\n 3.MUL\n 4.Div\n 5.EXIT \n");
char ch = obj.next().charAt(0);
switch(ch)
{
case '1': System.out.println("Enter two operands");
m=obj.nextInt();
n=obj.nextInt();
System.out.println("SUM IS:"+(m+n));
break;
case '2': System.out.println("Enter two operands");
m=obj.nextInt();
n=obj.nextInt();
System.out.println("SUB IS:"+(m-n));
break;
case '3': System.out.println("Enter two operands");
m=obj.nextInt();
n=obj.nextInt();
System.out.println("MUL IS:"+(m*n));
break;
case '4': System.out.println("Enter two operands");
m=obj.nextInt();
n=obj.nextInt();
System.out.println("DIV IS:"+(m/n));
break;
case '5': System.out.println("EXITED");
System.exit(0);
break;
default:System.out.println("Wrong input\n");
break;
}
}
}
}
