#include<stdio.h>
int main()
{
	int n,i=1,sum=0,sum1=0;
	printf("enter the value of n");
	scanf("%d",&n);
	while(i<=n)
	{
		sum=sum+i;
		printf("%d\n",i);
		i++;
		if(i%2==0)
		{
			printf("even numbers is :%d",i);
			sum1=sum1+i;
			i++;
		}
		printf("even numbers are :%d\n",sum1);
	}
	return 0;
}
