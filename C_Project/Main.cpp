#include<stdio.h>
int main(void)
{
	int i = -1;
	int sign =-1;
	double sum = 0;
	while (i < 10000000000)
	{
		i += 2;
		sign *= -1;
		sum += 1.0 / i * sign;
	}
	printf("%lf",4*sum);
}