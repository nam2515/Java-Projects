import java.util.Scanner;

public class StringStartS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s= sc.nextInt();
		String[] str= new String[s];
		for(int i=0;i<s;i++)
		{
			str[i]=sc.nextLine();
		}
		for(int i=0;i<s;i++)
		{
			if(str[i].startsWith("S")||str[i].startsWith("s"))
				System.out.println(str[i]);
		}

	}

}
