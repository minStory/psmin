#%% p14_1
# fileName=""

# while True:
#     fileName=input("복사할 파일명을 입력하세요 >>> ")
#     extName=fileName[fileName.rfind(".")+1:]
    
#     if extName!="txt":
#         print("복사할 수 없는 파일입니다.")
#     else:
#         break

# with open(fileName, "rt",encoding='utf-8') as source:
#     with open("복사본-"+fileName,"wt") as copy:
#         while True:
#             buffer=source.read(1)
#             if not buffer:
#                 break
#             copy.write(buffer)
            
# print("복사본-"+fileName+"파일이 생성되었습니다.")

#%% p14_2
# import csv

# with open('cctv.csv','r') as csvfile:
#     buffer=csv.reader(csvfile, delimiter=",",quotechar='"')
#     total=0
#     for idx,value in enumerate(buffer):
#         if idx!=0:
#             print(value)
#             total += int(value[4])
# print("CCTV는 총 {}대입니다.".format(total))

#%% p14_3
import json

with open("cctv.json","r",encoding="utf-8") as jsonfile:
    buffer=jsonfile.read()
    cctv_list=json.loads(buffer)
    cctv_purpose=set()
    for place in cctv_list:
        cctv_purpose.add(place["설치목적구분"])
        
print(cctv_purpose)
