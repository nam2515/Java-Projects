import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		int i=0,j=0,f=1,count=0;
		while(f!=0)
		{
			for(i=0;i<a.length();i++)
			{
				for(j=i;j<a.length();j++)
				{
					if(a.charAt(i)==a.charAt(j))
						count++;
					else
						break;
				}
				System.out.print(a.charAt(i)+ "=" + count +" ");
				count=0;
				i=j-1;
			}
			f=0;
		}
	}

}
