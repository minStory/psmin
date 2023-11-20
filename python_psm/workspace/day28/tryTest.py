#%% exception test
try:
    int(input("정수 입력 : "))
except Exception as e:
    print("정수만 입력하세요.")
    
print("반드시 실행되어야 할 문장")

#%% test
try:
        print(10/0)
except ZeroDivisionError as e:
    # print(e.__str__())
    print("0으로 나눌 수 없습니다.")