#include<stdio.h>
int main()
{
    int i,a[10],at[10],bt[10],temp=0;
    
    /*for ( i = 0; i < 5; i++)
    {
        printf("Enter Arrival %d\t",i);
        scanf("\n %d",&at[i]);
    }
    */
     for ( i = 0; i < 5; i++)
    {
        printf("Enter Brust Time %d\t",i);
        scanf("\n %d",&bt[i]);
    }
    printf("Gant Chart\n");
    for ( i = 0; i < 5; i++)
    {
        temp=bt[i+1];
        bt[i]=bt[i+1]+bt[i];
        printf("%d\t",bt[i]);
    }
    
    printf("\nProcess No.\tAT\tBT\tCT\tTAT\tWT");
    for ( i = 0; i < 5; i++)
    {
        printf(" P%d\t\t%d\t%d\n",i,at[i],bt[i]);
    }
    
    return 0;
}