#%% test
who="you"
how="happy"
f"{who} make me {how}"
age=25
f"내년엔 {age+1}살이 됩니다."
#%% test01
# int type
year=int(input("불기 연도 입력 : "))
# str type
year2=input()
print("서기 연도 : %d" %(year-543))
print("서기 연도 : {}".format(year-543))
print(year)
print(type(year))
print(type(year2))
#%% test02
A,B=input().split()
print(type(A),type(B))
print(A,B)
print(int(A)*int(B))
A,B=map(int,input("정수 A,B 입력").split())
print(type(A),type(B))
print(A*B)
#%% test03
if False:
    print("False출력")
if True:{
    print("True출력")}
#%% test04
number=int(input("정수입력 >>> "))
# 양수 조건
if number>0:
    print("양수입니다.")
# 음수 조건
elif number<0:
    print("음수입니다.")
# 0일때
else :
    print("0입니다.")
#%% test05
# 날짜/시간과 관련된 기능 가져오기
import datetime
# 현재 날짜/시간 구하기
now=datetime.datetime.now()
# 출력하기
print("{}".format(now.year),end="년")
print("{}".format(now.month),end="월")
print("{}".format(now.day),end="일 ")
print(now.hour,end="시")
print(now.minute,end="분")
print(now.second,end="초")
#%% test06
now=datetime.datetime.now()
if now.hour<12:
    print("현재 오전 {}시 입니다.".format(now.hour))
else :
    print("현재 오후 {}시 입니다.".format(now.hour))
#%% test07
now=datetime.datetime.now()
if now.month>=3 and now.month<=5:
    print("봄")
elif now.month>=6 and now.month<=8:
    print("여름")
elif now.month>=9 and now.month<=11:
    print("가을")
else :
    print("겨울")
#%% test08
age=int(input("나이 입력 >>> "))
if age>=20:
    print("성인")
else :
    print("미성년자")
#%% test09
age=int(input("몇살입니까? >>> "))
if age<=7:
    print("미취학")
elif age<=13:
    print("초등학생")
elif age<=16:
    print("중학생")
elif age<=19:
    print("고등학생")
else:
    print("성인")
#%% test10
str="안녕하세요"
print(str)
print(str[0:5:2])
print(str[::-1])
print(type(str[0]))
num=[1,2,3,4,5,6]
print(num[1:5:2])
print(num[::-1])
print(type(num[0]))
list=["hello",1,2,3]
print(type(list[3]))
print(len(list))
#%% test11
f=float(input("실수 입력 >>> "))
if f>=4.5:
    print("신")
elif f>=4.2:
    print("교수님 사랑")
elif f>=3.5:
    print("현 체제의 수호자")
elif f>=2.8:
    print("일반인")
elif f>=2.3:
    print("일탈을 꿈꾸는 소시민")
elif f>=1.75:
    print("오락문화의 선구자")
elif f>=1.0:
    print("불가촉천민")
elif f>=0.5:
    print("자벌레")
elif f>=0.0:
    print("플랑크톤")
else:
    print("시대를 앞서가는 혁명의 씨앗")
#%% test12
str="hello"
for i in reversed(str):
    print(i,end=' ')
#%% test13
n=1
while n<=100:
    print(n)
    n*=2
#%% test14
list_a=[1,2,3,4]    #숫자만으로 구성된 리스트
list_b=["안","녕","하"] #문자열로만 구성된 리스트
list_c=[234,32,50,"강아지",True] #여러자료형으로 구성된 리스트
list_a[0]=100   #리스트 Index로 접근하여 값 변경
print(list_a)
print(list_b)
print(list_c)
print(len(list_b))
str="Hello World"