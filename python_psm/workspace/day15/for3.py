#%% 기타 제어문
# break : 인터프리터가 break를 만나자마자 반복문 탈출
# continue : 아래 문장을 하지 않고 다음 반복

# 1~10까지 중 4까지만 출력
for i in range(10):
    print(i+1)
    if i==3:
        break
    
# 1~10까지 중 4를 제외하고 출력
for i in range(10):
    if i==3:
        continue
    print(i+1)
#%% 기타제어문 실습
# 100~1까지 중 70까지만 출력하기
for i in range(100):
    print(100-i)
    if i==30:
        break

# 1~100까지 중 3과 5의 공배수만 출력하기
for i in range(100):
    if (i+1)%3!=0 or (i+1)%5!=0:
        continue
    print(i+1)