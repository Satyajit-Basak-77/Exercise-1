import java.util.*;
public class common_divisor {
    public static void divisor(int a, int b){
        int gcd = 1;
        for(int i=1; i<=a; i++){
            if (a%i == 0){
                if (b%i == 0){
                    gcd = i; // if there is more than 1 common divisor then gcd will get update in every loop
                }
            }
        }
        System.out.println("The greatest common divisor is " + gcd);
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int y = sc.nextInt();
        divisor(x, y);
    }
}