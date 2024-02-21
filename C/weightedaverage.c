#include <stdio.h>

int main() {
    double grade1, grade2, grade3;
    double weight1, weight2, weight3;
    double weightedAverage;

    printf("Enter grade 1: ");
    scanf("%lf", &grade1);
    printf("Enter weight 1: ");
    scanf("%lf", &weight1);

    printf("Enter grade 2: ");
    scanf("%lf", &grade2);
    printf("Enter weight 2: ");
    scanf("%lf", &weight2);

    printf("Enter grade 3: ");
    scanf("%lf", &grade3);
    printf("Enter weight 3: ");
    scanf("%lf", &weight3);

    weightedAverage = (grade1 * weight1 + grade2 * weight2 + grade3 * weight3) / (weight1 + weight2 + weight3);

    printf("Weighted average: %.2lf\n", weightedAverage);

    return 0;
}