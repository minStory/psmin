def search(self):
    print('=== 주소록 검색 ===')
    name = input('찾을 이름을 입력 >>> ')
    if not name:
        print('입력된 이름이 없어 검색을 취소합니다.')
        return
    exist = False
    for person in self.address_list:
        if name == person.name:
            person.info()
            exist = True
    if not exist:
        print('{}의 정보가 없습니다.'.format(name))
