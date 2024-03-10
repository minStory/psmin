#%% my exception
class NickNameError(Exception):
    pass

def checkNickName(name):
    if name=="바보":
        raise NickNameError
        
        
nickName=input("닉네임 : ")

try:
    checkNickName(nickName)
    print("닉네임 생성 성공!")
except NickNameError as e:
    print("비속어는 사용할 수 없습니다.")
    
#%% my exception task

# =============================================================================
# 외부에서 채팅 문자열을 받아와서 in으로 비속어 검사를 한다.
# 비속어는 바보, 멍청이, 똥개이다.
# 사용자 예외처리로 선언하여 만든다. 비속어가 없다면
# 채팅 메세지를 출력한다.
# =============================================================================

class ChatError(Exception):
    pass

chat=""
def checkChat(temp):
    badWordList=["바보","멍청","똥개"]
    for i in range(len(badWordList)):
        if badWordList[i] in temp:
            global chat
            chat=temp.replace(badWordList[i],"**")
            raise ChatError

cnt=0
while True:
    chat=input("채팅 입력[나가기:q] : ")
    if chat.lower()=="q":
        break
    
    try:
        checkChat(chat)
        print(chat)
    except ChatError as e:
        cnt+=1
        print("%d회 비속어를 사용하셨습니다." %cnt)
        print(chat)