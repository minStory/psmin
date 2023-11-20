#%% test
list={1,3,5,7,9}
for i in range(2,10,1):
    for j in range(1,10,1):
        print("%d * %d = %d" %(i,j,i*j))
#%% test01
A,B=map(int,input("A,B 입력 >> ").split())
if A>B:
    print(">")
elif A<B:
    print("<")
else:
    print("==")
#%% test02
list=[2,4,5,3,1]
list.sort(reverse=True)
print(list)
print(list[0])
list.sort()
print(list)
print(list[0])
list2=sorted(list,reverse=True)
print(list2)
#%% test03
score=int(input("시험 점수 입력 >>> "))
if score>=90:
    print("A")
elif score>=80:
    print("B")
elif score>=70:
    print("C")
elif score>=60:
    print("D")
else:
    print("F")
#%% test04
h,m=map(int,input("시 분 입력 >>> ").split())
if m-45>=0:
    m-=45
else:
    h-=1
    m+=15
    if h<0:
        h+=24
print(h,m)
#%% test05
a,b,c=map(int,input("정수 3개 입력 >>> ").split())
if a==b==c:
    print(10000+a*1000)
elif a==b or a==c:
    print(1000+a*100)
elif b==c:
    print(1000+b*100)
else:
    print(max(a,b,c)*100)
    # print(a*100) if a>b and a>c else print(b*100) if b>a and b>c else print(c*100)
#%% test06
list_a=[1,2,3]
list_b=[4,5,6]
print(list_a[2])
# 출력
print("#리스트")
print("list_a",list_a)
print("list_b",list_b)
print()
# 기본연산자
print("#리스트 기본 연산자")
print("list_a + list_b",list_a+list_b)
print("list_a * 3 = ",list_a*3)
print()
# 함수
print("#길이 구하기")
print("len(list_a)",len(list_a))
print()
# 리스트 요소 추가
print("#뒤에 요소 추가하기 (append)")
list_a.append(4)
list_a.append(5)
print(list_a)
print()
print("#리스트 중간에 요소 추가하기 (insert)")
list_a.insert(0,10)
print(list_a)
print()
print("#요소 한번에 여러개 추가 (extend([]))")
list_a.extend([10,20,30])
print(list_a)
print()
print("#리스트 인덱스 요소 삭제 (del)")
del list_a[2]
print(list_a)
print()
print("#리스트 인덱스 요소 삭제 (pop)")
list_a.pop()
print(list_a)
print()
print("#요소 한번에 여러개 삭제 (del")
del list_a[3:6]
print(list_a)
del list_a[:3]
print(list_a)
print()
print("#리스트 값으로 요소 1개씩 삭제 (remove)")
list_c=[1,2,3,4,5,1,2,3,4,5]
list_c.remove(1)
print(list_c)
list_c.remove(1)
print(list_c)
print()
print("#리스트 요소 모두 제거 (clear)")
list_c.clear()
print(list_c)
print()
print("리스트 내부 요소 확인(T/F)")
print(2 in list_a)
print(20 not in list_a)
#%% test07
arr=[273,32,103,57,52]
# 리스트에 반복문 적용
for i in arr:
    print(i)
for i in "안녕하세요":
    print(i)
#%% test08
num=[273,103,5,32,65,9,72,800,99]
for i in num:
    if i%2==0:
        print("%d는 짝수입니다." %i)
    else:
        print("%d는 홀수입니다." %i)
print()
for i in num:
    temp=i
    cnt=0
    while temp>0:
        temp//=10
        cnt+=1
    print("{}는 {}자릿수입니다.".format(i,cnt))
#%% test09
n=int(input())
for i in range(n):
    for j in range(n-i-1):
        print(" ",end='')
    for j in range(-1,i):
        print("*",end='')
    print()