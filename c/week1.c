#include <stdio.h>

int main(void) {
	int a,b,c,d,e;
	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);
	scanf("%d", &d);
	scanf("%d", &e);

	int area = 0;
	int cubic = 0;

	area = 2*(a*b+b*c+c*a)+8*d*(a+b+c-6*e);
	cubic = a*b*c-2*d*((a-2*e)*(b-2*e)+(a-2*e)*(c-2*e)+(c-2*e)*(b-2*e));
	printf("  %d    %d", area, cubic);
	// your code goes here
	return 0;
}
