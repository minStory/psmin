#%% 1
def vending_machine(money):
    global drink
    if money<0:
        return None
    else:
        print("음료수 = %d개, 잔돈 = %d원" %(drink,money))
        drink+=1
        money-=700
        return vending_machine(money)
drink=0
money=3000
print(vending_machine(money))

#%% 2
def get_avg(marks):
    total=sum(marks.values())//len(marks)
    return total
marks={"국어":90,"영어":80,"수학":85}
avg=float(get_avg(marks))
print("평균은 {}점입니다.".format(avg))

#%% 3
total=0
def gift(dic,who,money):
    global total
    dic[who]=money
    total+=money
wedding={}
gift(wedding,"영희",5)
gift(wedding,"철수",3)
gift(wedding,"이모",10)
print("축의금 명단 : {}".format(wedding))
print("전체 축의금 : {}".format(total))
