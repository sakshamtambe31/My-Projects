import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        int s=0,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number= ");
        int n = sc.nextInt();
        while(n>0){
            x=n%10;
            s=s+x;
            n=n/10;
        }
        System.out.println("The sum of all digits in "+n +" is " +s );
    }
}
