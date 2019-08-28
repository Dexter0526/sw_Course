select empno, ename, sal
from emp
order by sal desc;

select rownum, a.*
from
    (select empno, ename, sal
    from emp
    order by sal desc) a
where rownum <= 6;

-- ¿À¶óÅ¬ ÆäÀÌÂ¡ Äõ¸®¹®
select rownum, aa.*
from
    (select rownum as rnum, a.*
    from 
        (select empno, ename, sal
        from emp
        order by sal desc) a
    where rownum <= 6) aa
where rnum >= 4;