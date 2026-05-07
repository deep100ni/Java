import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();
        System.out.println("Enter operator from (+, -, *, /) :");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                int sum = num1 + num2;
                System.out.println("Sum = " + sum);
                break;
            case '-':
                int sub = num1 - num2;
                System.out.println("Sub = " + sub);
                break;
            case '*':
                int mul = num1 * num2;
                System.out.println("Mul = " + mul);
                break;
            case '/':
                if (num2 != 0) {
                    int div = num1 / num2;
                    System.out.println("Div = " + div);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Operator Invalid");
        }
        sc.close();
    }
}