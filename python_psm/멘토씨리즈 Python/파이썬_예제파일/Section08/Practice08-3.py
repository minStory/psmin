answer = 'qwerty'
count = 0
while True:
    if count == 5:
        print('비밀번호 입력 횟수를 초과했습니다.')
        break
    pw = input('비밀번호를 입력하세요 >>> ')
    if pw == answer:
        print('비밀번호를 맞혔습니다.')
        break
    count += 1
