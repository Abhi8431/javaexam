package javapractice;

import java.util.Scanner;
public class prog1_AddMat
{
public static void main(String z[])
{
System.out.println("Addition of 2-Matrixes");
Scanner obj = new Scanner(System.in);
int m,n,i,j;
System.out.println("Enter order of matrix");
m=obj.nextInt();
n=obj.nextInt();
int a[][]=new int[m][n];
int b[][]=new int[m][n];
System.out.println("Enter values for matrix 1");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=obj.nextInt();
System.out.println("Enter values for matrix 2");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
b[i][j]=obj.nextInt();
prog1_AddMat k=new prog1_AddMat();
k.addmat(a,b,m,n);
}
void addmat(int a[][],int b[][],int m,int n)
{
int sum[][]=new int[m][n];
int i,j;
for(i=0;i<m;i++)
for(j=0;j<n;j++)
sum[i][j]=a[i][j]+b[i][j];
System.out.println("Sum of both Matrix :");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
System.out.print(sum[i][j]+"\t");
System.out.print("\n");}
}
}