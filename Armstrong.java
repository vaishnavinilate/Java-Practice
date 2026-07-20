// Check the number is Armsstrong or not
package javapractice;

public class Armstrong{
public static void main(String args[]){
   int num = 153;
   int temp = num;
   int sum = 0;

while(num>0){
   int rem = num % 10;
   sum = sum +(rem * rem* rem);
   num = num/10;
}
if(temp == sum){
   System.out.println("Armsstong Number");
}else{
   System.out.println("Not ArmsStrong Number");
}
}
}

// write a java program to print all Armstrong number between 1 to n

/*package javapractice;

public class Armstrong {
    public static void main(String[] args) {

        int n = 1000;

        for (int i = 1; i <= n; i++) {

            int num = i;
            int temp = i;
            int digits = String.valueOf(i).length();
            int sum = 0;

            while (num > 0) {
                int rem = num % 10;
                sum += Math.pow(rem, digits);
                num = num / 10;
            }

            if (sum == temp) {
                System.out.println(temp);
            }
        }
    }
}*/
