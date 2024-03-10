#%% 1
for i in range(5,0,-1):
    print(i)
    
#%% 2
n=int(input("임의의 양수를 입력하세요 >>> "))
sum=0
for i in range(n):
    sum+=i+1
print("1부터 %d사이 모든 정수의 합계는 %d입니다." %(n,sum))

#%% 3
n=int(input("몇 개의 과일을 보관할까요? >>> "))
basket=[]
for i in range(n):
    basket.append(input("%d번째 과일을 입력하세요 >>> " %(i+1)))
print("입력받은 과일들은 {}입니다.".format(basket))

#%% 4
exam=[99,78,100,91,81,85,54,100,71,50]
score=[]
for i in exam:
    i+=5
    if i>100:
        i=100
    score.append(i)
print(score)

#%% 5
for i in range(99):
    if ((i+1)%10)%3==0 and (i+1)%10!=0:
        if ((i+1)//10)%3==0 and (i+1)//10!=0:
            print("짝",end='')
        print("짝",end='\t')
    else:
        if ((i+1)//10)%3==0 and (i+1)//10!=0:
            print("짝",end='\t')
        else:
            print(i+1,end='\t')
    if (i+1)%10==0:
        print()
