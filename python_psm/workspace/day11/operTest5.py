#%% (1) 퀴즈게임
# =============================================================================
# 다음 중 프로그래밍 언어가 아닌 것은?
# 1. JAVA
# 2. Python
# 3. C
# 4. 망둥어
# =============================================================================

qMsg="다음 중 프로그래밍 언어가 아닌 것은?"
choiceMsg="1.JAVA\n2.Python\n3.C\n4.망둥어\n"
choice=int(input(qMsg+"\n"+choiceMsg))
answer=4
result=(("정답!" if choice==answer else 
         "오답..." if 4>=choice>=1 else 
         "잘못 입력하셨습니다."))
print(result)
#%% (2) 혈액형별 성격
qMsg=(("당신의 혈액형은?\n"
       +"1.A형\n2.B형\n3.O형\n4.AB형"))
# print(qMsg)
choice=int(input(qMsg+"\n"))
answer_a="세심하고 거짓말을 잘 못한다."
answer_b="거침없고 추진력이 좋다."
answer_o="사교성이 좋다."
answer_ab="착하다."
errMsg="다시 입력해주세요."

result=((answer_a if choice==1 else
  answer_b if choice==2 else
  answer_o if choice==3 else
  answer_ab if choice==4 else errMsg
  ))
print(result)