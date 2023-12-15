#include<stdio.h>
#include<malloc.h>
struct node {
	int data;
	struct node *next;
};
ptr=new (node*)malloc(sizeof(node));
printf("\nEnter element ");
scanf("%d",&ptr->data);
