#%% 1
def print_n(x,y):
    for i in range(y):
        print(x)
print_n("안녕하세요",5)

#%% 2
def print_n(*args,n=3):
    for i in range(n):
        print(*args,sep='\n',end='\n\n')
print_n("안녕하세요","즐거운","수업이다",n=4)

#%% 3
print(chr(48))
print(chr(49))
print(chr(65))
print(chr(66))
print(chr(97))
print(chr(98))
print(ord('A'))
print(ord("한"))

#%% 4
print(eval("100+200"))
a=10
print(eval('a*5'))
print(eval('min(1,2,3)'))



#%%
class USB:
    def __init__(self,capacity):
        self.capacity=capacity
    def info(self):
        print("{}GB USB".format(self.capacity))
        
usb=USB(64)
usb.info()

#%%
class Service:
    def __init__(self,service):
        self.service=service
        print("{} Service가 시작되었습니다.".format(self.service))
    def __del__(self):
        print("{} Service가 종료되었습니다.".format(self.service))

s=Service("길 안내")
del s

#%%
class Bag:
    count=0
    def __init__(self):
        Bag.count+=1
    def sell(cls):
        cls.count-=1
    def remain_bag(cls):
        return cls.self
# print("현재 가방 : {}개".format(Bag.remain_bag()))
bag1=Bag()
bag2=Bag()
bag3=Bag()
print(Bag.count)
# print("현재 가방 : {}개".format(Bag.remain_bag()))
bag1.sell()
bag2.sell()
print(bag1.count)
print(bag2.count)
print(bag3.count)
print(Bag.count)
# print("현재 가방 : {}개".format(Bag.remain_bag()))

#%%
class Person:
    def __init__(self,name):
        self.name=name
    def eat(self,food):
        print(self.name+"가 "+food+"를 먹습니다.")

class Student(Person):
    def __init__(self,name,school):
        super().__init__(name)
        self.school=school
    def study(self):
        print(self.name+"는 "+self.school+"에서 공부를 합니다.")

potter=Student("해리포터","호그와트")
potter.eat("감자")
potter.study()

ss =Person("홍길동")
ss.eat("피자")

#%%
class Coffee:
    def __init__(self,bean):
        self.bean=bean
    def coffee_info(self):
        print("원두 : {}".format(self.bean))

class Espresso(Coffee):
    def __init__(self,bean,water):
        super().__init__(bean)
        self.water=water
    def espresso_info(self):
        super().coffee_info()
        print("물 : {}mL".format(self.water))

coffee=Espresso("콜롬비아",30)
coffee.espresso_info()

#%%
def f(n):
    if n<=3:
        return 1
    else:
        return f(n-1)+f(n-2)+f(n-3)
print(f(7))