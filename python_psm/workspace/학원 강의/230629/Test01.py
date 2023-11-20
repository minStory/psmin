#%% 딕셔너리, 세트 출력
dict={1:123,'b':'banana','c':'cherry'}
for i,j in dict.items():
    print(i,j,end=" ")
    print(type(i),type(j))
for i in dict.keys():
    print(i,end=" ")
    print(type(i))
for i in dict.values():
    print(i,end=" ")
    print(type(i))
print()
set={1,2,3,4,99,5,99}
for i in set:
    print(i,end=" ")
    print(type(i))
# print(set[0])
#%% test02
for i in range(5):
    print(str(i)+"= 반복 변수")
print()
for i in range(5,10):
    print(str(i)+"= 반복 변수")
print()
for i in range(0,10,3):
    print(str(i)+"= 반복 변수")
print()
#%% 문자형 <-> 정수형 변환
a='A'
b=66
print(ord(a))
print(chr(b))
#%% 리스트 입력 받기
n=input().split()
print(n)
print(n[0],n[1],n[2],n[3])
print(type(n))
print(type(n[0]))
print(type(int(n[0])))
#%% map 함수 (한줄에 입력 받기)
# A,B=int(input().split())
# print(A,B)
A,B=map(int,input().split())
print(A+B)
#%% 문제1
n=int(input())
cnt=0
value=list(map(int,(input().split()))) #한줄로 함수를 각각 입력하여 띄어쓰기를 기준으로 리스트로 만들어주는 문법
v=int(input())
# print(value.count(v)) #리스트 내장함수 .count()
for i in value:
    if i==v:
      cnt+=1
print(cnt)
#%% 문제2
n,x=map(int,input().split())
value=map(int,input().split())
for i in value:
    if i<x:
        print(i,end=' ')
#%% 문제3
import sys
n=int(input())
value=map(int,input().split())
min=sys.maxsize;max=-sys.maxsize
for i in value:
    if i<min: min=i
    if i>max: max=i
print(min,max)
#%% 시퀀스 for문
list=[i+1 for i in range(5)]
print(list)
#%% while문 구구단
n=int(input())
i=1
while i<=9: #while문 -> 반복 횟수를 모를 때, for문 -> 반복 횟수를 알 때
    # print("%d * %d = %d" %(n,i,n*i))
    print(n,"*",i,"=",n*i)
    i+=1
#%% 중복while문 예제
day=1
while day<=5:
    hour=1
    while hour<=3:
        print("{}일차 {}교시입니다.".format(day,hour))
        hour+=1
    day+=1
#%% continue문 예제
fruits=["사과","감귤"]
count=3

while count>0:
    fruit=input("어떤 과일을 저장할까요? >>> ")
    if fruit in fruits:
        print("동일한 과일이 있습니다.")
        continue
    fruits.append(fruit)
    count-=1
    print("입력이 {}번 남았습니다.".format(count))
    
print("5개 과일은 {}입니다.".format(fruits))
#%%
list=[1,3,2,5,4]
list.sort(reverse=1)
print(list)
for i in list:
    print(i)
list_b=sorted(list)
print(list_b)
list_b.reverse()
print(list_b)
