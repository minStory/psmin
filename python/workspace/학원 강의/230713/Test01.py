#%% 문제1
def f():
    li2=[]
    for i in range(len(li)):
        for j in range(len(li)):
            if i!=j:
                temp=li[i]+li[j]
                li2.append(temp)
    print(list(set(sorted(li2))))
li=list(map(int,input().split(",")))
f()
#%% 문제2
li=[]
for i in range(6):
    li.append(input())
li.sort()
for i in li:
    print(i)
#%% 문제3
def f(year):
    if year%4==0 and year%100!=0 or year%400==0:
        return "윤년"
    else:
        return "평년"
year=int(input())
print(f(year))
#%% 문제4
str=input()
print(str.find(" ")+1)
#%% 문제5
n=int(input())
isPrime=[]
isPrime=map(int,input().split())
cnt=0
for i in isPrime:
    j=1
    temp=0
    while j<i:
        if i%j==0:
            temp+=1
        j+=1
    if temp==1:
        cnt+=1
print(cnt)