import java.util.Scanner;

public class WeightedAverage{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three grades separated by spaces: ");
        double grade1 = scanner.nextDouble();
        double grade2 = scanner.nextDouble();
        double grade3 = scanner.nextDouble();

        System.out.print("Enter three weights separated by spaces: ");
        double weight1 = scanner.nextDouble();
        double weight2 = scanner.nextDouble();
        double weight3 = scanner.nextDouble();

        double weightedAverage = calculateWeightedAverage(grade1, weight1, grade2, weight2, grade3, weight3);

        System.out.println("The weighted average is: " + weightedAverage);

        scanner.close();
    }

    private static double calculateWeightedAverage(double grade1, double weight1, double grade2, double weight2, double grade3, double weight3) {
        double sumWeights = weight1 + weight2 + weight3;
        double weightedAverage = (grade1 * weight1 + grade2 * weight2 + grade3 * weight3) / sumWeights;
        return weightedAverage;
    }
}
