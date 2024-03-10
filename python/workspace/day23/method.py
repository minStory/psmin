#%% method test
# f(x) = 2x+1
# def f(x):
#     return 2*x+1

# print(f(3)+9)

# 두 정수의 덧셈
# def add(num1, num2):
#     result = num1 + num2
#     print(result)

# add(1,3)

# 1~100까지 print()로 출력하는 메소드
# def printFrom1To100():
#     for i in range(100):
#         print(i+1)

# printFrom1To100()

# 1~10까지의 합을 구하는 메소드
# def sumFrom1To10():
#     result = 0
#     for i in range(10):
#         result += i + 1
    
#     return result

# print("1~10까지의 합 : %d" %sumFrom1To10())

# 자연수를 음수로 바꿔주는 메소드
# def changeToNegative(num):
#     result=0
#     if num>0:
#         result = num*-1
#     else:
#         reslut=False
#     return result

# result = changeToNegative(int(input("자연수 : ")))

# if not result:
#     print("자연수만 가능합니다.")
# else:
#     print(result)
    
# 1~n까지의 합을 print()로 출력하는 메소드
# def printSumFrom1(end):
#     result=0
#     for i in range(end):
#         result+=i+1
#     print(result)

# printSumFrom1(10)
    
# 홀수를 짝수로 짝수를 홀수로 바꿔주는 메소드
# def change(num):
#     if num>-1:
#         num+=1
#     else:
#         num=False
#     return num

# num=int(input("정수 : "))
# result=change(num)
# msg=""

# if not result:
#     msg="음수는 불가능합니다."
# else:
#     # print(result)
#     if result%2==0:
#         msg="홀수에서 짝수로 변경되었습니다."
#     else:
#         msg="짝수에서 홀수로 변경되었습니다."
# print(msg)

# 5개의 정수를 오름차순으로 정렬해주는 메소드
def sortASC(numList):
    for i in range(len(numList)-1):
        for j in range(i+1,len(numList)):
            if numList[i]>numList[j]:
                temp=numList[i]
                numList[i]=numList[j]
                numList[j]=temp

numList=[9,7,3,1,2]
sortASC(numList)
print(numList)
