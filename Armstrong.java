import java.util.Scanner;

public class Armstrong {
	public static void main(String [] args)
	{
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		int rem=0,q=0,sum=0;
		int x=num;
		while(x!=0)
		{
			rem=x%10;
			q=x/10;
			x=q;
			sum=sum+(rem*rem*rem);
		}
		if(num==sum)
		{
			System.out.println("Armstrong Numbers");
		}
	}

}
