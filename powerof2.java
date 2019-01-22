import java.util.Scanner;


public class powerof2 {
	
	static boolean isPowerOf2(int n)
	{
		if(n==0) 
			return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n/=2;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner sc= new Scanner(System.in);
		num1=sc.nextInt();
		if(isPowerOf2(num1))
			System.out.println("True");
		else
			System.out.println("False");
	
	}
}
