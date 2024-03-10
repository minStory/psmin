#%% 문제1
wordList=[]
n=int(input())
for i in range(n):
    wordList.append(input())
mySet=set(wordList)
myList=list(mySet)
for i in range(len(myList)):
    for j in range(i+1,len(myList)):
        if len(myList[i])>len(myList[j]):
            myList[i],myList[j]=myList[j],myList[i]
        elif len(myList[i])==len(myList[j]):
            seq=0
            while myList[i]!=myList[j]:
                if ord(myList[i][seq])>ord(myList[j][seq]):
                    myList[i],myList[j]=myList[j],myList[i]
                    break
                elif ord(myList[i][seq])<ord(myList[j][seq]):
                    break
                seq+=1
                
for i in myList:
    print(i)

#%% 문제2
memberList=[]
n=int(input())
for i in range(n):
    memberList.append(input().split())
for i in memberList:
    i[0]=int(i[0])
seq=1
for i in memberList:
    i.append(seq)
    seq+=1
for i in range(len(memberList)):
    for j in range(i+1,len(memberList)):
        if memberList[i][0]>memberList[j][0]:
            memberList[i],memberList[j]=memberList[j],memberList[i]

for i in range(len(memberList)):
    for j in range(i+1,len(memberList)):
        if memberList[i][0]==memberList[j][0] and memberList[i][2]>memberList[j][2]:
            memberList[i],memberList[j]=memberList[j],memberList[i]

for i in memberList:
    print(i[0],i[1],sep=' ')

#%%

# 람다함수(익명함수)
# def 함수이름(매개변수):
#     return 결과

# lambda 매개변수 : 결과

#%% 클래스
class Std:
    def __init__(self):
        print("기본생성자 생성")
        
    # def __init__(self,name,kor,math,eng):
    #     self.name=name
    #     self.kor=kor
    #     self.math=math
    #     self.eng=eng
    #     print("생성되었습니다.")
        
    def __del__(self):
        print("소멸되었습니다.")
# std1=[
#     Std("박성민",1,2,3),
#     Std("홍길동",4,5,6)
# ]
# print(std1[1].name)
std2=Std()