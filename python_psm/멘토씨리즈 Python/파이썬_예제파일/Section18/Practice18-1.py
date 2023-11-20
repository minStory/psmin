from bs4 import BeautifulSoup
import requests

url = 'https://movie.naver.com/movie/sdb/rank/rpeople.nhn'
response = requests.get(url)
html = response.text

soup = BeautifulSoup(html, 'html.parser')
result_list = soup.find_all('td', class_='title')
# result_list = soup.find_all('td', attrs={'class': 'title'})
movie_in = []
for result in result_list:
    movie_in.append(result.text.strip())
                    
for person in movie_in:
    print(person)
