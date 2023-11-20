#%% 문자 형변환
# print("%c" %65)
# print("%d" %'A')
# chr(정수) : 정수를 문자로
# ord(문자) : 문자를 정수로

print(chr(ord('A')*9))
pw="a1b2c3"
en_pw=""
de_pw=""

for i in pw :
    en_pw+=chr(ord(i)*9)
    
print("기존 비밀번호 : %s" %pw)
print("암호화된 비밀번호 : {pw}".format(pw=en_pw))
print(pw)

for i in en_pw:
    de_pw+=chr(ord(i)//9)
    
print("암호화된 비밀번호 : {en_pw}\n복호화된 비밀번호 : {de_pw}".format(en_pw=en_pw,de_pw=de_pw))

# 아스키코드를 통해서 암호화를 할 수 있다.
# 회원가입 시 사용자의 비밀번호 혹은 개인정보를 암호화할 때
# 아스키코드를 사용한다.