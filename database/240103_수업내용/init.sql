--CREATE
-- 진료과 테이블
CREATE TABLE TB_DEPT (
DEPT_CD INTEGER NOT NULL,
DEPT_NAME VARCHAR (100) ,
DEPT_FLOOR INTEGER ,
CREATE_DATE TIMESTAMP ,
TEL_NUMBER VARCHAR (100) );

-- 의사 테이블
CREATE TABLE TB_DOCTOR_LIST (
LICENSE_CD INTEGER NOT NULL,
DOCTOR_NAME VARCHAR (100) ,
GET_LICENSE_DATE TIMESTAMP ,
JOIN_COM_DATE TIMESTAMP ,
GENDER VARCHAR (100) ,
BIRTH_DATE TIMESTAMP ,
DEPT_CD INTEGER ,
DEPT_NAME VARCHAR (100) ,
SUSPEND_LICENSE VARCHAR (100) ,
TEL_NUMBER VARCHAR (100) ,
CLOSED_DAY VARCHAR (100) );

-- 간호사 테이블
CREATE TABLE TB_NURSE_LIST (
LICENSE_CD INTEGER NOT NULL,
NURSE_NAME VARCHAR (100) ,
GET_LICENSE_DATE TIMESTAMP ,
JOIN_COM_DATE TIMESTAMP ,
GENDER VARCHAR (100) ,
BIRTH_DATE TIMESTAMP ,
DEPT_CD INTEGER ,
DEPT_NAME VARCHAR (100) ,
TEL_NUMBER VARCHAR (100) ,
CLOSED_DAYS VARCHAR (100) );

-- 환자 테이블
CREATE TABLE TB_PATIENT_LIST (
PATIENT_CD INTEGER NOT NULL,
PATIENT_NAME VARCHAR (100) ,
GENDER VARCHAR (100) ,
BIRTH_DATE TIMESTAMP ,
BLOOD_TYPE VARCHAR (100) ,
TEL_NUMBER VARCHAR (100) ,
DEPT_NAME VARCHAR (100) ,
DOCTOR_NAME VARCHAR (100) ,
DOCTOR_LICENSE_CD INTEGER ,
LAST_TREAT TIMESTAMP ,
ADMIT_STATUS VARCHAR (100) ,
ADMIT_DATE TIMESTAMP );

-- 진료차트 테이블
CREATE TABLE TB_MEDICAL_CHART (
TREAT_DATE TIMESTAMP NOT NULL,
PATIENT_CD INTEGER ,
PATIENT_NAME VARCHAR (100) ,
DEPT_NAME VARCHAR (100) ,
DOCTOR_CD INTEGER ,
DOCTOR_NAME VARCHAR (100) ,
DISEASE_NAME VARCHAR (100) ,
DETAIL VARCHAR (100) ,
PRESCRIPTION VARCHAR (100) );

-- 실적 테이블
CREATE TABLE TB_PERFORMANCE (
MONTH_SALES TIMESTAMP NOT NULL,
DEPT_CD INTEGER ,
DEPT_NAME VARCHAR (100) ,
SALES INTEGER );

-- 결제부서 테이블
CREATE TABLE TB_PAYMENT_DEPT (
PAYMENT_CD INTEGER NOT NULL,
PAYMENT_DATE TIMESTAMP ,
PATIENT_CD INTEGER ,
PATIENT_NAME VARCHAR (100) ,
DEPT_CD INTEGER ,
SEVERE_STATUS VARCHAR (100) ,
AMOUNT INTEGER );

-- 채혈부서 테이블
CREATE TABLE TB_BLOOD_DEPT (
TEST_DATE TIMESTAMP NOT NULL,
PATIENT_CD INTEGER ,
PATIENT_NAME VARCHAR (100) ,
BLOOD_TYPE VARCHAR (100) ,
DETAIL VARCHAR (100) );

-- CT부서 테이블
CREATE TABLE TB_CT_DEPT (
SCAN_DATE TIMESTAMP NOT NULL,
PATIENT_CD INTEGER ,
PATIENT_NAME VARCHAR (100) ,
CONTRAST_STATUS VARCHAR (100) ,
DETAIL VARCHAR (100) );


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
