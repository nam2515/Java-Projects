import java.util.Scanner;

public class Menubased {
	static int a;
	static int b;
	static int result=0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		
		
		while(true)
			{
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
		{
		case 1: Add();
				break;
		case 2: Sub();
				break;
		case 3: Mul();
				break;
		case 4: System.exit(0);
		default: System.out.println("You entered wrong choice");
				 break;
		}
			}
	}

	private static void Mul() {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number");
		 a = sc.nextInt();
		 System.out.println("Enter the second number");
			 b=sc.nextInt();
			 result=a*b;
			 System.out.println("Result:"+ result);
	}

	private static void Sub() {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number");
		 a = sc.nextInt();
		 System.out.println("Enter the second number");
			 b=sc.nextInt();
			 result=a-b;
			 System.out.println("Result:"+ result);
		
	}

	private static void Add() {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number");
		 a = sc.nextInt();
		 System.out.println("Enter the second number");
			 b=sc.nextInt();
			 result=a+b;
			 System.out.println("Result:"+ result);
	}

}
