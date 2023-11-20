times = int(input('초를 입력하세요 >>> '))
hour = times // 3600
minute = times % 3600 // 60
second = times % 60
print('변환 결과는 {}시간 {}분 {}초입니다.'.format(hour, minute, second))
