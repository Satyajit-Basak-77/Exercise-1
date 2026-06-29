import java.util.*;
public class power {
    public static void powerChecker(int x, int n){
        int pow = 1;
        for(int i=1; i<=n; i++){
            pow = pow*x;
        }
        System.out.print(pow);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        System.out.print("Enter your power: ");
        int pow = sc.nextInt();
        powerChecker(num, pow);
    }
}