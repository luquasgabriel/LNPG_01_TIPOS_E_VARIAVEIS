import java.util.Scanner;

public class LegalAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are of legal age. (Brazil)");
        } else {
            System.out.println("You are not of legal age. (Brazil)");
        }

        scanner.close();
    }
}
