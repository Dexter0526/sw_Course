/*
 ���� �ּ�
 sql���� ��ҹ��ڰ� ����!
 ��ӵ� Ű����� �빮�ڷ� ���� ������ �ִ�.
*/

-- �� �ּ�


-- ���̺� ���� 
-- ���̺� : ������ ���� ���� 
CREATE TABLE student (
    num NUMBER,
    name VARCHAR2(10),
    PRIMARY KEY (num)
);

-- ���̺� ������ �����(���ڵ�) ������ �Է��� INSERT��
INSERT INTO student(num,name)
VALUES (1, 'ȫ�浿');

INSERT INTO student VALUES(2,'������');

INSERT INTO student VALUES(3,'ȫ�浿');

INSERT INTO student (name,num)
VALUES('�̸���',4);

INSERT INTO student (num) VALUES (5);


-- ���̺� ���� ��������(��ȸ) SELECT 
SELECT * 
FROM STUDENT;

 

SELECT name FROM student;

SELECT num, name --(3)
FROM student --(1)
WHERE num = 2; --(2)

SELECT *
FROM student 
WHERE name =  'ȫ�浿';


-- num���� �������� �������� �����ؼ� select 
SELECT * FROM student ORDER BY num ASC;

-- num���� �������� �������� �����ؼ� select 
SELECT * FROM student ORDER BY num DESC;

 


-- �л� ���� ���� UPDATE��
UPDATE student 
SET   name ='�ں���'
WHERE num = 1;

UPDATE student 
set name = '������'
WHERE num = 5;


-- �� ���� 
DELETE 
FROM student 
WHERE num =1;


COMMIT;