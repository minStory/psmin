#%% 1
rainbow=["red","orange","yellow","green","blue","navy","purple"]
for idx,element in enumerate(rainbow):
    print("무지개의 %d번째 색은 %s입니다." %(idx+1,element))

#%% 2
exam=[]
cnt=0
print("점수를 입력하세요. 더 이상 입력할 점수가 없으면 음수를 아무거나 입력하세요,")
while True:
    exam.append(int(input("점수 입력 >>> ")))
    if exam[cnt]<0:
        exam.pop()
        break
    cnt+=1
avg=sum(exam)//len(exam)
print("평균 =%.1f, 최대 = %d, 최소 = %d" %(avg,max(exam),min(exam)))