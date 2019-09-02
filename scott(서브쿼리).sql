select empno, ename, sal
from emp
order by sal desc;

select rownum, a.*
from
    (select empno, ename, sal
    from emp
    order by sal desc) a
where rownum <= 6;

-- 오라클 페이징 쿼리문
select rownum, aa.*
from
    (select rownum as rnum, a.*
    from 
        (select empno, ename, sal
        from emp
        order by sal desc) a
    where rownum <= 6) aa
where rnum >= 4;


-- 강사님
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

