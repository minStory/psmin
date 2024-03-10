# 예외처리
# 1.
# try-except문
# tty:
#       코드
# except:
#       코드
# 2.
# try:
#       코드
# except 발생오류 :
#       코드
# 3.
# try:
#       코드
# except 발생오류 as 오류변수:
#       코드
# 4.
# try finally문은 try문 수행 도중 예외 발생과 상관없이 항상 수행
# 

# 오류의 내용까지 알고 싶을 때 사용하는 방법
# 오류 변수 e에 담기는 오류메세지를 출력할 수 있다.

# class Car:
#     def stop(self):
#         raise No
# 꼭 작성해야 하는 부분이 구현되지 않을 경우 일부러 오류를 발생시키기 위해 사용

#%%
a=2
b=0
try:
    a=a//b
except Exception as e:
    print(1)
finally:
    print(2)

#%%
try:
    a=int(input("제수를 입력하세요 >>> "))
    b=int(input("피제수를 입력하세요 >>> "))
    print("{} / {} = {}".format(a,b,a//b))
except Exception as e:
    print("예외가 발생했습니다.")
# 오류가 없으면 except문은 수행되지 않는다.

#%%
try:
    a=[1,2]
    print(a[3])
    0/0
except (ZeroDivisionError,IndexError) as e:
    print("0으로 나눌 수 없다.")
# except IndexError as e:
#     print("Index") 
finally:
    print(1)

#%%
try:
    age=int(input("나이 입력 >>> "))
    raise   #강제 오류 발생
except:
    print("제대로 입력하세요.")
    # pass  #오류 회피
    
else:   #오류가 없을 때 실행
    if age<=19:
        print("미성년자 출입금지")
    else:
        print("환영합니다")
finally:    #무조건 실행
    print("종료")

#%%
class MyError(Exception):
    pass
    # def __str__(self):
    #     return "허용되지 않은 별명~~"

def say_nick(nick):
    if nick=="바보":
        raise MyError("NO")
    print(nick)

try:
    say_nick("천사")
    say_nick("바보")
except MyError as e:
    print(e)
    
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

#%%
class Human:
    """Super Class"""
    name="사람 이름"
    age="나이"
    city="사는 도시"
    
    def show(self):
        print("사람 클래스의 메소드입니다.")
        
class Std(Human):
    """Child Class"""
    def __init__(self,name):
            self.name=name
    def show_name(self):
        print("사람의 이름은 : "+self.name)
    def show_age(self):
        print("사람의 나이는 : "+self.age)
    def show(self):
        print("학생 클래스의 메소드입니다.")

a=Std("Park")
a.show()
a.show_name()
a.show_age()

#%% 문제1
inCar=[]
outCar=[]
temp=[]
n=int(input())
m=int(input())
for i in range(n):
    inOut=input()
    temp=inOut.split()
    inCar.append(int(temp[0]))
    outCar.append(int(temp[1]))
max=m
Sj=0
i=0
for i in range(n):
    if max<0:
        break
    max+=(inCar[i]-outCar[i])
    if max>Sj:
        Sj=max
result=m if m>Sj else Sj
print(0 if m<0 else result)

#%%
class Child:
    #클래스의 생성자 정의
    def __init__(self,Child_name,Child_height):
        self.name=Child.name
        self.height=Child.height
    
    #필요한 메소드 구현
    def getName(self):
        return self.name
    def getHeight(self):
        return self.height
    
    def growHeight(self,add):
        temp=self.height
        self.height+=add
        print("성장했습니다. {} --> {}".format(temp,self.height))

c=Child("이름",100)
c.growHeight(10)