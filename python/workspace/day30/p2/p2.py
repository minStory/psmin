#%% 1
student="31025"
print("{} 학년 {} 반 {} 번".format(student[0],student[1:3],student[3:]))
#%% 2
carNum1="서울2가1234"
carNum2="10가1234"
carNum3="288가1234"
print("{}의 차량번호 4자리는 {}입니다.".format(carNum1,carNum1[-4:]))
print("{}의 차량번호 4자리는 {}입니다.".format(carNum2,carNum2[-4:]))
print("{}의 차량번호 4자리는 {}입니다.".format(carNum3,carNum3[-4:]))
#%% 3
s="maple"
print("{}의 가운데 글자는 {}입니다.".format(s,s[len(s)//2]))
#%% 4
list=[10,20,30,40,50,60,70,80,90,100]
list2=list[2:7]
print("3번째 요소부터 7번째 요소 = {}".format(list2))
print("3번째 요소부터 7번째 요소 중 2번째 요소 = {}".format(list2[1]))
#%% 5
dict={"금요일":"탕수육","토요일":"유산슬","일요일":"팔보채"}
for i in dict.keys():
    print(i,dict[i],sep=' : ')