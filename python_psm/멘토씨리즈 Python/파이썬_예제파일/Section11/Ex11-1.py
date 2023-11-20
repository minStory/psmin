def adder(*args):
    print('{}의 합은 {}입니다.'.format(args, sum(args)))

adder(1, 2)
adder(1, 2, 3)
adder(1, 2, 3, 4)
