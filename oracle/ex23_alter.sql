-- ex23_alter.sql

/*

객체 생성: create
객체 삭제: drop
객체 수정: alter

데이터 생성: insert
데이터 삭제: delete
데이터 수정: update

테이블 수정하기, alter table
- 테이블 구조를 수정한다 > 컬럼의 정의를 수정한다.
- 되도록 테이블을 수정하는 상황을 발생시키면 안된다!!!(***)

*/

drop table tblEdit;

create table tblEdit
(
    seq number PRIMARY key,
    data VARCHAR2(20) not null
);
insert into tbledit values (1, '마우스');
insert into tbledit values (2, '키보드');
insert into tbledit values (3, '모니터');

select * from tbledit;
delete from tbledit;

--1. 새로운 컬럼 추가하기(가격)
alter table tblEdit
    --add(컬럼정의);
    add (price number(5) null); --null 컬럼

alter table tblEdit
    add (descriotion varchar2(100) not null);   -- not null 컬럼(X)

alter table tblEdit
    add (descriotion varchar2(100) default '임시' not null); 
    
-- 2. 컬럼 삭제하기
alter table tblEdit
    --drop column 컬럼명
    drop column descriotion;
    
alter table tblEdit
    drop column seq;    --PK, FK 의미있는 키는 삭제하면 큰일;;;;
    

--3. 컬럼 수정하기(자료형, 길이, 제약 사항, 컬럼명)
--3.a. 컬럼의 길이 조정하기(확장, 축소)
desc tblEdit;

alter table tblEdit
    --modify(컬럼정의)
    modify (data varchar2(100));

alter table tblEdit
    modify (data varchar2(5));

alter table tblEdit
    modify (data varchar2(9));

--3.b. 자료형 바꾸기 -> 비권장
alter table tblEdit
    modify (seq varchar2(100)); --number -> varchar2

--3.c. 제약사항 바꾸기
alter table tblEdit
    modify (data varchar2(100) null);

desc tblEdit;

--3.d. 컬럼영 바꾸기 > 비권장
alter table tblEdit
    rename column data to name;


-- 테이블 구현 -> 제약사항 추가하기
drop table tblEdit;

create table tblEdit
(
    seq number,
    data VARCHAR2(20),
    color varchar2(30)
);

-- PK 추가하기
alter table tblEdit
    add constraint tbledit_seq_pk primary key(seq);

alter table tblEdit
    add constraint tbledit_color_ck check(color in('red', 'yellow', 'blue'));
    
insert into tblEdit values (1, '마우스', 'red');
--ORA-00001: unique constraint (HR.TBLEDIT_SEQ_PK) violated
insert into tblEdit values (1, '마우스', 'red');
--ORA-02290: check constraint (HR.TBLEDIT_COLOR_CK) violated
insert into tblEdit values (2, '마우스', 'white');


create table tblEdit2
(
    seq number primary key,
    data varchar2(20) not null,
    --pseq number not null references tblEdit(seq)
    pseq number not null
);

alter table tblEdit2
    add constraint tbledit2_pseq_fk foreign key(pseq) references tblEdit(seq);
    
-- 제약 사항 삭제하기
alter table tblEdit2
    drop constraint tbledit2_pseq_fk;









