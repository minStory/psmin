#%% 1
pn=input("전화번호를 입력하세요 >>> ")
print(pn[pn.find("-")+1:pn.find("-",pn.find("-")+1)])
divPn=pn.split("-")
print(divPn[1])

#%% 2
bNum=input("사업자등록번호를 입력하세요(예: 123-45-67890) >>>")
divB=bNum.split("-")
tf=True
if len(bNum)!=12:
    tf=False
if not(bNum[3]=="-" and bNum[6]=="-"):
    tf=False
for i in divB:
    if i.isdecimal()==False:
        tf=False
if tf==True:
    print("올바른 형식입니다.")
else:
    print("올바른 형식이 아닙니다.")
    
#%% 3
nameAndScore=input("\"이름\",점수 입력 >>> ")
divInfo=nameAndScore.split(",")
divInfo[0]=divInfo[0].strip("\"")
print("이름은 "+divInfo[0]+"이고, 점수는 "+divInfo[1]+"점입니다.")