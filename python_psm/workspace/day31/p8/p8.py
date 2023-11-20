#%% 1
money=10000
print()
while True:
    print("현재 %d원 있습니다." %money)
    if money<=0:
        break
    payMoney=int(input("사용할 금액 입력 >>> "))
    if payMoney<0:
        print("0 이하의 금액은 사용할 수 없습니다.")
        continue
    money-=payMoney

#%% 2
while True:
    mark=int(input("이번 영화의 평점을 입력하세요 >>> "))
    if not(1<=mark<=5):
        print("평점은 1~5 사이만 입력할 수 있습니다.")
    else:
        print("평점 : "+"★"*mark)
        break

#%% 3
pw="qwerty"
answer=False
for i in range(5):
    pw_in=input("비밀번호를 입력하세요 >>> ")
    if pw_in==pw:
        answer=True
        break
if answer==True:
    print("비밀번호를 맞혔습니다")
else:
    print("비밀번호 입력 횟수를 초과했습니다.")

#%% 4
for i in range(2,10):
    if i%2==0:
        print()
        continue
    for j in range(1,10):
        print("%dx%d=%d" %(i,j,i*j))
        if j==i:
            break
