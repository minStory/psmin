-- 영화 정보 테이블
create table movie(
	no int primary key,				-- 영화 번호
    title varchar(500),				-- 제목
    genre varchar(50),				-- 장르
    screen_time int,				-- 상영 시간
    director varchar(50),			-- 감독
    actor varchar(50),				-- 주연
    limit_age int,					-- 제한 연령
    release_date date,				-- 개봉일
    poster varchar(2000),			-- 포스터 경로
    content varchar(2000)			-- 줄거리
);

 -- 공지사항 게시판 테이블
create table notice(
	no int primary key,				-- 공지사항 번호
    writer_no varchar(50),			-- 작성자(관리자) 이름
    writer_id varchar(50),			-- 작성자(관리자) ID
    title varchar(500),				-- 제목
    content varchar(2000),			-- 내용
    file varchar(2000),				-- 첨부 파일 경로
    created_date datetime,			-- 작성 일시
    updated_date datetime,			-- 수정 일시
    hit int							-- 조회수
);

-- 회원 정보 테이블
create table user(
	no int primary key,				-- 회원 번호
    id varchar(50),					-- ID
    pwd varchar(50),				-- 비밀번호
    name varchar(50),				-- 이름
    phone varchar(50),				-- 전화번호
    email varchar(50),				-- 이메일
    signup_date datetime			-- 가입일
);



-- 공지사항
insert into notice values(1, "A001", "admin01", "공지사항 example1", "안녕하세요. 공지사항1입니다.", null, now(), null, 0);
insert into notice values(2, "A002", "admin02", "공지사항 example2", "안녕하세요. 공지사항2입니다.", null, now(), null, 0);
insert into notice values(3, "A003", "admin03", "공지사항 example3", "안녕하세요. 공지사항3입니다.", null, now(), null, 0);
insert into notice values(4, "A004", "admin04", "공지사항 example4", "안녕하세요. 공지사항4입니다.", null, now(), null, 0);
insert into notice values(5, "A001", "admin01", "공지사항 example5", "안녕하세요. 공지사항5입니다.", null, now(), null, 0);
insert into notice values(6, "A002", "admin02", "공지사항 example6", "안녕하세요. 공지사항6입니다.", null, now(), null, 0);
insert into notice values(7, "A003", "admin03", "공지사항 example7", "안녕하세요. 공지사항7입니다.", null, now(), null, 0);
insert into notice values(8, "A004", "admin04", "공지사항 example8", "안녕하세요. 공지사항8입니다.", null, now(), null, 0);
insert into notice values(9, "A001", "admin01", "공지사항 example9", "안녕하세요. 공지사항9입니다.", null, now(), null, 0);
insert into notice values(10, "A002", "admin02", "공지사항 example10", "안녕하세요. 공지사항10입니다.", null, now(), null, 0);
insert into notice values(11, "A003", "admin03", "공지사항 example11", "안녕하세요. 공지사항11입니다.", null, now(), null, 0);

