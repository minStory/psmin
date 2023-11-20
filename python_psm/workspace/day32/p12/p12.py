# =============================================================================
# 모듈 : .py파일
# 패키지 : 모듈을 담고 있는 폴더
# 계산기 폴더 안에 사칙연산 파이썬 파일 4개가 있다면,
# 계산기 패키지 안에 에모듈이 4개 있는 것이다.
# =============================================================================

# =============================================================================
# import 모듈명
# from 모듈 import 함수
# from 모듈 import 함수1, 함수2
# from 모듈 import *
# =============================================================================

#%% 1
import random
import time
pot=[]
pot=list(range(1,46))
jackpot=[]
for i in range(6):
    random.shuffle(pot)
    jackpot.append(pot.pop())
    time.sleep(2)
    print("{}번째 당첨번호는 {}입니다.".format(i+1,jackpot[i]))
jackpot.sort()
print(jackpot)

#%% 2
import random
import time
import math
ranNum=random.randint(1,100)
startTime=time.time()
while True:
    answer=int(input("어떤 값일까요? >>> "))
    if ranNum>answer:
        print("Up")
    elif ranNum<answer:
        print("Down")
    else:
        print("정답입니다.")
        break
endTime=time.time()
leadTime=math.floor(endTime-startTime)
print("{}초만에 성공했습니다.".format(leadTime))
