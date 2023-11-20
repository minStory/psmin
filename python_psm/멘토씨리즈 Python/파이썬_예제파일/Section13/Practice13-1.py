# 첫 번째 풀이
nation = ['그리스', '아테네', '독일', '베를린', '러시아', '모스크바', '미국', '워싱턴']
file = open('nation.txt', 'wt')
for i in range(0, len(nation), 2):
    file.write('{}-{}\n'.format(nation[i], nation[i + 1]))
file.close()

print('생성된 nation.txt 파일의 내용은 다음과 같습니다.')
file = open('nation.txt', 'rt')
line_list = file.readlines()
for line in line_list:
    print(line, end='')
file.close()


'''
# 두 번째 풀이
nation = ['그리스', '아테네', '독일', '베를린', '러시아', '모스크바', '미국', '워싱턴']
file = open('nation.txt', 'wt')
for i, country in enumerate(nation):
    if i % 2 == 0:
        file.write('{}-{}\n'.format(nation[i], nation[i + 1]))
file.close()

print('생성된 nation.txt 파일의 내용은 다음과 같습니다.')
file = open('nation.txt', 'rt')
line_list = file.readlines()
for line in line_list:
    print(line, end='')
file.close()
'''
