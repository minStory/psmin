emp_no = int(input('4자리 사원번호를 입력하세요 >>> '))
emp_last_no = emp_no % 10
is_am = emp_last_no >= 5
print('근무 시간은 {}입니다.'.format('오전' if is_am else '오후'))
