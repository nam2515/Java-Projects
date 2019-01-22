import java.util.Scanner;

public class Powerof10 {

		// TODO Auto-generated method stub
		static boolean isPowerOf10(int n)
		{
			if(n==0) 
				return false;
			while(n!=1)
			{
				if(n%10!=0)
					return false;
				n/=10;
			}
			return true;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num1;
			Scanner sc= new Scanner(System.in);
			num1=sc.nextInt();
			if(isPowerOf10(num1))
				System.out.println("True");
			else
				System.out.println("False");
	
	}
}
