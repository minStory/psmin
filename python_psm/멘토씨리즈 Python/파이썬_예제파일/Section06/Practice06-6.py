n = 1
while n <= 9:
    dan = 2
    while dan <= 9:
        print('{}×{}={}'.format(dan, n, dan * n), end='\t')
        dan += 1
    print()
    n += 1
