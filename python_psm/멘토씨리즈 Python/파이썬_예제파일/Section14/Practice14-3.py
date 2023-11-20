import json

with open('cctv.json', 'r', encoding='utf-8') as jsonfile:
    buffer = jsonfile.read()
    cctv_list = json.loads(buffer)
    cctv_purpose = set()
    for place in cctv_list:
        cctv_purpose.add(place['설치목적구분'])

print(cctv_purpose)
