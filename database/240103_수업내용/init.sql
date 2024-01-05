-- CREATE
-- 진료과 테이블
CREATE TABLE TB_DEPT (
DEPT_CD INTEGER auto_increment primary key comment "진료과 고유번호",
DEPT_NAME VARCHAR (50) unique comment "진료과 이름" ,
DEPT_FLOOR INTEGER comment "진료과 위치(층)" ,
CREATE_DATE TIMESTAMP comment "진료과 생성일" ,
TEL_NUMBER VARCHAR (50) comment "진료과 전화번호");

-- 의사 테이블
CREATE TABLE TB_DOCTOR (
LICENSE_CD INTEGER primary key comment "의사 면허번호",
DOCTOR_NAME VARCHAR (50) comment "의사 이름" ,
GENDER VARCHAR (10) comment "성별" ,
BIRTH_DATE TIMESTAMP comment "생년월일" ,
TEL_NUMBER VARCHAR (50) comment "전화번호" ,
GET_LICENSE_DATE TIMESTAMP comment "면허 취득일" ,
JOIN_COM_DATE TIMESTAMP comment "입사일" ,
DEPT_CD INTEGER comment "담당과 고유번호" ,
DEPT_NAME VARCHAR (50) comment "담당과 이름" ,
SUSPEND_LICENSE VARCHAR (10) comment "면허 취소 여부" ,
CLOSED_DAY VARCHAR (50) comment "휴무일",
foreign key(dept_cd) references tb_dept(dept_cd));

-- 간호사 테이블
CREATE TABLE TB_NURSE (
LICENSE_CD INTEGER primary key comment "간호사 면허번호",
NURSE_NAME VARCHAR (50) comment "간호사 이름" ,
GENDER VARCHAR (10) comment "성별" ,
BIRTH_DATE TIMESTAMP comment "생년월일" ,
TEL_NUMBER VARCHAR (50) comment "전화번호" ,
GET_LICENSE_DATE TIMESTAMP comment "면허 취득일" ,
JOIN_COM_DATE TIMESTAMP comment "입사일" ,
DEPT_CD INTEGER comment "담당과 고유번호" ,
DEPT_NAME VARCHAR (50) comment "담당과 이름" ,
CLOSED_DAYS VARCHAR (50) comment "휴무일",
foreign key(dept_cd) references tb_dept(dept_cd));

-- 환자 테이블
CREATE TABLE TB_PATIENT (
PATIENT_CD INTEGER primary key comment "환자 등록번호",
PATIENT_NAME VARCHAR (50) comment "환자 이름" ,
GENDER VARCHAR (10) comment "성별" ,
BIRTH_DATE TIMESTAMP comment "생년월일" ,
TEL_NUMBER VARCHAR (50) comment "전화번호",
BLOOD_TYPE VARCHAR (10) comment "혈액형",
DEPT_NAME VARCHAR (50) comment "진료과 이름" ,
DOCTOR_NAME VARCHAR (50) comment "담당의 이름" ,
DOCTOR_LICENSE_CD INTEGER comment "담당의 면허번호" ,
LAST_TREAT_DATE TIMESTAMP comment "최근 진료일" ,
ADMIT_STATUS VARCHAR (10) comment "입원 여부" ,
ADMIT_DATE TIMESTAMP comment "입원일",
foreign key(dept_name) references tb_dept(dept_name),
foreign key(doctor_license_cd) references tb_doctor(license_cd));

-- 진료차트 테이블
CREATE TABLE TB_MEDICAL_CHART (
CHART_CD INTEGER primary key comment "차트 고유번호",
TREAT_DATE TIMESTAMP comment "진료일시",
PATIENT_CD INTEGER comment "환자 등록번호" ,
PATIENT_NAME VARCHAR (50) comment "환자 이름" ,
DEPT_NAME VARCHAR (50) comment "진료과 이름" ,
DOCTOR_CD INTEGER comment "담당의 면허번호" ,
DOCTOR_NAME VARCHAR (50) comment "담당의 이름" ,
DISEASE_NAME VARCHAR (50) comment "병명" ,
DETAIL VARCHAR (100) comment "상세 내용",
PRESCRIPTION VARCHAR (100) comment "처방",
foreign key(patient_cd) references tb_patient(patient_cd),
foreign key(doctor_cd) references tb_doctor(license_cd));

-- 실적 테이블
CREATE TABLE TB_PERFORMANCE (
MONTH_SALES TIMESTAMP primary key comment "실적월",
DEPT_CD INTEGER comment "진료과 고유번호",
DEPT_NAME VARCHAR (50) comment "진료과 이름" ,
SALES INTEGER comment "매출액",
foreign key(dept_cd) references tb_dept(dept_cd));

