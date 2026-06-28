import java.util.*;
public class sumofodd {
    public static int Sum (int n){
        int sum = 0;
        for (int i=1; i<=n; i=i+2){
            sum = sum+i; 
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = Sum(a);
        System.out.print(sum);
    }
}