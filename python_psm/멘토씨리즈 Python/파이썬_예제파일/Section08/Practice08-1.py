money = 10000
while True:
    print('현재 {}원이 있습니다.'.format(money))
    if money == 0:
        break
    spend = int(input('사용할 금액 입력 >>> '))
    if spend <= 0:
        print('0 이하의 금액은 사용할 수 없습니다.')
    elif spend > money:
        print('{}원이 부족합니다.'.format(spend - money))
    else:
        money -= spend
