import random

class UpDown:

    def __init__(self):
        self.answer = random.randint(1, 100)
        self.count = 0

    def challenge(self):
        self.count += 1
        n = int(input('입력(1~100) >>> '))
        if n < 1 or n > 100:
            raise Exception('1~100 사이만 입력하세요.')
        return n

    def play(self):
        while True:
            try:
                n = self.challenge()
            except Exception as e:
                print(e)
            else:
                if self.answer < n:
                    print('Down!')
                elif self.answer > n:
                    print('Up!')
                else:
                    print('{}번만의 정답입니다.'.format(self.count))
                    break


game = UpDown()
game.play()
