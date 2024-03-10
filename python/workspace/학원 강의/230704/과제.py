#%% 과제
n=int(input())
while n>0:  #n번 반복
    order=input().split()   #문자열 입력
    if order[0]=="push":       #push 정수 입력
        list.append(order[1])  #정수 추가
    elif order[0]=="pop":         #pop 입력
        if len(list)!=0:          #정수가 있으면
            print(list.pop())     #맨 위 정수 출력 후 제거
        else:                     #정수가 없으면
            print(-1)             #-1 출력
    elif order[0]=="size":     #size 입력
        print(len(list))       #길이 출력
    elif order[0]=="empty":       #empty 입력
        if len(list)==0:          #비어있을 때
            print(1)              #1 출력
        else:                     #비어있지 않을 때
            print(0)              #0 출력
    elif order[0]=="top":                #top 입력
        if len(list)!=0:                 #정수가 있으면
            print(list[len(list)-1])     #맨 위 정수 출력
        else:                            #정수가 없으면
            print(-1)                    #-1 출력
    n-=1                #횟수 차감
#%% test
