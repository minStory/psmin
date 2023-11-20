number = int(input('10 ~ 99 사이의 정수를 입력하세요 >>> '))
tens = number // 10
units = number % 10
print('십의 자리: {}'.format(tens))
print('일의 자리: {}'.format(units))
