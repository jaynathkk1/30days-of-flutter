n=int(input("Enter size of List "))
list1=[]
def Binary_Search(list1,key):
    l=0
    h=len(list1)-1
    while l <= h:
      mid=(l+h)//2
      if key == list1[mid]:
         return mid
      elif key > list1[mid]:
         l=mid+1
      elif key < list1[mid]:
         h=mid-1
    return -1
for i in range(n):
    v=int(input("enter element in list "))
    list1.append(v)
list1.sort()
print(list1)
r=Binary_Search(list1,key)
print(key,"Element at index",r)