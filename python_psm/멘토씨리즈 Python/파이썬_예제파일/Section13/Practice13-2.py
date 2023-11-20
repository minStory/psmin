prev_file = open('연락처.txt', 'rt')
buffer = prev_file.read()
n = buffer.count('"011-')
buffer = buffer.replace('"011-', '"010-')
print('총 {}건의 011 데이터를 찾았습니다.'.format(n))
prev_file.close()

new_file = open('연락처.txt', 'wt')
new_file.write(buffer)
new_file.close()
print('모든 데이터를 수정했습니다.')

## 연락처.txt
##"김나라", "목포시", "011-1111-1111"
##"이나라", "서울시", "011-2222-2222"
##"오나라", "전주시", "010-3333-3333"
##"정나라", "속초시", "011-4444-4444"
##"유나라", "제주시", "010-5555-5555"
