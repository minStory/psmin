try:
    height = input('키를 입력하세요 >>> ')
    height = round(height)
    print('입력하신 키는 {}cm로 처리됩니다.'.format(height))
except:
    print('예외가 발생했습니다.')
