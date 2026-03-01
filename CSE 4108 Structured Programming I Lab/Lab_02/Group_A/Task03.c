#include<stdio.h>
int main() {
    const float PI=3.141593;
    float a,b;
    printf("Enter value in degrees: ");
    scanf("%f",&a);
    b=PI*a/180;
    printf("Value in radians: %f",b);
    return 0;
}