for dan in range(2, 10):
    if dan % 2 == 0:
        print()
        continue
    for n in range(1, 10):
        if dan < n:
            break
        print('{}x{}={}'.format(dan, n, dan * n))
