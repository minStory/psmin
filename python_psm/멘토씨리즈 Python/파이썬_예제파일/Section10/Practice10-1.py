# 첫 번째 풀이입니다. (index() 메소드와 슬라이싱 활용)
phone = input('전화번호를 입력하세요 >>> ')
start = phone.index('-') + 1
end = phone.index('-', start)
code = phone[start:end]
print(code)


# 두 번째 풀이입니다. (split() 메소드 활용)
phone = input('전화번호를 입력하세요 >>> ')
code = phone.split('-')[1]
print(code)
