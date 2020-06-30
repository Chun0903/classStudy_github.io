-- ex18_delete.sql

-- select
-- insert
-- update
-- delete

-- 셀지우기
--update tblInsa set
--    buseo = null
--        where num = 1001;


/*

delete문
- DML
- (레코드) 데이터를 삭제하는 명령어
- delete [from] 테이블명 [where 절]

*/
select * from tblcountry;

delete from tblcountry where continent = 'AS';

delete from tblcountry; --테이블 초기화

rollback;























