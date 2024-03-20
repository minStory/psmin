-- upload 테이블 생성
/*
create table upload(
	upload_no number(7) primary key,          -- 자료실 글 번호.
	upload_writer varchar2(50) not null,      -- 자료실 글 작성자.
	upload_title varchar2(200) not null,      -- 자료실 글 제목.
	upload_cont varchar2(2000) not null,      -- 자료실 글 내용.
	upload_pwd varchar2(50) not null,         -- 자료실 글 비밀번호.
	upload_file varchar2(2000),               -- 자료실 파일명.
	upload_hit number(5) default 0,           -- 자료실 글 조회수.
	upload_date date,                         -- 자료실 글 작성일자.
	upload_update date                        -- 자료실 글 수정일자.
);

*/

CREATE TABLE upload (
    upload_no INT(7) PRIMARY KEY,           -- 자료실 글 번호.
    upload_writer VARCHAR(50) NOT NULL,     -- 자료실 글 작성자.
    upload_title VARCHAR(200) NOT NULL,     -- 자료실 글 제목.
    upload_cont VARCHAR(2000) NOT NULL,     -- 자료실 글 내용.
    upload_pwd VARCHAR(50) NOT NULL,        -- 자료실 글 비밀번호.
    upload_file VARCHAR(2000),              -- 자료실 파일명.
    upload_hit INT(5) DEFAULT 0,            -- 자료실 글 조회수.
    upload_date DATE,                       -- 자료실 글 작성일자.
    upload_update DATE                      -- 자료실 글 수정일자.
);