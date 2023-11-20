try:
    a = int(input('제수를 입력하세요 >>> '))
    b = int(input('피제수를 입력하세요 >>> '))
    result = a / b
except ZeroDivisionError:
    print('0으로 나눌 수 없습니다.')
except ValueError:
    print('정수만 입력할 수 있습니다.')
else:
    print('{} / {} = {}'.format(a, b, result))
finally:
    print('프로그램을 종료합니다.')
