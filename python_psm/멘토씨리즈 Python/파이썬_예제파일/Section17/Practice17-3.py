class BankError(Exception):

    def __init__(self, message):
        super().__init__(message)


class BankAccount:

    def __init__(self, acc_no, balance):
        self.acc_no = acc_no
        self.balance = balance

    def deposit(self, money):
        if money <= 0:
            raise BankError('{}원 입금 불가'.format(money))
        self.balance += money

    def withdraw(self, money):
        if money <= 0:
            raise BankError('{}원 출금 불가'.format(money))
        if money > self.balance:
            raise BankError('잔액 부족')
        self.balance -= money
        return money

    def transfer(self, your_acc, money):
        your_acc.deposit(self.withdraw(money))

    def inquiry(self):
        print('계좌번호: {}'.format(self.acc_no))
        print('통장잔액: {}원'.format(self.balance))
        

me = BankAccount('012-34-56789', 50000)
you = BankAccount('987-65-43210', 50000)

try:
    me.transfer(you, 5000)
except BankError as e:
    print(e)
finally:
    me.inquiry()
    you.inquiry()
