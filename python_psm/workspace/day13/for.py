#%% for test
for i in range(0,10,1):
    print("%d. 박성민" %(i+1))

for i in range(10,0,-1):
    print("%d. 박성민" %i)
    
# 0부터 1씩 증가시키는 for문을 작성한다(10번 반복).
# 단, 10~1까지 출력한다.
for i in range(0,10,1):
    print(10-i)

# n + 0 = 10
# 1. n = 10
# 2. 10 - 0
#%% for task
# =============================================================================
# ※ 고수 : 반복문 시작값을 무조건 0으로 고정
# 1~100까지 출력
# 100~1까지 출력
# 1~100까지 중 짝수만 출력
# A~F까지 출력
# A~F까지 중 C제외하고 출력
# aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
# =============================================================================
for i in range(0,100,1):
    print(i+1)
for i in range(0,100,1):
    print(100-i)
for i in range(0,100,2):
    print(i+2)
for i in range(0,6,1):
    print("%c" %(i+65))
for i in range(0,6,1):
    if i+65!=67:
        print("%c" %(i+65))
for i in range(0,26,1):
    if i%2==1:
        print("%c" %(i+65),end='')
    else:
        print("%c" %(i+97),end='')
print(chr(65))