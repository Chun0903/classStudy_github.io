-- D:\class\JDBCTest\jdbc.sql

create table tblAdress (
    seq number primary key,
    name varchar2(30) not null,
    age number(3) not null,
    tel varchar2(300) not null,
    address varchar2(300) not null,
    regdate date default sysdate not null
);

create sequence seqAddress;

insert into tblAdress (seq, name, age, tel, address, regdate)
    values (seqAddress.nextVal, '홍길동', 20, '010-1234-5678',
        '서울시 강남구 역삼동', default);
        
commit;

select * from tblAdress;

select * from tblAAA;

select name, gender, age, address from tblAddressBook where replace(lower(address),' ','') like '%' || replace(lower ('시강'), ' ','')|| '%';
 
select DISTINCT(buseo) from tblInsa order by buseo;       
select * from tblInsa where buseo = '기획부' order by 
case 
    when jikwi = '부장' then 1
    when jikwi = '과장' then 2
    when jikwi = '대리' then 3
    when jikwi = '사원' then 4
end, name;   

select count(*) as from tblInsa where buseo = '개발부';

-- CallableStatement + 프로시저
-- m1()
create or replace procedure procM1(
    pname varchar2,
    page number,
    ptel varchar2,
    paddress varchar2
)
is
begin
    insert into tbladress values (SEQADDRESS.nextval, pname, page, ptel, paddress, default);
end;

-- m2()
-- 반환값(단일 레코드 or 다중 레코드(cursor))
create or REPLACE PROCEDURE procM2(
    pnum number,
    pname out varchar2,
    pbuseo out varchar2,
    pjikwi out varchar2
)
is
begin
    select name, buseo, jikwi into pname, pbuseo, pjikwi from tblInsa where num = pnum;
end;

-- m3()
create or REPLACE PROCEDURE procM3(
    pname varchar2, --남자이름
    wname out varchar2,--여자이름
    wage out number--여가 나이
)
is 
begin
    select name, age into wname, wage from tblWomen 
        where couple = (select name from tblMen where name = pname); 
end;

-- m4()
create or REPLACE PROCEDURE procM4(
    pbuseo varchar2,
    presult out sys_refcursor
)
is
begin
    open presult for
        select * from tblInsa where buseo = pbuseo;
end;

-- m5()
create or REPLACE PROCEDURE procM5(
    presult out sys_refcursor
)
is 
begin
    open presult for
        select * from tbladress;
end;



select * from tblboard;
select * from tblcomment;

create or replace procedure procaddComment (

    --댓글쓰기 매개변수
)
is
begin
    --1. 카운트 증가
    update tblboard set commentCount = commentCount + 1
        where seq = 1;
    --2. 댓글 쓰기
    insert into tblCcmment (seq, subject, pseq)
        values (1, '댓글', 1);
        
    commit;
    
exception
    when ohers then
        rollback;

end;














    