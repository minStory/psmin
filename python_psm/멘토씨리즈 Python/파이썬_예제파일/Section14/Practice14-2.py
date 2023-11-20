import csv

with open('cctv.csv', 'r') as csvfile:
    buffer = csv.reader(csvfile, delimiter=',', quotechar='"')
    totalcctv = 0
    for i, line in enumerate(buffer):
        if i != 0:
            totalcctv += int(line[4])

print('서울특별시 마포구에 설치된 CCTV는 총 {}대입니다.'.format(totalcctv))
