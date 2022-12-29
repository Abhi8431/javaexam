package javapractice;

import java.util.Scanner;
public class prog8_Happynumber {
public static void main(String args[])
{
System.out.println( "Happy Number\n" ) ;
Scanner obj= new Scanner (System. in) ;
System.out.println ("Enter the number :");
int number=obj.nextInt() ;
int iterations=0;
int sum=0;
while (sum != 1 && sum != 4)
{
int tempsum=0;
iterations++;
String temp=Integer.toString (number) ;
int length=temp.length() ;
for (int i=0;i<length; i++)
{
int digit = temp.charAt (i)-'0' ;
tempsum+= (digit*digit) ;
}
sum=tempsum;
number=sum;
System.out.println(iterations + ". " + sum) ;
}
if(sum==1)
System.out.println("Yes, It is a happy number\n" ) ;
else
System.out.println("No, Its not a happy number\n" ) ;
}
}
