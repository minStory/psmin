'''
def calculator(*args):
    return sum(args), sum(args)/len(args), max(args), min(args)

a, b, c, d = calculator(1, 2, 3, 4, 5)
print('합계', a)
print('평균', b)
print('최댓값', c)
print('최솟값', d)
'''

def calculator(*args):
    return sum(args), sum(args)/len(args), max(args), min(args)

result = calculator(1, 2, 3, 4, 5) # result는 4개의 반환값을 저장하는 튜플입니다.
print('합계', result[0])
print('평균', result[1])
print('최댓값', result[2])
print('최솟값', result[3])
