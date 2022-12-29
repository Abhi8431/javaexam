package javapractice;

import java.util.Scanner;
public class prog6_SquareMatrices {
public static void main(String args[])
{
System.out.println("Calculation of all possible square matrices in a matrix");
Scanner obj=new Scanner(System.in);
System.out.println("Enter number of columns for square matrix :");
int n = obj.nextInt();
int total=0;
int i=1;
while(i<=n)
{
total=total+(i*i);
i++;
}
System.out.println("Total number of square matrices are : "+total);
}
}