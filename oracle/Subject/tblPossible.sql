drop SEQUENCE tblPossible_seq;
create SEQUENCE tblPossible_seq;
delete tblPossible;

select * from tblopenClass;

select * from tblPossible where teacherseq = 1;
select teacherseq, count(subjectseq) from tblpossible
    group by teacherseq;

--select teacherseq||subjectseq, count(*) from tblpossible        -- 선생님별 중복과목들어가있나 확인
--    group by teacherseq||subjectseq;

select teacherseq||subjectseq, count(*) from tblpossible        -- 선생님별 중복과목
    group by teacherseq||subjectseq
        having count(*) > 1;    
    
select * from tblpossible where teacherseq||subjectseq = 41;   -- 중복과목있는 목록 확인(seq 확인용)

delete tblpossible where seq = 185;                              -- 중복과목있는 seq 삭제

select * from tblpossible;



-- 커서를 반환한 프로시저를 호출하기