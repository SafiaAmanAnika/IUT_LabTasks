#include<stdio.h>
int main() {
    int a,b,c,d,e;
    printf("Enter a dollar amount: ");
    scanf("%d",&a);
    b=a/20;
    c=(a-20*b)/10;
    d=((a-20*b)-10*c)/5;
    e=(((a-20*b)-10*c)-5*d);
    printf("$20 bills: %d\n$10 bills: %d\n$5 bills: %d\n$1 bills: %d\n",b,c,d,e);
    return 0;
}