#%% 가격 입력
price=int(input("가격 : "))
print("%d" %(price*0.9))

#%% 사칙 연산(산술 연산자)
#정수 2개를 입력받고 덧셈, 뺄셈, 곱셉, 나눗셈
num1=int(input("정수 1 : "))
num2=int(input("정수 2 : "))

addResult=num1+num2
subResult=num1-num2
multiResult=num1*num2
divResult=num1//num2
modResult=num1%num2

print("%d + %d = %d" %(num1,num2,addResult))
print("%d - %d = %d" %(num1,num2,subResult))
print("%d * %d = %d" %(num1,num2,multiResult))
print("%d // %d = %d" %(num1,num2,divResult))
print("%d %% %d = %d" %(num1,num2,modResult))

#%% 조건식
isOk=True
isOk=False
print(type(isOk))