-- 결제부서 테이블
CREATE TABLE TB_PAYMENT_DEPT (
PAYMENT_CD INTEGER primary key comment "결제 코드",
PAYMENT_DATE TIMESTAMP comment "결제일시",
PATIENT_CD INTEGER comment "환자 등록번호",
PATIENT_NAME VARCHAR (50) comment "환자 이름" ,
DEPT_CD INTEGER comment "진료과 고유번호",
SEVERE_STATUS VARCHAR (10) comment "중증 환자 여부(할인)",
AMOUNT INTEGER comment "결제 금액",
foreign key(patient_cd) references tb_patient(patient_cd),
foreign key(dept_cd) references tb_dept(dept_cd));

-- 채혈부서 테이블
CREATE TABLE TB_BLOOD_DEPT (
TEST_DATE TIMESTAMP primary key comment "채혈 일시",
PATIENT_CD INTEGER comment "환자 등록번호",
PATIENT_NAME VARCHAR (50) comment "환자 이름",
BLOOD_TYPE VARCHAR (10) comment "혈액형",
DETAIL VARCHAR (100) comment "상세 내용",
foreign key(patient_cd) references tb_patient(patient_cd));

-- CT부서 테이블
CREATE TABLE TB_CT_DEPT (
SCAN_DATE TIMESTAMP primary key comment "촬영 일시",
PATIENT_CD INTEGER comment "환자 등록번호",
PATIENT_NAME VARCHAR (50) comment "환자 이름",
CONTRAST_STATUS VARCHAR (10) comment "조영제 투여 여부",
DETAIL VARCHAR (100) comment "상세 내용",
foreign key(patient_cd) references tb_patient(patient_cd));


-- INSERT
-- 진료과 테이블
insert into tb_dept(dept_cd, dept_name, dept_floor, create_date, tel_number)
values(1001, "이비인후과", 2, "2001-01-03", "041-555-6666");
insert into tb_dept(dept_cd, dept_name, dept_floor, create_date, tel_number)
values(1002, "정형외과", 3, "2003-03-04", "041-555-7777");
insert into tb_dept
values(1003, "소화기내과", 3, "2004-02-14", "041-555-8888");

-- 의사 테이블
insert into tb_doctor_list
values(20050001, "김의사", "2005-01-07", "2006-03-13", "남", "1980-07-29", 1001, "이비인후과", "N", "010-3835-5300", "화요일");
insert into tb_doctor_list
values(20080002, "박의사", "2008-02-12", "2010-05-20", "여", "1982-07-29", 1002, "정형외과", "N", "010-4785-3455", "목요일");

-- 간호사 테이블
insert into tb_nurse_list
values(20123001, "이간호", "2013-06-03", "2015-02-07", "남", "1985-09-30", 1001, "이비인후과", "010-9865-4423", "화요일");
insert into tb_nurse_list
values(20113002, "정간호", "2011-08-21", "2017-12-01", "여", "1984-06-01", 1002, "정형외과", "010-1559-4289", "목요일");

-- 환자 테이블
insert into tb_patient_list
values(10084913, "최환자", "남", "1993-05-12", "B", "010-8619-6785", "정형외과", "박의사", 20080002, "2023-11-11", "N", null);
insert into tb_patient_list
values(10087463, "오환자", "남", "1994-02-14", "O", "010-4424-5322", "이비인후과", "김의사", 20050001, "2023-12-26", "N", null);

-- 진료차트 테이블
insert into tb_medical_chart
values("2023-11-11", 10084913, "최환자", "정형외과", 20080002, "박의사", "요추염좌", "주사 치료하였음", "항생제");
insert into tb_medical_chart
values("2023-12-26", 10087463, "오환자", "이비인후과", 20050001, "김의사", "감기", "평소에 비염 있음", "감기약");

-- 실적 테이블
insert into tb_performance
values("2023-12-01", 20050001, "이비인후과", 5000);
insert into tb_performance 
values("2023-12-01", 20080002, "정형외과", 6000);

-- 결제부서 테이블
insert into tb_payment_dept 
values(1, "2023-11-11", 10084913, "최환자", 20080002, "N");
insert into tb_payment_dept 
values(2, "2023-12-26", 10087463, "오환자", 20050001, "N");

-- 채혈부서 테이블
insert into tb_blood_dept
values("2023-11-11", 10084913, "최환자", "B", null);
insert into tb_blood_dept
values("2023-12-26", 10087463, "오환자", "O", null);

-- CT부서 테이블
insert into tb_ct_dept 
values("2023-11-11", 10084913, "최환자", "Y", null);
insert into tb_ct_dept 
values("2023-12-26", 10087463, "오환자", "N", null);

COMMIT;
