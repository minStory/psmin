#%% if test
n1Msg="첫번째 정수 : "
n2Msg="두번째 정수 : "

num1=int(input(n1Msg))
num2=int(input(n2Msg))

if num1>num2:
    print("큰 값 : "+str(num1))
elif num2>num1:
    print("큰 값 : "+str(num2))
else:
    print("두 수가 같습니다.")

#%% if task
# =============================================================================
# 혈액형별 성격 프로그램을 if문으로 수정
# =============================================================================
qMsg=("당신의 혈액형은?\n"
      +"1.A형\n2.B형\n3.O형\n4.AB형\n")

choice=int(input(qMsg))
answer_a="세심하고 거짓말을 잘 못한다."
answer_b="거침없고 추진력이 좋다."
answer_o="사교성이 좋다."
answer_ab="착하다."
errMsg="다시 입력해주세요."
result=""

if choice==1:
    result=answer_a
elif choice==2:
    result=answer_b
elif choice==3:
    result=answer_o
elif choice==4:
    result=answer_ab
else:
    result=errMsg

print(result)   #일괄처리