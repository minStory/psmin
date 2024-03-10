# 자료구조 : 대량의 데이터를 효율적으로 관리할 수 있도록 하는 데이터의 구조를 의미
            # 데이터 특성에 따라서 체계적인 구조화가 필요하며, 이러한 구조는 코드의 효율성, 성능을 결정한다.
# 종류 : 배열, 스택, 큐, 링크드리스트, 해쉬테이블, 힙
# 단순구조 : 정수, 실수, 문자, 문자열
# 선형구조 : 순차리스트, 연결리스트(단순연결, 이중연결, 원형연결), 스택, 큐, 데크
# 비선형구조 : 트리(일반트리, 이진트리), 그래프(방향그래프, 무방향그래프)

# 배열 : 같은 종류의 데이터를 순차적으로 저장하는 자료구조
# 접근방식 : index를 통해 직접 접근
# 장점 : 빠른 접근이 가능
# 단점 : 데이터 추가, 삭제, 검색 시간이 많이 든다, 데이터 추가 시 공간이 필요함,
        # 길이 조절이 어려움
        
# 큐 : 선입선출(FIFO), 먼저 넣은 데이터를 꺼내는 데이터 구조

# 스택 : 후입선출(LIFO), 가장 나중에 넣은 데이터를 먼저 뺄 수 있는 구조
# push() : 데이터를 스택에 쌓는 기능 (List의 append()와 동일)
# pop() : 데이터를 스택에서 꺼내는 기능
# 장점 : 구조 단순하고, 구현이 쉽다. 데이터를 불러오는 속도가 빠르다
# 단점 : 데이터 최대 개수를 사전에 정해줘야함
        # 저장공간 낭비가 발생할 수 있다.(미리 최대 개수만큼 공간을 확보하기 때문)

#%% test01
import queue
print("===Queue===")
data_q= queue.Queue()
data_q.put(1)
data_q.put(2)
data_q.put(3)
print(data_q.get())
print(data_q.get())
print(data_q.get())

print("===LifoQueue===")    #후입선출 큐
data_q2=queue.LifoQueue()
data_q2.put(1)
data_q2.put(2)
data_q2.put(3)
print(data_q2.get())
print(data_q2.get())
print(data_q2.get())

print("===PriorityQueue")
data_q3=queue.PriorityQueue()
data_q3.put([1,"korea"])    #put((우선순위,data)) 튜플 또는 리스트 형태로 입력
data_q3.put([3,"japan"])
data_q3.put([2,"USA"])
print(data_q3.get())
print(data_q3.get())
print(data_q3.get())

#%% 문제1
wordList=[]
str=input()
i=0
re_str=""
while True:
    if i==len(str):
        if str[i-1]==">":
            wordList.append(re_str)
        else:
            wordList.append(re_str[::-1])
        break
    re_str+=str[i]
    if str[i]==" ":
        wordList.append(re_str[-2::-1])
        re_str=""
    elif str[i]=="<":
        wordList.append(re_str[-2::-1])
        re_str=""
        while str[i]!=">":
            re_str+=str[i]
            i+=1
        wordList.append(re_str+">")
        re_str=""
    i+=1

for i in wordList:
    if i=="":
        wordList.remove("")

for i in range(len(wordList)):
    print(wordList[i],end='')
    if i==len(wordList)-1:
        break
    if wordList[i][len(wordList[i])-1]!=">" and wordList[i+1][0]!="<":
        print(end=' ')

#%% 문제1
str=input()
result=""
temp=""
i=0
while True:
    temp+=str[i]
    if str[i]==" ":
        result+=temp[-2::-1]+" "
        temp=""
    elif str[i]=="<":
        result+=temp[-2::-1]
        temp=""
        while str[i]!=">":
            result+=str[i]
            i+=1
        result+=">"
    i+=1
    if i==len(str):
        if str[i-1]==">":
            result+=temp
        else:
            result+=temp[::-1]
        break
print(result)        
    
#%% 문제2
n=int(input())
cnt=0
while n%5!=0:
    n-=3
    cnt+=1
while n>0:
    n-=5
    cnt+=1
if n==0:
    print(cnt)
else:
    print(-1)
    