import java.util.*;
public class fibbonacci {
    public static void series(int n){
        int a = 0;
        int b = 1;
        for (int i = 1; i<=n; i++){
            int c = a+b;
            a=b;
            b=c;
            System.out.print(c + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many digits you want to know: ");
        int x = sc.nextInt();
        series(x); 
    }
}