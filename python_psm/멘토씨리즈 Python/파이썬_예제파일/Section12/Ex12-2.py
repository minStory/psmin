import random

dice = random.randint(1, 6)
while True:
    user = int(input('주사위 값은 얼마일까요? >>> '))
    if dice == user:
        print('{}! 정답입니다.'.format(dice))
        break
    else:
        print('오답입니다. 다시 시도하세요.')
