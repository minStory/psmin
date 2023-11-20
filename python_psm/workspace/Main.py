priceList=[]
dayList=[]
tempList=[]
n=int(input("몇번"))
for i in range(n):
    dayList.append(int(input("몇일")))
    tempList=input("가격").split()
    priceList.append(tempList)

for i in range(len(priceList)):
    for j in range(len(priceList[i])):
        priceList[i][j]=int(priceList[i][j])
        
resultList=[]   
for i in range(len(priceList)):
    result=0
    temp=0
    total=0
    priceList[i].append(0)
    cnt=0
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