-- 현재상영작
insert into movie values("1","애비게일","호러","120","맷 베티넬리-올핀","알리샤 위어", 19,"2024-06-01","1/poster.png","101 영화 설명란입니다");
insert into movie values("2","챌린저스","로맨스, 코미디","123","루카 구아다니노","젠데이아", 15,"2024-06-01","2/poster.png","102 영화 설명란입니다");
insert into movie values("3","파묘","오컬트, 스릴러","130","장재현","최민식", 15,"2024-06-01","3/poster.png","103 영화 설명란입니다");
insert into movie values("4","쿵푸팬더4","애니메이션","116","마이클 미첼","잭 블랙", 0,"2024-06-01","4/poster.png","104 영화 설명란입니다");
insert into movie values("5","퓨리오사: 매드맥스 사가","아포칼립스","130","조지 밀러","안야 테일러조이", 15,"2024-06-01","5/poster.png","105 영화 설명란입니다");
insert into movie values("6","목소리의 형태","애니메이션","110","야마다 나오코","하야미 사오리", 0,"2024-06-01","6/poster.png","106 영화 설명란입니다");
insert into movie values("7","남은 인생 10년","로맨스, 드라마","120","후지이 미치히토","코마츠 나나", 12,"2024-06-01","7/poster.png","107 영화 설명란입니다");
insert into movie values("8","청춘 18X2 너에게로 이어지는 길","로맨스","132","후지이 미치히토","키요하라 카야", 12,"2024-06-01","8/poster.png","108 영화 설명란입니다");
insert into movie values("9","극장판 하이큐 쓰레기장의 결전","애니메이션","106","미츠나카 스스무","마츠시타 케이코", 0,"2024-06-01","9/poster.png","109 영화 설명란입니다");
insert into movie values("10","포켓몬스터: 성도지방 이야기, 최종장","애니메이션","102","유아마 쿠니히코","잠만보", 0,"2024-06-01","10/poster.png","110 영화 설명란입니다");
insert into movie values("11","가필드 더 무비","애니메이션","110","마이크 딘달","크리스 프랫", 0,"2024-06-01","11/poster.png","111 영화 설명란입니다");
insert into movie values("12","혹성탈출 새로운 시대","액션","118","웨스 볼","케빈 듀랜드", 12,"2024-06-01","12/poster.png","112 영화 설명란입니다");
insert into movie values("13","그녀가 죽었다","스릴러","115","김세휘","변요한", 15,"2024-06-01","13/poster.png","113 영화 설명란입니다");
insert into movie values("14","스텔라","히스토리, 드라마","123","킬리언 리드호퍼","폴라 비어", 15,"2024-06-01","14/poster.png","114 영화 설명란입니다");
insert into movie values("15","스턴트맨","액션, 코미디","120","데이비드 리치","라이언 고슬링", 15,"2024-06-01","15/poster.png","115 영화 설명란입니다");

-- 상영예정작
insert into movie values("16","설계자","스릴러","116","이요섭","강동원", 15,"2024-08-01","16/poster.png","116 영화 설명란입니다");
insert into movie values("17","나쁜 녀석들:라이드 오어다이","코미디","123","아딜 엘아르비","윌 스미스", 17,"2024-08-01","16/poster.png","117 영화 설명란입니다");
insert into movie values("18","찬란한 내일로","코미디, 드라마","130","난니 모레티","난니모레티", 12,"2024-08-01","18/poster.png","118 영화 설명란입니다");
insert into movie values("19","오늘부터 댄싱퀸","어린이, 드라마","92","오로라 고시","벨라", 0,"2024-08-01","19/poster.png","119 영화 설명란입니다");
insert into movie values("20","드림 시나리오","코미디, 호러","102","크리스토페르 보르글리","니콜라스 게이지", 15,"2024-08-01","20/poster.png","120 영화 설명란입니다");
insert into movie values("21","프렌치 수프","드라마, 히스토리","135","트란 안훙","쥘리에트 비노슈", 12,"2024-08-01","21/poster.png","121 영화 설명란입니다");
insert into movie values("22","인사이드 아웃2","애니메이션","96","켈시 만","에미 폴러", 0,"2024-08-01","22/poster.png","122 영화 설명란입니다");
insert into movie values("23","존 오브 인터레스트","히스토리,전쟁","105","조나단 글레이저","산드라 휠러", 12,"2024-08-01","23/poster.png","123 영화 설명란입니다");
insert into movie values("24","노 웨이 업","액션","106","클라우디오 파","소피 맥킨토시", 15,"2024-08-01","24/poster.png","124 영화 설명란입니다");
insert into movie values("25","퍼펙트 데이즈","드라마","118","빔 벤더스","야쿠쇼 코지", 12,"2024-08-01","25/poster.png","125 영화 설명란입니다");
insert into movie values("26","프리실라","드라마, 음악","110","소피아 코폴라","제이콥 엘로디", 15,"2024-08-01","26/poster.png","126 영화 설명란입니다");
insert into movie values("27","양치기","스릴러","118","손경원","손수현", 15,"2024-08-01","27/poster.png","127 영화 설명란입니다");
insert into movie values("28","언더 더 씨","애니메이션","71","에반 트라멜","에이프릴 로즈", 0,"2024-08-01","28/poster.png","128 영화 설명란입니다");
insert into movie values("29","아침이 오면 공허해진다","드라마","123","이시바시 유호","카라타 에리카", 12,"2024-08-01","29/poster.png","129 영화 설명란입니다");
insert into movie values("30","창가의 토토","애니메이션","80","야쿠와 신노스케","오구리 슌", 0,"2024-08-01","30/poster.png","130 영화 설명란입니다");

