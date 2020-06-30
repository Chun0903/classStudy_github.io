SAVEPOINT A;
select * from tblSubject;

select * from tblSubject
    where seq = 21;
    
select * from tblSubject
    where name = 4;
  



SELECT name ,count(*) from tblSubject
    group by name;  -- 이름 중복체크
    
SELECT * from tblSubject
    order by seq;   -- 시퀀스순 배열
    
SELECT tblSubject_seq.CURRVAL FROM DUAL;    --해당시퀀스 최고값

delete tblSubject; 

update tblsubject set name = '자바 프로그래밍' where seq = 11;

drop sequence tblSubject_seq;
create sequence tblSubject_seq;

set define off;--대체번호 끄기

SELECT name, seq from tblSubject where name = 'Java Programming';


-- 번호, '과목명', 종류, 기간, 교재 번호
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Java Programming', 1, 18, 1);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Java 애플리케이션 통합 테스트', 1, 8, 1);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Front-end 애플리케이션 구현', 2, 17, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '반응형 웹 개발기법(이론)', 2, 5, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '반응형 웹 개발기법(실기)', 2, 5, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Back-end 애플리케이션 구현', 2, 20, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Embedded Programming', 2, 11, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Full-stack 융합 프로젝트', 2, 16, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'NCS 소양교과', 2, 2, 1); -- 보류
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '데이터베이스', 2, 10, 6);
    
--------(2)

insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '자바 프로그래밍', 1, 18, 1);
    
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '웹 프로그래밍', 2, 16, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '애플리케이션 테스트 수행', 2, 7, 7);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '애플리케이션 배포', 2, 5, 7);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '요구사항 확인', 2, 7, 1);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Spring 개발', 2, 9, 8);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Spring framework', 2, 7, 8);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '제이쿼리 모바일', 2, 20, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '코틀린 프로그래밍', 2, 5, 7);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '코틀린 안드로이드 프로그램 구현', 2, 2, 7);
    
-------(3)


insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '코틀린 활용 안드로이드 모바일 프로젝트', 2, 6, 7);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Spring 서버 기반 지능형 웹, 앱 통합개발 구현', 2, 9, 8);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '마이크로 컨트롤러 프로그래밍', 2, 7, 4);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '멀티 플랫폼 통합 서비스 구현 프로젝트', 2, 7, 4);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '객체지향과 JAVA SE', 1, 20, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '데이터저장을 위한 오라클 데이터베이스', 1, 10, 6);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '형상관리', 2, 2, 6);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'UML을 사용한 시스템 분석', 2, 48, 6);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '데스크 탑 UI/UX 설계', 2, 5, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '웹킷 계열 브라우저 반응형 웹 UI/UX 설계', 2, 10, 5);
    
-------(4)

insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Open JDK 자바 코딩 & 산출용 배포', 1, 25, 5);----대체번호 입력?????
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '정보 저장 검색을 위한 Oracle DBMS', 1, 10, 6);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '스마트 웹 제작 요구사항 분석', 2, 10, 4);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Front End 싱글 페이지를 위한 UI\UX 설계와 구현', 2, 10, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Framework & Backend 개발 및 테스트 수행', 2, 20, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Django를 사용한 Python 웹 프로그래밍', 2, 20, 4);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '하이브리드 앱 프로그래밍 기초', 2, 4, 7);

insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '하이브리드 앱 응용 및 구현', 2, 14, 7);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Spring 기반 마이크로 서버 통합구현 프로젝트', 2, 7, 8);
    ---------------------
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '반응형 Wep 개발기법(이론)', 2, 10, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '반응형 Wep 개발기법(실기)', 2, 10, 5);

insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '백앤드 애플리케이션 구현', 2, 15, 5);

insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Full-stack 융합 프로젝트', 2, 15, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, 'Full-stack 융합 프로젝트', 2, 15, 5);
    
insert into tblSubject (seq, name, type, subjectperiod, bookseq)
    values (tblSubject_seq.nextVAl, '백앤드 애플리케이션', 2, 15, 5);
    

    
select *from tblSubject;


select * from tblBook
order by seq;


--select sysdate + (20*7) from dual;


select * from tblsubject
where type = 1;


update tblsubject set name = 'Front-End UI' where seq = 13;
update tblsubject set subjectperiod = 25 where seq = 37;

update tblsubject set name = '기초 오라클' where seq = 38;
update tblsubject set subjectperiod = 25 where seq = 38;

update tblsubject set name = '웹킷 계열 브라우저 반응형 웹 UI/UX 설계' where seq = 40;
update tblsubject set subjectperiod = 10 where seq = 40;

commit;

