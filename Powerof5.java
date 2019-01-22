import java.util.Scanner;

public class Powerof5 {

		// TODO Auto-generated method stub
		static boolean isPowerOf5(int n)
		{
			if(n==0) 
				return false;
			while(n!=1)
			{
				if(n%5!=0)
					return false;
				n/=5;
			}
			return true;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num1;
			Scanner sc= new Scanner(System.in);
			num1=sc.nextInt();
			if(isPowerOf5(num1))
				System.out.println("True");
			else
				System.out.println("False");
	
	}
}

