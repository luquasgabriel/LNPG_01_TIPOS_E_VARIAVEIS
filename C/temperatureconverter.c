#include <stdio.h>

int main() {
    double celsius, fahrenheit;

    printf("Enter the temperature in Celsius: ");
    scanf("%lf", &celsius);

    fahrenheit = (celsius * 1.8) + 32;

    printf("The temperature in Fahrenheit is: %.2lf\n", fahrenheit);

    return 0;
}