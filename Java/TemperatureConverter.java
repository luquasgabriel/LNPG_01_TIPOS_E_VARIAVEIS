import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsiusTemperature = scanner.nextDouble();

        double fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature);

        System.out.println("The equivalent temperature in Fahrenheit is: " + fahrenheitTemperature);

        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
}