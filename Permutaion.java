import java.util.Scanner;

public class Permutaion {
	public static int findStep(int n)
	{
		if(n==1||n==0)
			return 1;
		else if(n==2)
			return 2;
		else
			return findStep(n-3) + findStep (n-2) + findStep(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(findStep(n));
		
	}

}
