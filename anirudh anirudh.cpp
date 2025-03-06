#include<stdio.h>
int main()
{
	int n,i=1,sum=0,even=0;
	printf("enter the value of n");
	scanf("%d",&n);
	while(i<=n)
	{
		printf("%d\n",i);
		i++;
		if(i%2==0)
		{
			printf("even numbers are : %d\n",even);
		}
	}
	return 0;
}
