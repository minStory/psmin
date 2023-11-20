count = int(input('정수를 입력하세요 >>> '))
if count <= 0:
    print('잘못된 입력입니다.')
else:
    n = 0
    while n < count:
        print('{}번째 Hello'.format(n + 1))
        n += 1
