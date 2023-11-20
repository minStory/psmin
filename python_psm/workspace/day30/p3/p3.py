#%% 1
a=float(input("첫 번째 실수를 입력하세요 >>> "))
b=float(input("두 번째 실수를 입력하세요 >>> "))
print(str(a)+"와 "+str(b)+"의 합은 "+str(a+b)+"입니다.")

#%% 2
month=int(input("1~12월 사이의 월을 입력하세요 >>> "))
dList=[31,28,31,30,31,30,31,31,30,31,30,31]
print(str(month)+"월은 "+str(dList[month-1])+"일까지 있습니다.")

#%% 3
english_dict={"flower":"꽃","fly":"날다","floor":"바닥"}
word=input("영어 단어를 입력하세요 >>> ")
print(word+" : "+english_dict[word])

#%% 4
a=input("희망하는 수학여행지를 입력하세요 >>> ")
b=input("희망하는 수학여행지를 입력하세요 >>> ")
c=input("희망하는 수학여행지를 입력하세요 >>> ")
tSet={a,b,c}
print("조사된 수학여행지는 "+str(tSet)+" 입니다.")
