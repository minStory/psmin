#%%
class NameError(Exception):
    
    def __init__(self,message):
        super().__init__(message)
    
    
try:
    name=input("이름을 입력하세요 >>> ")
    if len(name)<2 or len(name)>6:
        raise NameError("이름은 2~6자 사이로 입력해 주세요.")
except NameError as e:
    print(e)
else:
    print("입력된 이름은 {}입니다.".format(name))
    
#%% p17_1
# class NameError(Exception):
#     def __init__(self,message):
#         super().__init__(message)

class Quiz:
    answer=["경기도","강원도","충청남도","충청북도","전라남도","전라북도","경상남도","경상북도","제주특별자치도"]
    
    @classmethod
    def challenge(cls):
        choice=input("정답은? >>> ")
        if choice in cls.answer:
            print("정답입니다.")
            cls.answer.remove(choice)
            if len(cls.answer)==0:
                print("모든 도를 맞혔습니다. 성공입니다.")
            else:
                cls.challenge()
        else:
            raise Exception("틀렸습니다.")
try:
    print("우리나라의 9개 모든 도를 맞히는 퀴즈입니다. 하나씩 대답하세요.")
    Quiz.challenge()
except Exception as e:
    print(e)

#%% p17_2
import random as r
class UpDown:
    
    def __init__(self):
        self.cnt=0
        self.answer=0
        self.answer=r.randint(1,100)
        # print(self.answer)
    
    def challenge(self):
        do=int(input("입력(1~100) >>> "))
        self.cnt+=1
        if do<1 or do>100:
            raise Exception("1~100 사이만 입력하세요.")
        return do
        
    def play(self):
        while True:
            try:
               do = self.challenge()
            except Exception as e:
                print(e)
            else:
                if self.answer>do:
                    print("Up!")
                elif self.answer<do:
                    print("Down!")
                else:
                    print("{}번만의 정답입니다.".format(self.cnt))
                    return
        
game=UpDown()
game.play()

#%% p17_3
class BankAccount:
    
    def __init__(self,acc_no,balance):
        self.acc_no=acc_no
        self.balance=balance
    
    def deposit(self,money):
        if money<=0:
            raise Exception("{}원 입금 불가".format(money))
        self.balance+=money
    
    def withdraw(self,money):
        if money<=0 or money>self.balance:
            raise Exception("{}원 출금 불가".format(money))
        self.balance-=money
        # return self.balance
    
    def transfer(self,your_acc,money):
        self.balance-=money
        your_acc.balance+=money
    
    def inquiry(self):
        print("계좌번호 : {}".format(self.acc_no))
        print("통장 잔액 : {}원".format(self.balance))
        
me=BankAccount("012-34-56789",50000)
you=BankAccount("987-65-43210",50000)
try:
    while True:
        do=int(input("실행할 작업\n1.입금\n2.출금\n3.이체\n4.조회\n5.종료\n"))
        if do==1:
            money=int(input("입금할 금액 입력 >>> "))
            me.deposit(money)
        elif do==2:
            money=int(input("출금할 금액 입력 >>> "))
            me.withdraw(money)
        elif do==3:
            your_acc=input("이체할 사람 입력 >>> ")
            money=int(input("이체할 금액 입력 >>> "))
            me.transfer(your_acc,money)
        elif do==4:
            me.inquiry()
            you.inquiry()
        elif do==5:
            break;
        
except Exception as e:
    print(e)
finally:
    me.inquiry()
    you.inquiry()
