-- CREATE
-- 진료과 테이블
create table tb_dept (
dept_cd int auto_increment primary key comment "진료과 고유번호",
dept_name varchar(50) unique comment "진료과 이름" ,
dept_floor int comment "진료과 위치(층)" ,
create_date timestamp comment "진료과 생성일" ,
tel_number varchar(50) comment "진료과 전화번호" );

-- 의사 테이블
create table tb_doctor (
license_cd int primary key comment "의사 면허번호",
doctor_name varchar(50) comment "의사 이름" ,
gender varchar(10) comment "성별" ,
birth_date timestamp comment "생년월일" ,
tel_number varchar(50) comment "전화번호" ,
get_license_date timestamp comment "면허 취득일" ,
join_com_date timestamp comment "입사일" ,
dept_cd int comment "담당과 고유번호" ,
dept_name varchar(50) comment "담당과 이름" ,
suspend_license varchar(10) comment "면허 취소 여부" ,
closed_day varchar(50) comment "휴무일",
foreign key(dept_cd) references tb_dept(dept_cd));


-- 간호사 테이블
create table tb_nurse (
license_cd int primary key comment "간호사 면허번호",
nurse_name varchar(50) comment "간호사 이름" ,
gender varchar(10) comment "성별" ,
birth_date timestamp comment "생년월일" ,
tel_number varchar(50) comment "전화번호" ,
get_license_date timestamp comment "면허 취득일" ,
join_com_date timestamp comment "입사일" ,
dept_cd int comment "담당과 고유번호" ,
dept_name varchar(50) comment "담당과 이름" ,
closed_days varchar(50) comment "휴무일",
foreign key(dept_cd) references tb_dept(dept_cd));

-- 환자 테이블
create table tb_patient (
patient_cd int primary key comment "환자 등록번호",
patient_name varchar(50) comment "환자 이름" ,
gender varchar(10) comment "성별" ,
birth_date timestamp comment "생년월일" ,
tel_number varchar(50) comment "전화번호",
blood_type varchar(10) comment "혈액형",
dept_name varchar(50) comment "진료과 이름" ,
doctor_name varchar(50) comment "담당의 이름" ,
doctor_license_cd int comment "담당의 면허번호" ,
last_treat_date timestamp comment "최근 진료일" ,
admit_status varchar(10) comment "입원 여부" ,
admit_date timestamp comment "입원일",
foreign key(dept_name) references tb_dept(dept_name),
foreign key(doctor_license_cd) references tb_doctor(license_cd));

-- 진료차트 테이블
create table tb_medical_chart (
chart_cd int auto_increment primary key comment "차트 고유번호",
treat_date timestamp comment "진료일시",
patient_cd int comment "환자 등록번호" ,
patient_name varchar(50) comment "환자 이름" ,
dept_name varchar(50) comment "진료과 이름" ,
doctor_cd int comment "담당의 면허번호" ,
doctor_name varchar(50) comment "담당의 이름" ,
disease_name varchar(50) comment "병명" ,
detail varchar(100) comment "상세 내용",
prescription varchar(100) comment "처방",
foreign key(patient_cd) references tb_patient(patient_cd),
foreign key(doctor_cd) references tb_doctor(license_cd));

-- 결제부서 테이블
create table tb_payment_dept (
payment_cd int auto_increment primary key comment "결제 코드",
payment_date timestamp comment "결제일시",
patient_cd int comment "환자 등록번호",
patient_name varchar(50) comment "환자 이름" ,
dept_cd int comment "진료과 고유번호",
severe_status varchar(10) comment "중증 환자 여부(할인)",
amount int comment "결제 금액",
foreign key(patient_cd) references tb_patient(patient_cd),
foreign key(dept_cd) references tb_dept(dept_cd));

-- 실적 테이블
create table tb_performance (
sales_cd int auto_increment primary key comment "실적 고유번호",
month_sales int comment "실적월",
dept_cd int comment "진료과 고유번호",
dept_name varchar(50) comment "진료과 이름",
sales int comment "매출액",
foreign key(dept_cd) references tb_dept(dept_cd));

-- 채혈부서 테이블
create table tb_blood_dept (
test_date timestamp primary key comment "채혈 일시",
patient_cd int comment "환자 등록번호",
patient_name varchar(50) comment "환자 이름",
blood_type varchar(10) comment "혈액형",
detail varchar(100) comment "상세 내용",
foreign key(patient_cd) references tb_patient(patient_cd));

-- ct부서 테이블
create table tb_ct_dept (
scan_date timestamp primary key comment "촬영 일시",
patient_cd int comment "환자 등록번호",
patient_name varchar(50) comment "환자 이름",
contrast_status varchar(10) comment "조영제 투여 여부",
detail varchar(100) comment "상세 내용",
foreign key(patient_cd) references tb_patient(patient_cd));


