package javapractice;

import java.util.Scanner;
public class prog12_Password {
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the name: ");
String name=obj.next();
System.out.println("Enter the room number:");
String room=obj.next();
System.out.println("Enter the mobile number:");
String mobile=obj.next();
char splchar[]= {'}','!','@','#','$','%','^','&','*','('};
char []password=new char[6];
char i=mobile.charAt(4);
char j=room.charAt(0);
int l=name.length();
prog12_Password ob=new prog12_Password();
password[0]=name.charAt(0);
password[1]=mobile.charAt(9);
password[2]=splchar[i-'0'];
password[3]=ob.digitsum(room);
password[4]=splchar[j-'0'];
password[5]=name.charAt(l-1);
System.out.print("Password is : ");
System.out.print(password);
}

char digitsum(String a)
{
Integer num=Integer.valueOf(a);
int rem=0;
int sum=0;
while(num!=0)
{
while(num!=0)
{
rem=num%10;
sum=sum+rem;
num=num/10;
}
if(sum>=10)
{
num=sum;
sum=0;
}
}
char s=(char)(sum+'0');
return s;
}
}