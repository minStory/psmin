buffer_size = 1024  # 1024Byte로 1KB를 의미
with open('code.mp4', 'rb') as source:
    with open('code2.mp4', 'wb') as copy:
        while True:
            buffer = source.read(buffer_size)
            if not buffer:  # if buffer == '':
                break
            copy.write(buffer)
print('code2.mp4 파일이 복사되었습니다.')
