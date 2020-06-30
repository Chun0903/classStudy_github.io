-- ex27_transaction.sql

/*

트랜잭션, Transaction
- 오라클에서 발생하는 1개 이상의 명령어들을 하나의 논리 집합으로 묶어놓은 단위 > 제어
- 트랜잭션에 포함되는 명령어 > insert, update, delete > 테이블 조작

트랜잭션 명령어
- DCL(TCL)
- 하나의 트랜잭션으로 묶여 있는 DML을 감시하다가, 일부 DML이 문제를 발생하면 
    이전에 성공한 DML을 일괄 취소 처리하고, 문제 발생이 없으면 일관 승인 처리한다.
1. commit
2. rollback
3. savepoint

새로운 트랜잭션이 시작하는 경우
1. 클라이언트 접속 직 후
2. commit 실행 직 후
3. rollback 실행 직 후

현재 트랜잭션이 종료되는 경우
1. commit 실행 직 후 > 현재 트랜잭션의 결과를 DB 반영함
2. rollback 실행 직 후 > 현재 트랜잭션의 결과를 DB에 반영 안함.
3. 클라이언트 접속 종료 
    a. 정상적인 접속 종료 > 대부분의 툴은 질문? > commit or rollback?
    b. 비정상적인 접속 종료 > rollback
4. DDL 실행했을 때
    -create, alter, drop
    a. 자동 커밋, Auto commit
*/

create table tblTrans
as
select name, city, buseo, jikwi from tblInsa where buseo = '영업부';

-- 지금부터 하는 작업은 시간에 따른 순서가 있는 작업

select * from tbltrans; --16

delete from tblTrans where name ='김종서'; --1

select * from tbltrans; --15

rollback;
------------------------------------------------------
select * from tbltrans; --16

delete from tbltrans where name ='김정훈';

update tblTrans set city = '서울' where name = '김종서';

select * from tbltrans;

rollback;
------------------------------------------------------
select * from tbltrans;

delete from tblTrans where name = '유관순';

update tblTrans set city = '서울' where name = '김종서';

select * from tbltrans;

commit; --주의!!!!!!!!!!!!!!!

select * from tbltrans;

rollback;   --소용X

select * from tbltrans;

update tblTrans set city = '경기' where name = '손인수'; -- 고순정 퇴사 예정

delete from tblTrans where name  ='고순정'; --영업부 대리 경기 -> 퇴사

update tblTrans set city = '부산' where name = '손인수';

commit;
rollback;

select * from tblTrans;

commit;

delete from tblTrans where city <> '서울';

select * from tblTrans;

create table tnlTrans2
(
    seq number primary key
);

select * from tblTrans;

rollback;

select * from tblTrans;

commit;

delete from tblTrans where jikwi = '사원';

select * from tblTrans;

commit;

select * from tblTrans;

delete from tblTrans where name = '김종서';

savepoint a;

delete from tblTrans where name = '김인수';

savepoint b;

delete from tblTrans where name = '산마루';

rollback;
rollback to a;
rollback to b;

select * from tblTrans;














