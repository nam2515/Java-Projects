import java.util.Scanner;

public class Missingpangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		int[] alpha=new int[26];
		int index=0,flag=1;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)>='A' && str1.charAt(i)<='Z')
			{
				index=str1.charAt(i)-'A';
			}
			if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
			{
				index=str1.charAt(i)-'a';
			}
			alpha[index]=1;
		}
		for(int i=0;i<26;i++)
		{
			if(alpha[i]!=1)
				flag=0;
		}
		System.out.println(str1);
		if(flag==1)
			System.out.println("Pangrams");
		else
		{
			System.out.println("Not Pangrams");
			for(int i=0;i<26;i++)
			{
				if(alpha[i]!=1)
				{
					char cm=(char) (i+97);
					System.out.print(cm);
				}
			}
		}
	}

}
