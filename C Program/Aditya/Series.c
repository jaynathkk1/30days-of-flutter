#include<stdio.h>
#include<stdio.h>
int main()
{
  int i,sum=0;
  for(i=1;i<=11;i=i+2)
  { 
    sum=sum+pow(i,4);
  }
  printf("\n sum=%d",sum);
    return 0;
}
