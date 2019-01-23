import java.util.Scanner;

public class WeightofAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		int value = 0,sum=0;
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)>='A' && str1.charAt(i)<='Z')
				value=1+str1.charAt(i)-'A';
			
			if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
				value=1+str1.charAt(i)-'a';
			sum=sum+value;
		}
		System.out.println("The weight of string is:"+ sum);
		
	}

}
