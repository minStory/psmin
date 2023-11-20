#%% test1
t1=(1,2,3)
t2=1,2,3
t3=tuple([100,3.14,"hello"])
t4=(100)
t5=(100,)
print("t1 : {}".format(t1),type(t1))
print("t2 : {}".format(t2),type(t2))
print("t3 : {}".format(t3),type(t3))
print("t4 : {}".format(t4),type(t4)) # tuple X
print("t5 : {}".format(t5),type(t5))
#%% test2
print('Hello \'World\'')
print("Hello \"World\"")
print('*\n**\n***')
print('이름\t연락처')
print("제시카\t02-123-4567")
print("마틴\t010-8765-1234")
#%% test3
print("재미있는","파이썬")
print("Python","Java","C",sep=",")
print()
print("영화 타이타닉")
print("평점",end=' : ')
print("5",end="점")
#%% test4
print("%d" %10)
print("%o" %10)
print("%x" %10)
print("%f" %3.14)
print("%s" %"Python")
print("%d %d" %(10,20))
print("%c" %65)
print("%c" %"A")
#%% test5
name,height,weight="Kai",120.5,23.55
year,month,day=2014,8,25
print("내 이름은 %s입니다." %name)
print("내 키는 %fcm입니다." %height)
print("내 몸무게는 %.1fkg입니다." %weight)
print("내 생일은 %d년 %d월 %d일입니다." %(year,month,day))
#%% test6
name=input("이름 입력 >>> ")
age=input("나이 입력 >>> ")
city=input("지역 입력 >>> ")
print("이름은 {}이고, 나이는 {}이고, 사는 곳은 {}이다.".format(name,age,city))