-- INSERT
-- 진료과 테이블
insert into tb_dept(dept_name, dept_floor, create_date, tel_number)
values("이비인후과", 2, "2001-01-03", "041-555-6666");
insert into tb_dept(dept_name, dept_floor, create_date, tel_number)
values("정형외과", 3, "2003-03-04", "041-555-7777");
insert into tb_dept(dept_name, dept_floor, create_date, tel_number)
values("소화기내과", 3, "2004-02-14", "041-555-8888");

-- 의사 테이블
insert into tb_doctor
values(20050001, "김의사", "남", "1980-07-29", "010-3835-5300", "2005-01-07", "2006-03-13", 1, "이비인후과", "N", "화요일");
insert into tb_doctor
values(20080002, "박의사", "여", "1982-07-23", "010-4785-3455", "2008-02-12", "2010-05-20", 2, "정형외과", "N", "목요일");
insert into tb_doctor
values(20120003, "국의사", "남", "1991-08-08", "010-9327-9501", "2012-01-15", "2012-09-30", 3, "소화기내과", "N", "월요일");

-- 간호사 테이블
insert into tb_nurse
values(20123001, "이간호", "남", "1985-09-30", "010-9865-4423", "2013-06-03", "2015-02-07", 1, "이비인후과", "화요일");
insert into tb_nurse
values(20113002, "정간호", "여", "1984-06-01", "010-1559-4289", "2011-08-21", "2017-12-01", 2, "정형외과", "목요일");
insert into tb_nurse
values(20143003, "구간호", "여", "1986-04-30", "010-3966-3084", "2014-08-05", "2016-03-24", 3, "소화기내과", "월요일"); 

-- 환자 테이블
insert into tb_patient
values(1001, "최환자", "남", "1993-05-12", "010-8619-6785", "B", "정형외과", "박의사", 20080002, "2023-11-11", "N", null);
insert into tb_patient
values(1002, "오환자", "남", "1994-02-14", "010-4424-5322", "O", "이비인후과", "김의사", 20050001, "2023-12-26", "N", null);
insert into tb_patient
values(1003, "진환자", "남", "1995-12-14", "010-4489-0259", "AB", "소화기내과", "국의사", 20120003, "2023-12-19", "N", null);

-- 진료차트 테이블
insert into tb_medical_chart(treat_date, patient_cd, patient_name, dept_name, doctor_cd, doctor_name, disease_name, detail, prescription)
values("2023-11-11", 1001, "최환자", "정형외과", 20080002, "박의사", "늑골 골절", "레이저 치료", "진통제");
insert into tb_medical_chart(treat_date, patient_cd, patient_name, dept_name, doctor_cd, doctor_name, disease_name, detail, prescription)
values("2023-12-19", 1003, "진환자", "소화기내과", 20120003, "국의사", "위염", "약물 치료", "제산제");
insert into tb_medical_chart(treat_date, patient_cd, patient_name, dept_name, doctor_cd, doctor_name, disease_name, detail, prescription)
values("2023-12-26", 1002, "오환자", "이비인후과", 20050001, "김의사", "알레르기성 비염", "석션 치료", "항히스타민제");

-- 결제부서 테이블
insert into tb_payment_dept(payment_date, patient_cd, patient_name, dept_cd, severe_status, amount)
values("2023-11-11 14:30:31", 1001, "최환자", 2, "N", 140000);
insert into tb_payment_dept(payment_date, patient_cd, patient_name, dept_cd, severe_status, amount)
values("2023-12-19 15:01:35", 1003, "진환자", 3, "N", 110000 );
insert into tb_payment_dept(payment_date, patient_cd, patient_name, dept_cd, severe_status, amount)
values("2023-12-26 11:51:58", 1002, "오환자", 1, "N", 80000);

-- 실적 테이블
insert into tb_performance(month_sales, dept_cd, dept_name, sales)
values(202311, 1, "이비인후과", 140000);
insert into tb_performance(month_sales, dept_cd, dept_name, sales)
values(202311, 2, "정형외과", 0);
insert into tb_performance(month_sales, dept_cd, dept_name, sales)
values(202311, 3, "소화기내과", 0);
insert into tb_performance(month_sales, dept_cd, dept_name, sales)
values(202312, 1, "이비인후과", 0);
insert into tb_performance(month_sales, dept_cd, dept_name, sales)
values(202312, 2, "정형외과", 80000);
insert into tb_performance(month_sales, dept_cd, dept_name, sales)
values(202312, 3, "소화기내과", 110000);

-- 채혈부서 테이블
insert into tb_blood_dept
values("2023-11-11 14:01:28", 1001, "최환자", "B", null);
insert into tb_blood_dept
values("2023-12-19 14:28:05", 1003, "진환자", "AB", null);
insert into tb_blood_dept
values("2023-12-26 11:10:45", 1002, "오환자", "O", null);

-- CT부서 테이블
insert into tb_ct_dept
values("2023-12-19 11:15:59", 1003, "진환자", "N", null);
insert into tb_ct_dept
values("2023-12-26 11:21:05", 1002, "최환자", "N", null);

COMMIT;
