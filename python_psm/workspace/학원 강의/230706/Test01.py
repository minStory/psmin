#%% set
s1={"apple","banana","cherry"}
s2={"apple","banana","orange"}
print(s1&s2)
print(s1.intersection(s2))

print(s1|s2)
print(s1.union(s2))

print(s1-s2)
print(s1.difference(s2))
print(s2-s1)
print(s2.difference(s1))

#%% test01
def get_average(marks):
    sum=0
    for i in marks:
        sum+=marks[i]
    return sum/len(marks)
marks={"국어":90,"영어":80,"수학":85}
average=get_average(marks)
print("평균은 {}점입니다.".format(average))
#%% 문제1
x,y=map(int,input().split())
if x>0:
    if y>0:
        print(1)
    else:
        print(4)
else:
    if y>0:
        print(2)
    else:
        print(3)
#%% 문제2
while True:
    a,b=map(int,input().split())
    if a==0 and b==0:
        break
    print(a+b)
#%% 문제3
d={"a":123123,"b":"blog","c":3333}
if "b" in d:
    print("안에 있습니다.")
if "e" not in d:
    print("안에 없습니다.")
#%% 문제4
d={"철수":80,"영희":90,"민수":40}
print(d)
d.update({"민수":88})
d["딸기"]=98
d.pop("영희")
# del d["영희"]
print(d)
#%% 문제5
def L_num(a,b):
    print(a if a>b else b)
a=int(input())
b=int(input())
L_num(a,b)
#%% 문제6
n=int(input())
fac=1
for i in range(n):
    fac*=i+1
print(fac)
#%% test
def fac(n):
    if n==1:
        return 1
    else:
        return n*fac(n-1)
n=int(input())
print(fac(n))
#%% test
total=0
def gift(dic,who,money):
    dic[who]=money
    total+=money
wedding={}
gift(wedding,"영희",5) 
gift(wedding,"철수",3) 
gift(wedding,"이모",10)
print("축의금 명단 : {}".format(wedding))
print("전체 축의금 : {}".format(total))