#%% test01
시가총액=2980000000000
현재가=50000
PER=15.79
print("시가총액 %d" %시가총액)
print("현재가 %d" %현재가)
print("PER %d" %PER)

#%% test02
s="hello"
t='python'
print(s,t,sep=" ! ")

#%% test03
a="123"
num_str="789"
num_str=int(num_str)
print(type(num_str))

#%% test04
year="2020"
year=int(year)
print(year-3,year-2,year-1)

#%% test06
letters="python"
print(letters[0])
print(letters[2])

#%% test07
num="24가 2210"
print(num[4:8])

#%% test08
a="홀짝홀짝홀짝"
print(a[::2])

#%% test09
a="PYTHON"
print(a[::-1])

#%% test10
num="010-1111-2222"
num2=num.split("-")
print(num2[0],num2[1],num2[2],sep='')
print(num.replace("-",""))

#%% test11
str="abcdef2a354a32a"
print(str.replace("a","A"))

#%% test12
name1="김민수"
age1=10
name2="이철수"
age2=13
print("이름 : %s, 나이 : %d" %(name1,age1))

#%% test13
str="btc_krw"
print(str.upper())
print(str.lower())

#%% test14,15
movieRank=["닥터 스트레인지","스플릿","럭키"]
movieRank.append("베트맨")
movieRank.insert(1,"슈퍼맨")
for i in movieRank:
    print(i)
    
#%% test16
print(int(input())+10)

#%% test17
for i in range(2002,2051,4):
    print(i)
    
#%% test18
hangle=["가","나","다","라"]
for i in range(len(hangle)-1):
    print(hangle[i],hangle[i+1],sep='')
    
#%% test19, test20
def print_coin():
    return ("비트코인"+"\n")*100
print(print_coin())