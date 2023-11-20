a_list = ['above', 'cookie', 'app', 'about', 'admin', 'bisket', 'apple', 'april']
for i, item in enumerate(a_list):
    if item.find('a') == -1:
        print('{} 제거됩니다.'.format(a_list.pop(i)))

print(a_list)
