n=int(input("Enter size of List "))
list1=[]
for i in range(n):
    v=int(input("enter element in list "))
    list1.append(v)
num=int(input("enter element you want to search "))
if num == list1[i]:
     print("Number found at ",i)
else:
     print("Number not found in this list ")