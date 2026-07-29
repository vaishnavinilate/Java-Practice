package javapractice;
import java.util.*;
//que1>
public class Pattern {
	public static void main(String args[]) {
		int n = 4;
		int m = 5;
		
		for(int i=1; i<=n;i++)
		{
			for(int j=1; j<=m; j++)
			{
				System.out.print("*");			
		    }
		 System.out.println();
		 
	    }  
    }
 }

//que1> Using Scanner 

/*public class Pattern{
public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("enter column:");
	int n = sc.nextInt();
	System.out.print("enter row:");
	int m = sc.nextInt();
	
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=m; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
  }
}*/

//que2> hollow rectangle

/*public class Pattern{
	public static void main(String args[]) {
		int n = 4;
		int m = 5;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				
				if(i==1||j==1||i==n||j==m)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}*/

//que3>
/*public class Pattern{
	public static void main(String args[])
	{
		int n =4;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

//que4>
/*public class Pattern{
	public static void main(String args[])
	{
		int n =4;
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

//que5>
/*public class Pattern{
	public static void main(String args[])
	{
		int n = 4;
		for(int i=1; i<=n; i++)
		{
			//print space
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			// print star
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}*/


//que6> Number pattern
/*public class Pattern{
	public static void main(String args[])
	{
		int n = 5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}*/

//que7>
/*public class Pattern{
	public static void main(String args[])
	{
		int n = 5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}*/

//que8> Floyd's Triangle

/*public class Pattern{
	public static void main(String args[])
	{
		int n = 5;
		int num =1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num + " ");
				num++;
			}
			
			System.out.println();
		}
	}
}*/

//que9>
/*public class Pattern{
	public static void main(String args[])
	{
		int n = 5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int sum =i+j;
			 if(sum % 2==0)
			 {
				 System.out.print("1"+" ");
			 }else {
				 System.out.print("0"+" ");
			 }
			}
			System.out.println();
		}
	}
}*/





