package javapractice;

import java.util.Scanner;
public class prog2_EvenOdd
{
public static void main(String z[])
{
System.out.println("Even odd Seperation & Transpose of a matrix\n");
Scanner obj = new Scanner(System.in);
int m,n,i,j,N;
System.out.println("Enter the number of elements for 1d array : ");
N=obj.nextInt();
int a[]=new int[N];
System.out.println("\nEnter the elements for 1d array : ");
for(i=0;i<N;i++)
a[i]=obj.nextInt();
prog2_EvenOdd x = new prog2_EvenOdd();
x.seperation(a,N);
System.out.println("\nEnter order of matrix : ");
m=obj.nextInt();
n=obj.nextInt();
int b[][]=new int[m][n];
System.out.println("\nEnter values for matrix for transpose : ");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
b[i][j]=obj.nextInt();
x.transpose(b,m,n);}
void seperation(int a[],int N)
{
int i;
int even[]=new int[N];
int odd[]=new int[N];
int j=0,k=0;
for(i=0;i<N;i++)
{
if(a[i]%2==0)
even[j++]=a[i];
else
odd[k++]=a[i];
}
System.out.print("\nEven elements are : ");
for(i=0;i<j;i++)
System.out.print(even[i]+" ");
System.out.print("\nOdd elements are : ");
for(i=0;i<k;i++)
System.out.print(odd[i]+" ");
}
void transpose(int b[][],int m,int n)
{
System.out.println("Transpose of matrix is : ");
int c[][]=new int[n][m];
for(int i=0;i<n;i++)
for(int j=0;j<m;j++)
c[i][j]=b[j][i];
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
System.out.print(c[i][j]+" ");
System.out.print("\n");
}
}
}
