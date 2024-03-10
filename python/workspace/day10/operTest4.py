#%% (1) 대소비교
# 두 정수 입력받기
n1Msg="첫번째 정수 : "
n2Msg="두번째 정수 : "

num1=int(input(n1Msg))
num2=int(input(n2Msg))

# num1이 num2보다 크면 num1이 큰 값
# num1이 num2보다 작으면 num1이 작은 값
# num2가 더 크거나, num1과 num2가 같으면 False쪽으로 이동한다.
# else쪽(False쪽)에서 한 번 더 두 수가 같은지 물어본다.
# 만약 두 수가 같다면 "두 수는 같습니다", 두 수가 같지 않다면,
# num2가 더 큰 값이다.
result=num1 if num1>num2 else "X\n두 수가 같습니다." if num1==num2 else num2
print("더 큰 값 : {}".format(result))

#%% (2) 퀴즈게임
# =============================================================================
# 다음 중 프로그래밍 언어가 아닌 것은?
# 1. JAVA
# 2. Python
# 3. C
# 4. 망둥어
# =============================================================================

qMsg="다음 중 프로그래밍 언어가 아닌 것은?"
choiceMsg="1.JAVA\n2.Python\n3.C\n4.망둥어\n"
choice=int(input(qMsg+"\n"+choiceMsg))
answer=4
result="정답!" if choice==answer else "오답..."
print(result)

#%% 연산과 연결
print(10+9)
print('10'+'9')
print('10'+str(9))