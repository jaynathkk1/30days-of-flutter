row=int(input("Enter size of Rows "))
column=int(input("Enter size of column "))
list1=[]
list2=[]
list3=[]
for i in range(row):
    l=[]
    for j in range(column):
        v=int(input("enter element in list "))
        l.append(v)
    list1.append(l)
for i in range(row):
    for j in range(column):
        print(list1[i][j],end=" ")
    print()
for i in range(row):
    l=[]
    for j in range(column):
        v=int(input("enter element in list "))
        l.append(v)
    list2.append(l)
for i in range(row):
    for j in range(column):
        print(list2[i][j],end=" ")
    print()
for i in range(row):
    for j in range(column):
        for k in range(column):
            list3+= list1[i][k]*list2[k][j]
for i in range(row):
    for j in range(column):
        print(list3[i][j],end=" ")
    print()  