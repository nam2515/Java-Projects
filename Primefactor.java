import java.util.Scanner;

public class Primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		for (int i=2;i<num;i++) {
			while(num%i==0)
			{
				System.out.println(i+" ");
				num/=i;
			}
		}
		if(num>2)
			System.out.println(num);

	}

}
