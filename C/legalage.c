#include <stdio.h>

int main() {
    int age;

    printf("Enter your age: ");
    scanf("%d", &age);

    if (age >= 18) {
        printf("You are of legal age. (Brazil)\n");
    } else {
        printf("You are not of legal age. (Brazil)\n");
    }

    return 0;
}
