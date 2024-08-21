import java.util.Scanner;
public class IT24103011Lab5Q1{
	public static void main (String [] args ){
		
		Scanner sc = new Scanner(System.in);
		int int1,int2,int3;
		
		System.out.println("Enter the first integer:  ");
		int1= sc.nextInt();
		
		System.out.println("Enter the second integer:  ");
		int2= sc.nextInt();
		
		System.out.println("Enter the third integer:  ");
		int3= sc.nextInt();
		
		int smallest= Math.min(int1,Math.min(int2,int3));
		int largest= Math.max(int1,Math.max(int2,int3));
		
		System.out.println("User entered numbers are:"+int1+" "+int2+" "+int3);
		System.out.println("The Smallest number is:"+ smallest);
		System.out.println("The Largest number is:"+ largest);
		
		
		
		
	
	    }
}