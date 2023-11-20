coffee = 0
money = int(input('자판기에 얼마를 넣을까요? >>> '))
while money >= 300:
    coffee += 1
    money -= 300
    print('커피 {}잔, 잔돈 {}원'.format(coffee, money))
