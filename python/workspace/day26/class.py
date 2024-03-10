#%% (1) class test
class A:
    data=10
    
    def printData(self):
        print(self)
        print(self.data)
    
    def intro():
        print("난 A 클래스이다.")

obj1=A()
obj2=A()

obj1.data=20
print(obj1)
obj1.printData()
print(obj2)
obj2.printData()

A.intro()
print(A.data)
#%% (2) class test
class Car:
    # 여러 메소드에서 공유할 변수 선언
    # brand=""
    # color=""
    # price=0
    
    # 생성자는 외부에서 전달받은 값으로
    # 해당 필드의 객체에 알맞게 초기화하는 목적이 있다.
    def __init__(self,brand="",color="",price=0):
        # 초기화 목적
        # 해당 필드의 객체에 전달받은 값들을 각각 초기화한다.
        self.brand=brand
        self.color=color
        self.price=price
    
    def engineStart(self):
        print(self.brand+" 시동 킴")
    def engineStop(self):
        print(self.brand+" 시동 끔")
        
momCar=Car("Benz","Yellow",35000)
dadyCar=Car("BMW","Pink")
myCar=Car("제네시스")

# momCar.brand="Benz"
# momCar.color="Yellow"
# momCar.price=35000

momCar.engineStart()
dadyCar.engineStop()
myCar.engineStart()