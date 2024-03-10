#%% 1
n=int(input("10~99 사이의 정수를 입력하세요 >>> "))
print("십의 자리 : "+str(n//10))
print("일의 자리 : "+str(n%10))

#%% 2
time=int(input("초를 입력하세요 >>> "))
h=time//60//60
m=time//60%60
s=time%60
print("변환 결과는 "+str(h)+"시간 "+str(m)+"분 "+str(s)+"초입니다.")

#%% 3
sNum=int(input("4자리 사원번호를 입력하세요 >>> "))
if sNum%10>=5:
    result="오전"
else:
    result="오후"
print("근무 시간은 "+result+"입니다.")

#%% 4
n=int(input('''한 박스에 20개의 라면을 담을 수 있습니다.
            라면의 개수를 입력하시면 필요한 박스 수를 알려드립니다.
            라면의 개수를 입력하세요 >>> '''))
print(str(n)+"개 라면을 담으려면 "
      +str((n//20) if n%20==0 else (n//20)+1)+"박스가 필요합니다.")

#%% 5
kor=int(input("국어 점수를 입력하세요 >>> "))
eng=int(input("영어 점수를 입력하세요 >>> "))
math=int(input("수학 점수를 입력하세요 >>> "))
avg=(kor+eng+math)/3
if avg>=80:
    result="합격"
else:
    result="불합격"
print("평균은 "+str(avg)+"이고, 결과는 "+result+"입니다.")