#include<stdio.h>
int main() {
    float a,b;
    printf("Enter value of x: ");
    scanf("%f",&a);
    b=(-3.5*a*a*a*a*a + 4.25/(a*a*a*a) + 20*a*a*a)*3*a*a;
    printf("Value of y: %f",b);
    return 0;
}