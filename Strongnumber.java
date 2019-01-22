import java.util.Scanner;

public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		int x=num,rem,q,sum=0;
		while(x!=0)
		{
			rem=x%10;
			q=x/10;
			x=q;
			int f=1;
			for(int i=rem;i>0;i--)
			{
				f=f*i;
			}
			sum=f+sum;
		}
		if(num==sum) {
			System.out.println("Strong numbers");
		}
		else
		{
			System.out.println("Not strong number");
		}
	}

}
