import java.util.*;
public class greater {
    public static void Great(int a, int b){
        if(a<b){
            System.out.print(b);
        } else {
            System.out.print(a);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("Your greater number is ");
        Great(x, y);
        System.out.print(".");
    }    
}
