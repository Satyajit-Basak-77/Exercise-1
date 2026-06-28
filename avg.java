import java.util.*;
public class avg {
    public static void avgFind(double a, double b, double c){
        double avg = (a+b+c)/3;
        System.out.print("your average of three numbers are " + avg);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        avgFind(x, y, z);
    }
}