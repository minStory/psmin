while True:
    filename = input('복사할 파일명을 입력하세요 >>> ')
    extname = filename[filename.rfind('.') + 1:]
    if extname != 'txt':
        print('복사할 수 없는 파일입니다.')
    else:
        break

with open(filename, 'rt') as source:
    with open('복사본-' + filename, 'wt') as copy:
        while True:
            buffer = source.read(1)
            if not buffer:
                break
            copy.write(buffer)

print('복사본-' + filename + ' 파일이 생성되었습니다.')
