while True:
    grade = int(input('이번 영화의 평점을 입력하세요 >>> '))
    if grade >= 1 and grade <= 5:
        print('평점: {}'.format('★' * grade))
        break
    else:
        print('평점은 1~5 사이만 입력할 수 있습니다.')
