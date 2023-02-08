package javafinal;

import java.util.Scanner;
public class prog3_BinarySearch
{
public static void main(String z[])
{
System.out.println("Binary Search Implementation\n");
Scanner obj = new Scanner(System.in);
int N,i,element;
System.out.println("Enter the number of elements : ");
N=obj.nextInt();
int a[]=new int[N];
System.out.println("Enter the elements in ascending order : ");
for(i=0;i<N;i++)
a[i]=obj.nextInt();
System.out.println("Enter element to be searched : ");
element=obj.nextInt();
prog3_BinarySearch x = new prog3_BinarySearch();
int result=x.search(a,0,N-1,element);
if(result==-1)
System.out.println("Element not found\n");
else
System.out.println("Element "+element+ " found at position "+
(result+1) +"\n");
obj.close();
}
int search(int a[],int low,int high,int element)
{
int mid=(low+high)/2;
if(high<low)
return -1;
if(element==a[mid])
return mid;
if(element>a[mid])
return search(a,mid+1,high,element);
else
return search(a,0,mid-1,element);
}}