select empno, ename, sal
from emp
order by sal desc;

select rownum, a.*
from
    (select empno, ename, sal
    from emp
    order by sal desc) a
where rownum <= 6;

-- ����Ŭ ����¡ ������
select rownum, aa.*
from
    (select rownum as rnum, a.*
    from 
        (select empno, ename, sal
        from emp
        order by sal desc) a
    where rownum <= 6) aa
where rnum >= 4;


-- �����
-- ���̺��� ROWNUM�� �Էµ� ���� ������ ��
SELECT ROWNUM, empno, ename, sal  -- (2)
FROM emp -- (1)
ORDER BY sal DESC;  -- (3)


-- ���� ���Ŀ� ROWNUM�� ���̱�
SELECT ROWNUM, a.*
FROM
    (SELECT empno, ename, sal
    FROM emp
    ORDER BY sal DESC) a;


-- ��������� ������� �������� (����¡)
-- ROWNUM ��ȣ���̱�� 1���� �����ؾ� ��
SELECT ROWNUM, a.*
FROM
    (SELECT empno, ename, sal
    FROM emp
    ORDER BY sal DESC) a
WHERE ROWNUM <= 6;


-- ����Ŭ ����¡ ������
SELECT ROWNUM, aa.*
FROM
    (SELECT ROWNUM AS rnum, a.*
    FROM
        (SELECT empno, ename, sal
        FROM emp
        ORDER BY sal DESC) a
    WHERE ROWNUM <= 6) aa
WHERE rnum >= 4;



-- �Խ��� ����¡�ؼ� �� ��������
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

