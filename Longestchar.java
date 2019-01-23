import java.util.Scanner;

public class Longestchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str;
		int l=0,m=0,count=0;
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
					count++;
				else
					break;
			}
			if(count>m)
			{
				m=count;
				l=i;
			}
			count=0;
		}
		System.out.println("Longest character sequence is:" + m + " at index:" + l);

	}

}
