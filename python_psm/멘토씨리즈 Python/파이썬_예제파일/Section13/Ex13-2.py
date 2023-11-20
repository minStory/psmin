file = open('엄마돼지아기돼지.txt', 'rt')

line_list = file.readlines()

count = 0
for line in line_list:
    for ch in line:
        if ch == '꿀':
            count += 1

print('꿀은 전체 {}번 나타납니다.'.format(count))
