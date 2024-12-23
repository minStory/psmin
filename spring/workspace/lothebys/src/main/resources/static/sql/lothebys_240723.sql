-- 회사 정보 테이블
create table company(
	no varchar(50),									-- 사업자 번호
	name varchar(50),								-- 회사 이름
	ceo varchar(50), 								-- 회사 대표
	addr varchar(50),								-- 회사 주소
	phone varchar(50)								-- 회사 전화번호
);

-- 관리자 정보 테이블
create table admin(
    no int primary key,                 			-- 관리자번호
    id varchar(50),               					-- id
    pwd varchar(50),                         		-- 비밀번호
    name varchar(50),                  				-- 성명
    job varchar(50),                         		-- 직책
    phone varchar(50)                     			-- 전화번호
);

-- 회원 정보 테이블
create table user(
    no int primary key,                   			-- 회원번호
    id varchar(50),                					-- id
    pwd varchar(50),                        		-- 비밀번호
    name varchar(50),                     			-- 성명
    phone varchar(50),                     			-- 전화번호
    email varchar(50),           					-- 이메일
    addr varchar(50), 								-- 주소
    regdate datetime              					-- 가입일
);

-- 제품 total brand 테이블 생성
create table brand(
	no int primary key,								-- 브랜드 고유번호
    name varchar(50),								-- 브랜드 이름
    regdate date									-- 등록 날짜 기본값을 현재 날짜로 설정
);

-- 쥬얼리 업로드 테이블
create table jewelry_upload(
	no varchar(50) primary key,						-- 쥬얼리 고유 번호(J...)JWLc01(까르디에),JWLv01(반클립프), JWLt01(티파니엔코), JWLb01(불가리)
    seller_no int,									-- 판매자 번호
	type varchar(50),								-- 악세사리 타입
    material varchar(50),							-- 악세사리 재질
    price decimal(10, 2),							-- 악세사리 가격
    karat int,										-- 악세사리 캐럿	
    brand_no int,									-- 악세사리 브랜드 번호
    -- 보석
	image_no int,									-- 이미지 고유 번호
    regdate date									-- 등록 날짜 기본값을 현재 날짜로 설정
);

-- 시계 업로드 테이블
create table watch_upload(
	no varchar(50) primary key,						-- 시계 고유 번호(W...)WATR01
    seller_no int,									-- 판매자 번호
    movement_type varchar(50),                      -- 시계 작동방식 (automatic,quartz(전자시계)
    case_size int,                                  -- 시계 케이스 사이즈
    band_material varchar(50),                      -- 시계 밴드 재질
    price decimal(10, 2),                           -- 시계 가격
    is_box boolean,                          		-- 시계 상자 여부
    is_paper boolean,                               -- 시계 보증서 여부
    brand_no int,		                            -- 시계 브랜드
	image_no int,									-- 이미지 고유 번호
    regdate date									-- 등록 날짜 기본값을 현재 날짜로 설정
);

-- 인테리어 업로드 테이블
create table interior_upload(
	no varchar(50) primary key,						-- 인테리어 고유 번호(I...)
    seller_no int,									-- 판매자 번호
    art_size int,									-- 작품 사이즈
    material varchar(50),							-- 작품 재질(paper, ..)
    price decimal(10, 2),							-- 작품 가격
    decorative_style varchar(50),					-- 작품 장식스타일(wall(벽화), Chaises & Daybeds(의자 및 데이베드), Pillows(베개),)
    artist varchar(50),								-- 작품 작가
    country varchar(50),							-- 작품 원산지
	image_no int,									-- 이미지 고유 번호
    regdate date									-- 등록 날짜 기본값을 현재 날짜로 설정
);

-- 이미지 테이블
create table image(
	no int primary key,								-- 이미지 고유 번호
	image1 varchar(255),							-- 이미지1
    image2 varchar(255),							-- 이미지2
    image3 varchar(255)								-- 이미지3
);
-- 제품 최종 등록 테이블
create table product(
	no varchar(50) primary key,						-- 제퓸 고유 번호
    admin_no int,									-- 승인한 관리자 번호
    brand_no int,									-- 브랜드 번호
    price decimal(10, 2),							-- 제품 가격
	type varchar(50),								-- 악세사리 타입
    material varchar(50),							-- 악세사리 재질, 작품 재질(paper, ..)
    band_material varchar(50),						-- 시계 밴드 재질
    karat int,										-- 악세사리 캐럿
	movement_type varchar(50),                      -- 시계 작동방식 (automatic,quartz(전자시계)
    case_size int,                                  -- 시계 케이스 사이즈
    is_box boolean,                          		-- 시계 상자 여부
    is_paper boolean,                               -- 시계 보증서 여부
	art_size int,									-- 작품 사이즈
    decorative_style varchar(50),					-- 작품 장식스타일(wall(벽화), Chaises & Daybeds(의자 및 데이베드), Pillows(베개),)
    artist varchar(50),								-- 작품 작가
    country varchar(50),							-- 작품 원산지
    conditions varchar(50),							-- 제품 상태
	image_no int,									-- 이미지 고유 번호
    regdate date,									-- 등록 날짜 기본값을 현재 날짜로 설정
    is_transaction boolean							-- 거래 여부
);

-- 결제 테이블
create table payment(
	no int primary key,								-- 결제 번호
    buyer_no int,									-- 결제자
    method varchar(50),								-- 결제 방식(현금, 카드)
    card_no varchar(50),							-- 카드 번호
    price int,										-- 결제 금액
    payment_date datetime							-- 결제 일시
);

-- 거래이력 테이블
create table transaction(
	no int primary key,								-- 거래 번호
    payment_no int,									-- 결제 정보 번호
    seller_no int,									-- 판매 회원 번호
    buyer_no int,									-- 구매 회원 번호
    product_no int,									-- 제품 번호
    transaction_date datetime						-- 거래 일시
);
