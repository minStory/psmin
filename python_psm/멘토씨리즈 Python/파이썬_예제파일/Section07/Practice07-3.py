count = int(input('몇 개의 과일을 보관할까요? >>> '))
basket = []
for n in range(count):
    fruit = input('{}번째 과일을 입력하세요 >>> '.format(n + 1))
    basket.append(fruit)
print('입력 받은 과일들은 {}입니다.'.format(basket))
