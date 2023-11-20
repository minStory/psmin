a = [10, 20, 30, 40, 50]

try:
    a[10]
except IndexError as e:
    print(e)
