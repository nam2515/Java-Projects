import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		String str1, str2;
		int len1=0, len2=0;
		
		// Input the words and find the length
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first word");
		str1=sc.nextLine();
		System.out.println("Enter the Second word");
		str2=sc.nextLine();
		len1=str1.length();
		len2=str2.length();
		
		//Sorting the string and type casting it into string again.
		
		char[] chars=str1.toCharArray();
		System.out.println(chars);
		char[] chars1=str2.toCharArray();
		Arrays.sort(chars);
		String s1=new String(chars);
		Arrays.sort(chars1);
		String s2= new String(chars1);
		
		// Finding whether they are anagrams or not
		if(len1==len2 && (s1.equals(s2))) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}	
	}
}
