def vending_machine(money):
    price = 700
    count = money // price
    for drink in range(count + 1):
        change = money - drink * price
        print('음료수 = {}개, 잔돈 = {}원'.format(drink, change))

vending_machine(3000)
