create table board(
	board_no INT(7) primary key,		-- 글번호
	board_writer varchar(50) not null,	-- 작성자
	board_title varchar(200) not null,	-- 글제목
	board_cont varchar(2000),			-- 글내용
	board_pwd varchar(50) not null,		-- 작성자 비밀번호
	board_hit INT(5) default 0,			-- 클릭수
	board_date DATE,					-- 작성일
	board_update DATE					-- 수정일
);

-- board 테이블에 게시글을 추가해 보자.
insert into board values(1, '홍길동','제목1', '길동이 입니다.', '1111', default, current_date(), null);
INSERT INTO board VALUES(2, '이순신', '이장군', '장군님 글입니다.', '2222', DEFAULT, CURRENT_DATE(), NULL);
INSERT INTO board VALUES(3, '유관순', '대한독립만세', '유관순 열사 글입니다.', '3333', DEFAULT, CURRENT_DATE(), NULL);
INSERT INTO board VALUES(4, '김유신', '제목4', '화랑 김유신입니다.', '4444', DEFAULT, CURRENT_DATE(), NULL);
INSERT INTO board VALUES(5, '김연아', '연아', '김연아 글입니다.', '5555', DEFAULT, CURRENT_DATE(), NULL);

commit;