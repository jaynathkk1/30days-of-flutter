#include<stdio.h>
int main()
{
    int i,a[10],at[10];
    printf("Enter Arrival Time\n");
    
    printf("Process No.\tAT\tBT\tCT\tTAT\tWT");
    for ( i = 0; i < 5; i++)
    {
        printf("P%d\n",i);
    }
    
    
    return 0;
}