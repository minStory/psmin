#%% test01
n=int(input())
print(n)
for i in range(n):
    a,b=map(int,input("").split())
    print("Case #{}:{}".format(i+1,a+b))
#%% test02
n=int(input())
for i in range(n//4):
    print("long ",end='')
print("int")
#%% test03
h,m=map(int,input().split())
cook=int(input())
if m+cook<60:
    m+=cook
    print(h,m)
else:
    h+=(m+cook)//60
    m=(m+cook)%60
    print(h%24,m)
#%% test04
h,m,s=map(int,input().split())
n=int(input())
p_h=n//60//60
print(p_h)
p_m=n//60%60
print(p_m)
p_s=n%60
print(p_s)
#%% 정방향
for i in range(5):
    for j in range(i+1):
        print("*",end='')
    print()
#%% 역방향
for i in range(5):
    for j in range(5-i,0,-1):
        print("*",end='')
    print()
#%% 마름모
for i in range(1,10):
    if i<=5:
        for j in range(5-i,0,-1):
            print(" ",end='')
        for j in range(i*2-1):
            print("*",end='')
    elif i>=5:
        for j in range(i-1-4):
            print(" ",end='')
        for j in range((9-i)*2+1,0,-1):
            print("*",end='')
    print()
#%% 모래시계
for i in range(7):
    if i<=3:
        for j in range(i):
            print(" ",end='')
        for j in range(7-i*2,0,-1):
            print("*",end='')
    elif i>=4:
        for j in range(7-i-1,0,-1):
            print(" ",end='')
        for j in range(i*2-5):
            print("*",end='')
    print()
#%% test
for i in range(1,5):
    for j in range(5-i,-4,-1):
        print(" ",end='')
    for j in range(i*2-1):
        print("*",end='')
    print()
for i in range(1,5):
    for j in range(5-i,0,-1):
        print(" ",end='')
    for j in range(i*2-1):
        print("*",end='')
    for j in range((5-i)*2-1,0,-1):
        print(" ",end='')
    for j in range(i*2-1):
        print("*",end='')
    print()
print(i)
#%% test
