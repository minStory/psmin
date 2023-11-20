'''
def greet(message='안녕하세요'):
    print(message)

greet('반갑습니다')  # 반갑습니다
greet( )  # 안녕하세요
'''

'''
def greet(message='안녕하세요', name):
    print('{}님 {}'.format(name, message))

greet('김철수')  # 어떻게 해석될까요?

'''

def greet(name, message='안녕하세요'):
    print('{}님 {}'.format(name, message))

greet('김철수')
