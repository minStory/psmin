#%% math
# math 모듈이름
# sin -> 사인값
# cos -> 코사인값
# tan -> 탄젠트값
# log -> 로그값
# ceil -> 올림
# floor -> 내림

import math as m

print(m.ceil(3.1))

#%% 문제1
str=input()
if len(str)<=80:
    print(str.upper())

#%% 문제2
priceList=[]
tempList=[]
n=int(input("몇번? >>> "))
for i in range(n):
    day=int(input("몇일? >>> "))
    tempList=input("가격? >>> ").split()
    priceList.append(tempList)

for i in range(len(priceList)):
    for j in range(len(priceList[i])):
        priceList[i][j]=int(priceList[i][j])

resultList=[]
for i in range(len(priceList)):
    result=0
    temp=0
    total=0
    cnt=0
    priceList[i].append(0)
    for j in range(len(priceList[i])-1):
        if priceList[i][j]<=priceList[i][j+1]:
            temp+=priceList[i][j]
            cnt+=1
        else:
            total=priceList[i][j]*cnt
            result+=total-temp
            temp=0
            cnt=0
    resultList.append(result)

for i in range(len(resultList)):
    print("#%d %d" %((i+1),resultList[i]))
#%% 문제3
f_list=[]
print("==========친구==========")
while True:
    choice=int(input("1.친구 리스트 출력\n2.친구 추가\n3.친구 삭제\n4.친구 이름 변경\n9.나가기"))
    if choice==1:
        print(f_list)
    elif choice==2:
        name=input("추가할 친구 이름 입력 >>> ")
        f_list.append(name)
    elif choice==3:
        name=input("삭제할 친구 이름 입력 >>> ")
        if name in f_list:
            f_list.remove(name)
    elif choice==4:
        name=input("변경할 친구 이름 입력 >>> ")
        newName=input("새 이름 입력 >>> ")
        for i in range(len(f_list)):
            if f_list[i]==name:
                f_list[i]=newName
                break
    elif choice==9:
        break
    
#%% 문제4
coinList=[50000,10000,5000,1000,500,100,50,10]
resultList=[]
n=int(input())
for i in range(n):
    cnt=0
    result=""
    price=int(input())
    for j in range(len(coinList)):
        while coinList[j]<=price:
            price-=coinList[j]
            cnt+=1
        result+=str(cnt)+" "
        cnt=0
    resultList.append(result)
    
for i in resultList:
    print(i)