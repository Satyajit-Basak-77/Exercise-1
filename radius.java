import java.util.*;
public class radius {
    public static void circumference(double r){
        if (r>=0){
            System.out.print( "Your circumference of radius " + r + " is " + 2*(22.0/7.0)*r);
            return;
        } else {
            System.out.print("Invalid");
            return;
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        circumference(x);
    }
}
