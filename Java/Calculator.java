import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        float sum = num1 + num2;
        float difference = num1 - num2;
        float product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (num2 != 0) {
            float quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Error: Division by zero not allowed.");
        }

        scanner.close();
    }
}