# 첫 번째 풀이입니다.
rainbow = ['red', 'orange', 'yellow', 'green', 'blue', 'navy', 'purple']
for no, color in enumerate(rainbow):
    print('무지개의 {}번째 색은 {}입니다.'.format(no + 1, color))
    
print()

# 두 번째 풀이입니다.
for idx in range(len(rainbow)):
    print('무지개의 {}번째 색은 {}입니다.'.format(idx + 1, rainbow[idx]))
