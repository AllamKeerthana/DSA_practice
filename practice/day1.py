n = int(input("enter the range: "))
def even(n):
    for i in range(0,n+1,2):
        print(i,end = " ")

even(n)
print()
num = [1,2,3,4,5]
sums = 0
for i in num: 
    sums= sums+i
print(sums)