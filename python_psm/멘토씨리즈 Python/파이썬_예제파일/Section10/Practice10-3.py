student = '"김철수",85'
name = student.split(',')[0].strip('"')
age = student.split(',')[1]
print('이름은 {}이고, 점수는 {}점입니다.'.format(name, age))
