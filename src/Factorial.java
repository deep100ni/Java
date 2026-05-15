import java.util.Scanner;

public class Factorial {
    public static int factorial(int num){
        int fac = 1;
        for(int i=num;i>=1;i--){
            fac = fac*i;
        }
        return fac;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of which You want to find Factorial :");
        int num = sc.nextInt();
        System.out.println("Factorial = "+factorial(num));
    }
}
