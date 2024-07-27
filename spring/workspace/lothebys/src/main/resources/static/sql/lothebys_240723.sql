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

insert into company (no, name, ceo, addr, phone) values
(0701, 'Lothebys', '이동훈', '천안시 서북구 불당동', '010-1234-7890');

insert into admin (no, id, pwd, name, job, phone) values
('1', 'admin1', '1111', '이동훈', 'ceo', '010-1111-2222'),
('2', 'admin2', '1111', '박성민', 'manager', '010-3333-4444'),
('3', 'admin3', '1111', '권용진', 'manager', '010-5555-6666'),
('4', 'admin4', '1111', '최유경', 'manager', '010-7777-8888'),
('5', 'admin5', '1111', '염종원', 'manager', '010-9999-1111');

insert into user (no, id, pwd, name, phone, email, addr, regdate) values
('2024001', 'user01', '1234', 'John Smith', '010-1234-5678','john@example.com', '123 Oak St, City X', NOW()),
('2024002', 'user02', '1234', 'Olivia Brown', '010-1234-5678', 'olivia@example.com', '123 Elm St, City Q', NOW()),
('2024003', 'user03', '1234', 'Michael Johnson', '010-2345-6789', 'michael@example.com', '456 Pine St, City Y', NOW()),
('2024004', 'user04', '1234', 'Emily Davis', '010-3456-7890', 'emily@example.com', '789 Maple St, City Z', NOW()),
('2024005', 'user05', '1234', 'Daniel Wilson', '010-4567-8901', 'daniel@example.com', '890 Cedar St, City W', NOW()),
('2024006', 'user06', '1234', 'Sophia Martinez', '010-5678-9012', 'sophia@example.com', '234 Birch St, City V', NOW()),
('2024007', 'user07', '1234', 'Matthew Taylor', '010-6789-0123', 'matthew@example.com', '567 Willow St, City U', NOW()),
('2024008', 'user08', '1234', 'Isabella Garcia', '010-7890-1234', 'isabella@example.com', '890 Ash St, City T', NOW()),
('2024009', 'user09', '1234', 'David Martinez', '010-8901-2345', 'david@example.com', '456 Oak St, City S', NOW()),
('2024010', 'user10', '1234', 'Emma Hernandez', '010-9012-3456', 'emma@example.com', '123 Pine St, City R', NOW());

insert into brand (no, name, regdate) values
('202401', 'Rolex', NOW()),             -- 시계 롤렉스
('202402', 'Omega', NOW()),             -- 시계 오메가
('202403', 'Patek Philippe', NOW()),    -- 시계 파텍 필립
('202404', 'Audemars Piguet', NOW()),   -- 시계 오데마 피게
('202405', 'Bvlgari', NOW()),           -- 쥬얼리
('202406', 'Cartier', NOW()),           -- 쥬얼리
('202407', 'Tiffany & Co.', NOW()),     -- 쥬얼리
('202408', 'Van Cleef & Arpels', NOW());-- 쥬얼리

insert into jewelry_upload (no, seller_no, type, material, price, karat, brand_no, image_no, regdate) values
 ('JWLC01', '20240722', 'Necklace', 'Gold', 1500.00, 18, '202406', '2024072301',  NOW()),
 ('JWLC02', '20240721', 'Necklace', 'Platinum', 2500.00, 22, '202406', '2024072302',  NOW()),
 ('JWLC03', '20240720', 'Necklace', 'Silver', 800.00, 14, '202406', '2024072303',  NOW()),  	-- 까르띠에
 ('JWLB01', '20240720', 'Ring', 'Gold', 2000.00, 22, '202405', '2024072304',  NOW()),
 ('JWLB02', '20240718', 'Ring', 'Silver', 1800.00, 14, '202405', '2024072305',  NOW()),		-- 불가리
 ('JWLT01', '20240715', 'Bracelet', 'Gold', 2000.00, 18, '202407', '2024072306',  NOW()),
 ('JWLT02', '20240713', 'Necklace', 'Gold', 2500.00, 22, '202407', '2024072307',  NOW()),
 ('JWLT03', '20240716', 'Ring', 'Platinum', 3500.00, 22, '202407', '2024072308',  NOW());		-- 티파니엔코		

insert into watch_upload(no, seller_no, movement_type, case_size, band_material, price, is_box, is_paper, brand, image_no, regdate) values
('WATR01', 20240723, 'automatic', 38, 'steel', 5000.00, true, true, 'Rolex', '2024072309', NOW()),
('WATR02', 20240722, 'quartz', 44, 'rubber', 5500.00, true, false, 'Rolex', '2024072310', NOW()),
('WATR03', 20240710, 'quartz', 44, 'steel', 5500.00, true, false, 'Rolex', '2024072311', NOW()),			-- 롤렉스
('WATO01', 20240723, 'automatic', 38, 'leather', 5600.00, false, true, 'Omega', '2024072312', NOW()),
('WATO02', 20240721, 'quartz', 42, 'gold', 5600.00, false, true, 'Omega', '2024072313', NOW()),
('WATO03', 20240701, 'automatic', 42, 'gold', 5600.00, true, true, 'Omega', '2024072314', NOW()),
('WATO04', 20240723, 'automatic', 38, 'leather', 5600.00, false, true, 'Omega', '2024072315', NOW()),	-- 오메가
('WATP01', 20240723, 'quartz', 38, 'steel', 8600.00, true, true, 'Patek Philippe', '2024072316', NOW()),
('WATP02', 20240720, 'quartz', 44, 'leather', 8600.00, true, true, 'Patek Philippe', '2024072317', NOW()), -- 파텍 필립
('WATA01', 20240721, 'quartz', 44, 'steel', 8600.00, true, true, 'Audemars Piguet', '2024072318', NOW()),
('WATA02', 20240722, 'quartz', 44, 'steel', 8600.00, true, true, 'Audemars Piguet', '2024072319', NOW()); -- 오데마 피게

insert into interior_upload (no, seller_no, art_size, material, price, decorative_style, artist, country, image_no, regdate) values
('IN001', 20240723, 38, 'paper', 900.00, 'wall', 'Artist Yuem', 'China', '2024072320', NOW()),
('IN002', 20240718, 48, 'paper', 1900.00, 'wall', 'Artist Lee', 'Korea', '2024072321', NOW()),			-- 벽화
('IN003', 20240708, 500, 'wool', 1900.00, 'pillows', 'Hermès', 'Korea', '2024072322', NOW()),			-- 베개
('IN004', 20240720, 5000, 'walnut', 1900.00, 'daybeds', 'Hermès', 'United States', '2024072323', NOW());	-- 데이베드

insert into image (no, image1, image2, image3) values
('2024072301', null, null, null),
('2024072302', null, null, null),
('2024072303', null, null, null),
('2024072304', null, null, null),
('2024072305', null, null, null),
('2024072306', null, null, null),
('2024072307', null, null, null),
('2024072308', null, null, null),
('2024072309', null, null, null),
('2024072310', null, null, null),
('2024072311', null, null, null),
('2024072312', null, null, null),
('2024072313', null, null, null),
('2024072314', null, null, null),
('2024072315', null, null, null),
('2024072316', null, null, null),
('2024072317', null, null, null),
('2024072318', null, null, null),
('2024072319', null, null, null),
('2024072320', null, null, null),
('2024072321', null, null, null),
('2024072322', null, null, null),
('2024072323', null, null, null);
