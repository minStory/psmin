no = input('사업자등록번호를 입력하세요(예: 123-45-67890) >>> ')

condition1 = (no.find('-') == 3)
condition2 = (no.find('-', 4) == 6)
condition3 = (len(no) == 12)
condition4 = (no.replace('-', '').isdecimal())
if condition1 and condition2 and condition3 and condition4:
    print('올바른 형식입니다.')
else:
    print('올바른 형식이 아닙니다.')
