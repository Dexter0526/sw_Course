/*
 범위 주석
 sql문은 대소문자가 없음!
 약속된 키워드는 대문자로 쓰는 경향이 있다.
*/

-- 행 주석


-- 테이블 생성 
-- 테이블 : 데이터 저장 공간 
CREATE TABLE student (
    num NUMBER,
    name VARCHAR2(10),
    PRIMARY KEY (num)
);

-- 테이블에 데이터 행단위(레코드) 데이터 입력은 INSERT문
INSERT INTO student(num,name)
VALUES (1, '홍길동');

INSERT INTO student VALUES(2,'성춘향');

INSERT INTO student VALUES(3,'홍길동');

INSERT INTO student (name,num)
VALUES('이몽룡',4);

INSERT INTO student (num) VALUES (5);


-- 테이블 내용 가져오기(조회) SELECT 
SELECT * 
FROM STUDENT;

 

SELECT name FROM student;

SELECT num, name --(3)
FROM student --(1)
WHERE num = 2; --(2)

SELECT *
FROM student 
WHERE name =  '홍길동';


-- num열을 기준으로 오름차순 정렬해서 select 
SELECT * FROM student ORDER BY num ASC;

-- num열을 기준으로 내림차순 정렬해서 select 
SELECT * FROM student ORDER BY num DESC;

 


-- 학생 정보 수정 UPDATE문
UPDATE student 
SET   name ='박보검'
WHERE num = 1;

UPDATE student 
set name = '송혜교'
WHERE num = 5;


-- 행 삭제 
DELETE 
FROM student 
WHERE num =1;


COMMIT;