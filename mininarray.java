import java.util.*;
class mininarray
{

public static void main(String args[])
{
	Scanner amit=new Scanner(System.in); 
	System.out.println("Enter the length of an array"); 
	int len=amit.nextInt(); 
	int arr[]=new int[len]; 
	System.out.println("Enter the "+len+" elements"); 
		
	for(int i=0;i<len;i++) 
	{
	arr[i]=amit.nextInt(); 
	}
	
	int min=arr[4]; 
	for(int j=0;j<len;j++)
	{
		if(arr[j]<min) 
		{	
		min=arr[j]; 
		}
	}
	System.out.println("The minimum value of array is "+min);
}
}