-- ex16_insert.sql

/*

insert 문
- DML
- 데이터를 테이블에서 추가하는 명령하기(행, 레코드)
- insert into 테이블명(컬럼리스트) value (값리스트);


*/

drop table tblMemo;

create table tblMemo
(
    seq number primary key,
    name varchar2(30) default '익명' not null,
    memo varchar2(1000) not null,
    regdate date default sysdate null
);

drop sequence seqMemo;

create sequence seqMemo;


-- 1. 표준: 원본 테이블에 정의된 컬럼 순서대로 컬럼리스트와 값리스트를 구성하는 방식
insert into tblMemo (seq, name, memo, regdate) 
        values (seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);
        
-- 2. 컬럼리스트의 순서와 값리스트의 순서는 반드시 일치해야 한다.
--ORA-01841: (full) year must be between -4713 and +9999, and not be 0
insert into tblMemo (seq, memo, regdate, name) 
        values (seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);

-- 3. 원본 테이블의 정의된 컬럼 순서와 insert 컬럼 순서는 무관하다.
insert into tblMemo (seq, memo, regdate, name) 
        values (seqMemo.nextVal, '메모입니다.', sysdate, '홍길동');

-- 4.
--00947. 00000 -  "not enough values" (!단골)
insert into tblMemo (seq, name, memo, regdate) 
        values (seqMemo.nextVal, '홍길동', sysdate);        

-- 5.
--00913. 00000 -  "too many values"
insert into tblMemo (seq, name, regdate) 
        values (seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);
        
        
-- 6. null 컬럼 조작
-- 6-a null 컬럼에 값을 명시적으로 대입
insert into tblMemo (seq, name, memo, regdate) 
        values (seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);

-- 6-b null 컬럼에 null 값을 명시적으로 대입        
insert into tblMemo (seq, name, memo, regdate) 
        values (seqMemo.nextVal, '홍길동', '메모입니다.', null);    

-- 6-c 암시적 대입        
insert into tblMemo (seq, name, memo) 
        values (seqMemo.nextVal, '홍길동', '메모입니다.');          --default 적용
        
        
-- 7. default
-- 7-a 암시적
insert into tblMemo (seq, name, memo) 
        values (seqMemo.nextVal, '홍길동', '메모입니다.');
        
-- 7-b 명시적 : 가독성b, 단축 표현법 사용 가능
insert into tblMemo (seq, memo) 
        values (seqMemo.nextVal, '메모입니다.');

insert into tblMemo (seq, name, memo, regdate) 
        values (seqMemo.nextVal, default, '메모입니다.', default);
        
-- 8. 단축 표현법 -> 테이블 원본의 컬럼 리스트 순서+개수를 따른다.
insert into tblMemo values (seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);
insert into tblMemo values (seqMemo.nextVal, '메모입니다.', sysdate, '홍길동');
insert into tblMemo values (seqMemo.nextVal, '홍길동', '메모입니다.');

insert into tblMemo values (seqMemo.nextVal, default, '메모입니다.', default);     --O

select * from tblMemo;

-----------------------------------------

-- 1. 서브 쿼리, 테이블 복사
create table tblMemo2
(
    seq number primary key,
    name varchar2(30) default '익명' not null,
    memo varchar2(1000) not null,
    regdate date default sysdate null
);

insert into tblMemo2 select * from tblMemo; -- 서브 쿼리

select * from tblMemo2;

-- 2. create + insert
-- 테이블의 제약 사항이 복사가 안된다 -> 개발용으로 사용한다(테스트용)
create table tblMemo3
as
select * from tblMemo;

select * from tblMemo3;












