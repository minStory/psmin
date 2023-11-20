#%% p13_1
nation=["그리스","아테네","독일","베를린","러시아","모스크바","미국","워싱턴"]
file=open('nation.txt',"wt")

for idx,country in enumerate(nation):
    if idx%2==0:
        file.write(nation[idx]+"-"+nation[idx+1]+"\n")
file.close()

#%% p13_2
info=["김나라","목포시","010-1111-1111",
      "이나라","서울시","011-2222-2222",
      "오나라","전주시","010-3333-3333",
      "정나라","속초시","011-4444-4444",
      "유나라","제주시","011-5555-5555"]
file=open("연락처.txt","wt")
for idx,tel in enumerate(info):
    file.write(info[idx]+" ")
    if idx%3==2:
        file.write("\n")
file.close()

old_file=open("연락처.txt","rt")
buffer=old_file.read()
n=buffer.count("011-")
buffer=buffer.replace("011-","010-")
print("총 {}건의 011 데이터를 찾았습니다.".format(n))
old_file.close()

new_file=open("연락처.txt","wt")
new_file.write(buffer)
print("데이터 수정 완료")
new_file.close()
