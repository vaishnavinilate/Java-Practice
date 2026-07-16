package javapractice;
import java.util.*;

public class Evenodd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt();
		if(i%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}

/*public class Evenodd {
	public static void main(String args[]) {

	for(int i=0; i<=100;i++)
	{
		if(i%2==0) {
			System.out.println("Even Number:"+i);
		}else {
			System.out.println("Odd Number:"+i);
		}
	}
	
}*/
