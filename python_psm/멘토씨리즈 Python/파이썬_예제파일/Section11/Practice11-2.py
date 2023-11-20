def get_average(marks):
    total = 0   
    for subject in marks:
        total += marks[subject]
    average = total / len(marks)
    return average

marks = {'국어': 90, '영어': 80, '수학': 85}
average = get_average(marks)
print('평균은 {}점입니다.'.format(average))
