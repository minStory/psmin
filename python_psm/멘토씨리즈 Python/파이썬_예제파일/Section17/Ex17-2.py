try:
    filename = input('열고자 하는 파일명을 입력하세요 >>> ')
    file = open(filename, 'rt')
except FileNotFoundError:
    print('{} 파일이 존재하지 않습니다.'.format(filename))
else:
    buffer = file.read()
    print(buffer, end='')
    print()
    file.close()
finally:
    print('프로그램을 종료합니다.')
