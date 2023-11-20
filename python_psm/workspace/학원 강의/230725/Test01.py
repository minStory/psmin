#%% 문제1
str=input("문자열 입력 >>> ")
for i in str:
    if 65<=ord(i)<=90:
        i=ord(i)+32
        print(chr(i),end='')
    elif 97<=ord(i)<=122:
        i=ord(i)-32
        print(chr(i),end='')
    else:
        print(i,end='')

#%% lotto
import random as r
lotto=[]
def getNum():
    while len(lotto)<6:
        lotto.append(r.randint(1,45))
        result=list(set(lotto))
    return result
print(getNum())

#%% 문제2
n=int(input())
def print_reverse(n):
    n=list(str(n))
    for i in range(len(n)-1,-1,-1):
        print(n[i],end=' ')
print_reverse(n)
#%%문제2 (재귀)
n=int(input())
n=list(str(n))
def reverse(n):
    result=[]
    if len(n)==0:
        return
    else:
        result=n.pop()
        print(result,end=' ')
        reverse(n)
reverse(n)

#%% 문제3
inHour=int(input("들어온 시간 입력 >>> "))
inMinute=int(input("들어온 분 입력 >>> "))
outHour=int(input("나간 시간 입력 >>> "))
outMinute=int(input("나간 분 입력 >>> "))
print("들어온 시간 {}시 {}분 입니다.".format(inHour,inMinute))
print("나간 시간 {}시 {}분 입니다.".format(outHour,outMinute))
changeIn=inHour*60+inMinute
changeOut=outHour*60+outMinute
parking=changeOut-changeIn
print("주차시간은 {}분입니다.".format(parking))
if parking<=30:
    result=1000
else:
    result=1000+(((parking//10-3) if parking%10==0 else (parking//10-3)+1)*200)
print("최종 요금은 {}원입니다.".format(result))