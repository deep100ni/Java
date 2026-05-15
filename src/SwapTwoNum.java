import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Int A :");
        int a = sc.nextInt();
        System.out.println("Enter Int B :");
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swap A = "+a);
        System.out.println("After Swap b = "+b);
    }
}
