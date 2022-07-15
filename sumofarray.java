import java.util.*;
class sumofarray
{

public static void main(String args[])
{
	Scanner amit=new Scanner(System.in); 
	System.out.println("Enter the length of an array"); 
	int len=amit.nextInt(); 
	System.out.println("Enter the "+len+" elements"); 
	int arr[]=new int[len];

	for(int i=0;i<len;i++) 
	{
	arr[i]=amit.nextInt(); 
	}

	int sum=0; 
	for(int j=0;j<len;j++)
	{	
		sum=sum+arr[j]; 
	}
	System.out.println("Sum of all the elements of an array is " +sum);
}
}
