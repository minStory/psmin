#%% test01
li=set(list(set([6,6,5,1,9])))
print(li)
print(type(li))
#%% test02
s1={"apple","banana","cherry"}
s2={"apple","banana","orange"}
print(s1.intersection(s2))
print(s1&s2)
print(s1.union(s2))
print(s1|s2)
print(s1.difference(s2))
print(s1-s2)
print(s2.difference(s1))
print(s2-s1)
#%% test03
li=[1,2,3]
def f(n):
    global li
    li=[1,2,3,4]
    print(li)
f(5)
#%% 피보나치수열
def fibo(n):
    if n<=2:
        return 1
    else:
        return fibo(n-2)+fibo(n-1)
n=int(input())
fibo(n)
#%% 피보나치 반복
n=int(input())
a=1
b=1
cnt=2
while cnt!=n:
    c=a+b
    a=b
    b=c
    cnt+=1
print(c)
#%% test
import math
def f(n):
    if n==3:
        return 0
    for i in range(n):
        for j in range(n):
            if n//3<=i<n//3*2 and n//3<=j<n//3*2 :
                print(" ",end='')
            else:
                print("*",end='')
        print()
    n=math.sqrt(n)
    f(n)
n=int(input())
print(f(n))