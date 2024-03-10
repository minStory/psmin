#%% 1
n=int(input())
while n:
    if n<=0:
        print("잘못된 입력입니다.")
        break
    print("Hello")
    n-=1

#%% 2
n=0
while n<98:
    n+=7
    print(n)
    
#%% 3
money=int(input("자판기에 얼마를 넣을까요? >>> "))
n=0
while money>=300:
    n+=1
    money-=300
    print("커피 %d잔, 잔돈 %d원" %(n,money))

#%% 4
nSet=set()
while len(nSet)<5:
    nSet.add(int(input("0 ~ 9 사이 정수를 입력하세요 >>> ")))
print("모두 입력되었습니다.\n입력된 값은 {}입니다.".format(nSet))

#%% 5
n=1
while n<=100:
    print(n,end='\t')
    n+=1
    if n%10==1:
        print()

#%% 6
dan=2
n=1
while n<=9:
    dan=2
    while dan<=9:
        print("%dx%d=%d" %(dan,n,dan*n),end='\t')
        dan+=1
    n+=1
    print()
    