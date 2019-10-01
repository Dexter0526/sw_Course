-- * 오라클 DBMS 설치 후 scott 계정 추가하는 방법
--   ① SQL Developer 실행 후 sys 계정으로 접속하기
--   ② C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql 파일을 메모장으로 열어서 내용복사후, SQL Developer에서 SYS계정으로 내용 붙여넣기하여 실행하기.
--   ③ sys 계정에서 scott 계정을 활성화하고 패스워드를 tiger로 지정하기
--        alter user scott account unlock;
--        alter user scott identified by tiger;
--   ④ scott 계정으로 접속하기






-- 테이블에서 ROWNUM은 입력된 행의 순서가 됨
SELECT ROWNUM, empno, ename, sal  -- (2)
FROM emp -- (1)
ORDER BY sal DESC;  -- (3)


-- 정렬 이후에 ROWNUM을 붙이기
SELECT ROWNUM, a.*
FROM
    (SELECT empno, ename, sal
    FROM emp
    ORDER BY sal DESC) a;


-- 시작행부터 끝행까지 가져오기 (페이징)
-- ROWNUM 번호붙이기는 1부터 시작해야 함
SELECT ROWNUM, a.*
FROM
    (SELECT empno, ename, sal
    FROM emp
    ORDER BY sal DESC) a
WHERE ROWNUM <= 6;


-- 오라클 페이징 쿼리문
SELECT ROWNUM, aa.*
FROM
    (SELECT ROWNUM AS rnum, a.*
    FROM
        (SELECT empno, ename, sal
        FROM emp
        ORDER BY sal DESC) a
    WHERE ROWNUM <= 6) aa
WHERE rnum >= 4;






-- 게시판 페이징해서 글 가져오기
SELECT /*ROWNUM,*/ aa.*
FROM
    (SELECT ROWNUM AS rnum, a.*
    FROM
        (SELECT *
        FROM board
        ORDER BY num DESC) a
    WHERE ROWNUM <= 6) aa
WHERE rnum >= 4;



SELECT /*ROWNUM,*/ aa.*
FROM
    (SELECT ROWNUM AS rnum, a.*
    FROM
        (SELECT *
        FROM board
        ORDER BY num DESC) a
    WHERE ROWNUM <= (4+3-1)) aa
WHERE rnum >= 4;


SELECT /*ROWNUM,*/ aa.*
FROM
    (SELECT ROWNUM AS rnum, a.*
    FROM
        (SELECT *
        FROM board
        ORDER BY num DESC) a
    WHERE ROWNUM <= ?) aa  -- endRow
WHERE rnum >= ?; -- startRow

/***************************************************************
/*MySQL
/***************************************************************

root계정 - 최고관리자

DDL : create, alter, drop

*/

-- 1. 데이터베이스 이름 공간 생성 jspdb

create database jspdb;

-- 데이터베이스 목록 확인
show databases;

-- 2. 데이터베이스 사용할 사용자계정 생성
--     사용자 이름 : jspid	패스워드 : jsppass
CREATE USER 'jspid'@'localhost' IDENTIFIED BY 'jsppass';

GRANT SELECT,INSERT,UPDATE,DELETE, CREATE,ALTER,DROP
ON jspdb.* TO 'jspid'@'localhost';


CREATE USER 'jspid'@'%' IDENTIFIED BY 'jsppass';

GRANT SELECT,INSERT,UPDATE,DELETE, CREATE,ALTER,DROP
ON jspdb.* TO 'jspid'@'%';


-- 사용할 스키마이름 jspdb로 지정하기
use jspdb;

-- `member` 테이블 생성
CREATE TABLE `member` (
  `id` varchar(20) NOT NULL COMMENT '아이디',
  `passwd` varchar(20) NOT NULL COMMENT '패스워드',
  `name` varchar(20) NOT NULL COMMENT '이름',
  `reg_date` datetime DEFAULT NULL COMMENT '가입날짜',
  `age` int(11) DEFAULT NULL COMMENT '나이',
  `gender` varchar(6) DEFAULT NULL COMMENT '성별',
  `email` varchar(30) DEFAULT NULL COMMENT '이메일주소',
  `address` varchar(60) DEFAULT NULL COMMENT '주소',
  `tel` varchar(20) DEFAULT NULL COMMENT '전화번호',
  `mtel` varchar(20) DEFAULT NULL COMMENT '휴대폰번호',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='회원관리 테이블';


-- attach 테이블 생성
CREATE TABLE `jspdb`.`attach` (
  `uuid` VARCHAR(100) NOT NULL,
  `uploadpath` VARCHAR(200) NULL,
  `filename` VARCHAR(100) NOT NULL,
  `filetype` CHAR(1) NULL,
  `bno` INT NULL,
  PRIMARY KEY (`uuid`));

-- attach 테이블 정보 확인
desc attach;

/*
<?xml version="1.0" encoding="UTF-8"?>
<Context>
	<Resource
		name="jdbc/oracledb"
		type="javax.sql.DataSource"
		auth="Container"
		driverClassName="oracle.jdbc.OracleDriver"
		url="jdbc:oracle:thin:@localhost:1521:xe"
		username="scott"
		password="tiger"
	 />
	 
	 <Resource
		name="jdbc/mysqldb"
		type="javax.sql.DataSource"
		auth="Container"
		driverClassName="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/jspdb?useUnicode=true&amp;characterEncoding=utf8&amp;allowPublicKeyRetrieval=true&amp;useSSL=false&amp;serverTimezone=Asia/Seoul"
		username="jspid"
		password="jsppass"
	 />
	 
</Context>
*/




