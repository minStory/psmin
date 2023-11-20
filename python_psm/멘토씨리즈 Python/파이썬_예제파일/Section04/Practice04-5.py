kor = int(input('국어 점수를 입력하세요 >>> '))
eng = int(input('영어 점수를 입력하세요 >>> '))
mat = int(input('수학 점수를 입력하세요 >>> '))
avg = (kor + eng + mat) / 3
result = '합격' if avg >= 80 else '불합격'
print('평균은 {}점이고, 결과는 {}입니다.'.format(avg, result))
