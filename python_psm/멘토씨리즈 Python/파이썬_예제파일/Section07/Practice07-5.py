for n in range(1, 100):
    units = n % 10
    tens = n // 10
    condition1 = units % 3 == 0 and units != 0
    condition2 = tens % 3 == 0 and tens != 0 
    if condition1 and condition2:
        print('짝짝', end='\t')
    elif condition1 or condition2:
        print('짝', end='\t')
    else:
        print(n, end='\t')
    if n % 10 == 0:
        print()
