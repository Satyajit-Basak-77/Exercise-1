import java.util.Scanner;
public class age {
    public static void ageChecker(int n){
        if (n>=18){
            System.out.print("Adult");
        } else {
            System.out.print("Minor");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        ageChecker(age);
    }    
}