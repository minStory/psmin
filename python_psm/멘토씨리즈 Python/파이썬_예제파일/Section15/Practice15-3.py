class Song:

    def set_song(self, title, genre):
        self.title = title
        self.genre = genre

    def print_song(self):
        print('노래제목: {}({})'.format(self.title, self.genre))


class Singer:

    def set_singer(self, name):
        self.name = name

    def hit_song(self, song):
        self.song = song

    def print_singer(self):
        print('가수이름: {}'.format(self.name))
        self.song.print_song()


song = Song()
song.set_song('취중진담', '발라드')
singer = Singer()
singer.set_singer('김동률')
singer.hit_song(song)
singer.print_singer()
