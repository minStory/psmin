total = 0
end = int(input('임의의 양수를 입력하세요 >>> '))
for n in range(0, end + 1):
    total += n
print('1부터 {}사이 모든 정수의 합계는 {}입니다.'.format(n, total))
