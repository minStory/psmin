# =============================================================================
# A~F까지 출력
# A~F까지 중 C제외하고 출력
# aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
# =============================================================================
# A B C D E F
print(ord('A'))
print(ord('B'))
# range(start, end, step)
# start가 0일 때에는 생략이 가능하다.
# step이 1일 때에는 생략이 가능하다.
# for i in range(0,6,1):
for i in range(6):
    print(chr(i+65))

for i in range(5):
    if i>1:
        i+=1
    print(chr(65+i))
    
for i in range(26):
    # ??? % 2 == 0 짝수
    # ??? % 2 == 1 홀수
    print(chr(97+i if i%2==0 else 65+i),end='')
