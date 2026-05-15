import java.util.Scanner;

public class SwapWithoutThird {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Int A :");
        int a = sc.nextInt();
        System.out.println("Enter Int B :");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap A = "+a);
        System.out.println("After Swap b = "+b);
    }
}
