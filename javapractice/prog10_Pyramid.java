package javapractice;

import java.util.Scanner;
public class prog10_Pyramid {
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int n,i,j,k,l;
System.out.println("Enter Level : ");
n=obj.nextInt();
for(i=0;i<n;i++)
{
for(j=i;j<n;j++)
{
System.out.print(" ");
}
for(k=i;k<=2*i-1;k++)
{
System.out.print(k+" ");
}
for(l=2*i-2;l>=i;l--)
{
System.out.print(l+" ");
}
System.out.println("");
}
}
}