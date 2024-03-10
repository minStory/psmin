#%% dict 테스트
중국집 = {"자장면" : 1500, "짬뽕" : 2500}
print(len(중국집))
print(중국집["자장면"])

if "자장면" in 중국집:
    중국집["자장면"]=4000
print(중국집)

if "탕수육" not in 중국집:
    중국집["탕수육"]=9000
print(중국집)

# del 중국집["짬뽕"]
# print(중국집)

for i in 중국집.keys():
    print(i)

for i in range(len(중국집)):
    print(str(i+1) + ". "+ list(중국집.keys())[i])

total=0
for i in 중국집.values():
    total+=i
    
avg=total/len(중국집)
print("평균 가격 : %.2f원" %avg)

#%% dict task
# 등급을 입력받아서 학점을 출력해주는 프로그램
# 2 입력 시 B학점입니다. 출력
# 1~5등급, A~F학점(E학점 X)
dict={}
grade=int(input("등급 : "))
for i in range(5):
    dict[i+1]=chr((i if i<4 else i+1)+65)

print(dict[grade]+"학점입니다.")
if grade==5:
    print("넌 소중해")

