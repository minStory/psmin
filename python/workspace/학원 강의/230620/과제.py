#%% 과제
qMsg="태어난 년도 입력 (종료 -1) >>> "
result=""
while True:
        birth=int(input(qMsg))
        if birth==-1:
            result="종료합니다."
            break;
        elif birth<0 or birth>2023:
            result="잘못 입력하셨습니다."
        elif birth%12==0:
            result="원숭이띠 입니다."
        elif birth%12==1:
            result="닭띠 입니다."
        elif birth%12==2:
            result="개띠 입니다."
        elif birth%12==3:
            result="돼지띠 입니다."
        elif birth%12==4:
            result="쥐띠 입니다."
        elif birth%12==5:
            result="소띠 입니다."
        elif birth%12==6:
            result="범띠 입니다."
        elif birth%12==7:
            result="토끼띠 입니다."
        elif birth%12==8:
            result="용띠 입니다."
        elif birth%12==9:
            result="뱀띠 입니다."
        elif birth%12==10:
            result="말띠 입니다."
        elif birth%12==11:
            result="양띠 입니다."
        print(result)