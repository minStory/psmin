#%% file test
#절대 경로 : 내 위치가 어디든 찾아갈 수 있는 경로
#상대 경로 : 내 위치에 따라 경로가 변경된다.
#   . : 현재 위치
#   .. : 이전 폴더
# name_file=open("names.txt",'a')
# name_file.write("박성민\n")
# name_file.close()

name_file=open("names.txt",'r')
for i in name_file.readlines():
    print(i,end='')