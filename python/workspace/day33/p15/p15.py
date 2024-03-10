#%% p15_1
class Book:
    def set_info(self,a,b):
        self.a=a
        self.b=b
        book_list.append([a,b])
    def print_info(self):
        print("책 제목 : "+self.a)
        print("책 저자 : "+self.b)

book1=Book()
book2=Book()

book_list=[]
book1.set_info("파이썬","민경태")
book2.set_info("어린왕자","생텍쥐페리")

book1.print_info()
book2.print_info()
# print(book_list)
# print(book_list[0])

#%% p15_2
class Watch:
    def set_times(self,hour,minute,second):
        self.hour=hour
        self.minute=minute
        self.second=second
    def add_hour(self,h):
        # global hour
        self.hour=(self.hour+h)%24
    def add_minute(self,m):
        # global hour, minute
        self.hour=(self.hour+((self.minute+m)//60))%24
        self.minute=(self.minute+m)%60
    def add_second(self,s):
        # global hour, minute, second
        self.hour=(self.hour+(self.second+s)//60//60)%24
        self.minute=(self.minute+(self.second+s)//60)%60
        self.second=(self.second+s)%60
        
hour,minute,second=map(int,input("시간을 입력하세요 >>> ").split(":"))
h=int(input("계산할 시간을 입력하세요 >>> "))
m=int(input("계산할 분을 입력하세요 >>> "))
s=int(input("계산할 초를 입력하세요 >>> "))

w=Watch()
w.set_times(hour,minute,second)
w.add_hour(h)
w.add_minute(m)
w.add_second(s)
print("계산된 시간은 %d시 %d분 %d초입니다." %(w.hour,w.minute,w.second))

#%% p15_3
class Song:
    def set_song(self,title,genre):
        self.title=title
        self.genre=genre
    def print_song(self):
        print("노래 제목 : {}({})".format(self.title,self.genre))
        
class Singer(Song):
    def set_singer(self,singer):
        self.singer=singer
    def hit_song(self,song):
        self.song=song
    def print_singer(self):
        print("가수 이름 : {}".format(self.singer))
        self.song.print_song()

song=Song()
song.set_song("취중진담","발라드")
singer=Singer()
singer.set_singer("김동률")
singer.hit_song(song)
singer.print_singer()

