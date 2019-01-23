import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		int s1,s2,s3;
		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter the size of array1");
		s1=sc.nextInt();
		int [] arr1= new int [s1];
		System.out.println("Enter the elements in array1");
		for(int i=0;i<s1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of array2");
		s2=sc.nextInt();
		int [] arr2= new int[s2];
		System.out.println("Enter the elements in array2");
		for(int i=0;i<s2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		s3=s1+s2;
		int [] arr3=new int[s3];
		for(int i=0;i<s1;i++)
		{
			arr3[i]=arr1[i];
		}
		for(int i=s1;i<s3;i++)
		{
			arr3[i]=arr2[i-s1];
		}
		Arrays.sort(arr3);
		int median=(int) Math.ceil(s3/2);
		System.out.print("The sorted array is:");
		for(int i=0;i<s3;i++)
		{
			System.out.print(arr3[i]+ " ");
		}
		System.out.println("Median of sorted array: " +arr3[median]);
		
	}

}
