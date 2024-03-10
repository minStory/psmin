#%% test01
list_a=[1,2,3,4,5]
list_re=list(reversed(list_a))  #list_a를 뒤집어서 list_re에 대입
print("reversed")
print("list_re =",list_re)
# print(list(list_re))
list_a.reverse()    #list_a 자체를 뒤집기
print("list_a.reverse")
print("list_a =",list_a)
list_b=sorted(list_a)
print("sorted")
print("list_b =",list_b)
list_re.sort()
print("list_re.sort")
print("list_re =",list_re)
#%% 문제 1
str=list(input())
str_re=list(reversed(str))
if str==str_re:
    print(1)
else:
    print(0)
#%% Index 찾기
str=["요소A","요소B","요소C"]
print(str)
print(list(enumerate(str)))
for i,value in enumerate(str):
    print("{}번째 요소는 {}입니다.".format(i,value))

dict={"A":"A",2:"B",3:"C"}
print(dict)
for i,value in enumerate(dict):
    print("{}번째 요소는 {}입니다.".format(i,value))
print(dict.items())
for key,value in dict.items():
    print("{}번째 요소는 {}입니다.".format(key,value))
#%% 이터레이터
# arr=[]
# for i in range(0,20,2):
#     arr.append(i*i)
arr=[i*i for i in range(0,20,2)]
print(arr)
#%% 이터레이터 (제외)
arr=["사과","자두","망고","딸기에몽","체리","바나나","수박"]
output=[fruit for fruit in arr if fruit !="딸기에몽"]
print(output)
#%% test06
number=int(input())
if number%2==0:
    print("입력한 숫자는 {}입니다.\n{}는(은) 짝수입니다.".format(number,number))
else:
    print("입력한 숫자는 {}입니다.\n{}는(은) 홀수입니다.".format(number,number))
#%% 함수
def f(x):
    return x+1
print(f(5))
print(type(f(5)))

def print_n(str,n):
    for i in range(n):
        print(str)
print_n("안녕",10)
#%% 함수2
def introduce(name,age):
    print("내 이름은 {}이고, 나이는 {}살 입니다.".format(name,age))
    
introduce("james",25)

print("===가변 매개변수===")
def show(*args):
    for item in args:
        print(item)
show("python")
show("happy","birthday",1)

def print_n(n,*values):
    for i in range(n):
        for j in values:
            print(j)
        print()
print_n(3,"안녕","내이름은","파이썬","망고")

print("===디폴트 매개변수===")
def greet(name,message="안녕하세요"):
    print("{}님 {}".format(name,message))
greet("박성민")

def func(a,b):
    print(f"{a} * {b} = {a*b}")
func(4,5)
def func2():
    return "abcd"
a=func2()
print((a+"EF")*3)
#%% 묹제 2
def gugu(n):
    for i in range(9):
        print(n,"*",i+1,"=",n*(i+1))
gugu(5)
#%% 문제 3
def evenOrOdd(n):
    if n%2==0:
        print("짝수")
    else:
        print("홀수")
n=int(input())
evenOrOdd(n)
#%% 다중 반환
def cal(*args):
    return sum(args),sum(args)/len(args),max(args),min(args)
a,b,c,d,=cal(1,2,3,4,5)
print("합계",a)
print("평균",b)
print("최대값",c)
print("최소값",d)
#%% 커피자판기
def coffee_machine(money,pick):
    print("{}원에 {}를 선택하셨습니다.".format(money,pick))
    menu={
        "아메리카노":1000,
        "카페라떼":1500,
        "카푸치노":2000
    }
    if pick not in menu:
        print("{}는 판매하지 않습니다.".format(pick))
        return money, "없는 메뉴"
    elif menu[pick]>money:
        print("{}는 {}원입니다.".format(pick,menu[pick]))
        return money, "금액 부족"
    else:
        return money-menu[pick], pick

order=input("커피를 선택하세요. (아메리카노, 카페라떼, 카푸치노) >>> ")
pay=int(input("얼마를 내시나요? >>> "))

change,coffee=coffee_machine(pay,order)
print("잔돈 {}원, 커피 {}".format(change,coffee))
#%% 과제
