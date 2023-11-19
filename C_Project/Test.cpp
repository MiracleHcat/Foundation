//#include<stdio.h>
//int main(void)
//{
//	int a[1003];
//	a[0] = 0;
//	int n;
//	scanf_s("%d", &n);
//	int i = 1;
//	int cnt = n;
//	while (n > 0) {
//		scanf_s("%d", &a[i]);
//		i++;
//		n--;
//	}
//	a[i] =1001;//i=4
//	int x = 0;
//	for (i = 1; i <= cnt; i++) {
//		if (a[i] == a[i - 1] + 1 && a[i] == a[i + 1] - 1) {
//			x++;
//		}
//	}
//	printf("%d", x);
//
//	return 0;
//}
