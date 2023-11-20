#%% format test
data=10
data2="%d" %100
print("data : %d" %data)
print(type(data2))
print(data2)

#%% format test2
# 문자열값.format()
# A.B : A안에 B
data1=10
data2=10.4231
data3='A'
data4="ABC"

print("data1 : {}".format(data1))
print("data1 : {}\ndata2 : {}".format(data1,data2))
print("data3 : %s" %data3)
print("data3 : %c" %data3)
print("data4 : {}".format(data4))

# 아스키 코드
print("data4 : %c" %65)
print("data4 : %c" %66)
print("data4 : %c" %67)
print("아스키코드 a : %c" %97)

#%% 자동 형변환
# // : 몫 연산자
print(10/3)
print(10//3)
print(10//3.0)

#%% 강제 형변환
print(float(10)//3)
