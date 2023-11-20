total = 0
for a in range(1, 101):
    if a % 3 == 0: # 3의 배수인지 검사합니다.
        continue
    total += a
print(total)
