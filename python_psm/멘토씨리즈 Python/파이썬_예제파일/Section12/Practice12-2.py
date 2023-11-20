import random
import time
import math

answer = random.randint(1, 100)

print('UpDown게임을 시작합니다.')
start = time.time()
while True:
    n = int(input('어떤 값일까요? >>> '))
    if answer == n:
        print('정답입니다.')
        break
    elif answer < n:
        print('Down')
    else:
        print('Up')
end = time.time()

elapse = end - start
print('{}초 만에 성공했습니다.'.format(math.floor(elapse)))
