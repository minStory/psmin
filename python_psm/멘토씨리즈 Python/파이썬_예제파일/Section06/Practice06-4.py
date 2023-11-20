numbers = set()
while len(numbers) < 5:
    n = int(input('0 ~ 9 사이 정수를 입력하세요 >>> '))
    numbers.add(n)
print('모두 입력되었습니다.')
print('입력된 값은 {}입니다.'.format(numbers))
