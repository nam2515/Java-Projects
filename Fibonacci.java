import java.util.Scanner;

public class Fibonacci {
	public static void main(String [] args)
	{
		int num1,num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		num1=sc.nextInt();
		int a=1,b=1;
		int x=num1;
		System.out.print(a +" " + b + " ");
		for(int i=3;i<=x;i++)
		{
			num2=a+b;
			a=b;
			b=num2;
			System.out.print(num2+" ");
		}
		
	}

}
