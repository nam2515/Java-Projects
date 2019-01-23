import java.util.Scanner;

public class NumerologyNumber {
	public static void main(String [] args)
	{
		String str1;
		int index=0,value=0, sum=0;
		Scanner sc= new Scanner(System.in);
		int [] arr= {1,2,3,4,5,8,3,5,1,1,2,3,4,5,7,8,1,2,3,4,6,6,6,5,1,7};
		str1=sc.nextLine();
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)>=65 && str1.charAt(i)<=91)
			{
				index=str1.charAt(i)-'A';
				value=arr[index];
				sum+=value;
			}
			
		}
		int n_sum = 0;
		if(sum>10)
		{
			int x=sum;
			while(x!=0)
			{
				int rem=x%10;
				int q=x/10;
				x=q;
				n_sum+=rem;
			}
			
			System.out.println("Numerological number for the given string is:"+ n_sum);
		}
		else
			System.out.println("Numerological number for the given string is:"+ sum);
		
		
		
	}

}
