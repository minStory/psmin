#%% 1
score=int(input("점수를 입력하세요 >>> "))
if score>=90:
    grade="A"
elif score>=80:
    grade="B"
elif score>=70:
    grade="C"
elif score>=60:
    grade="D"
else:
    grade="F"
print("점수는 "+str(score)+"점이고, 학점은 "+str(grade)+"학점입니다.")

#%% 2
n=int(input("정수를 입력하세요 >>> "))
if n%3==0:
    print(str(n)+"은(는) 3의 배수입니다.")
else:
    print(str(n)+"은(는) 3의 배수가 아닙니다.")
    
#%% 3
a=int(input("정수1 입력 >>> "))
b=int(input("정수2 입력 >>> "))
c=int(input("정수3 입력 >>> "))
print("가장 큰 수는 "+str(a if a>b and a>c else b if b>c else c)+"입니다.")

#%% 4
carNum=input("차량번호를 입력하세요 >>> ")
if int(carNum[-2])%2==0:
    result="운행가능"
else:
    result="운행불가"
print("차량번호 "+carNum+"는 오늘 "+result+"입니다.")