select * from tblClass;
select * from tblsubject;
    
    
    -- 26~31
    
    /*
    26	자바(JAVA)를 활용한 풀스택 융합 SW개발자 양성과정(A)	6
        순서 = 1      sub = 1      
        순서 = 2      sub = 26    
        순서 = 3      sub = 32      
        
        순서 = 6      sub = 4            
        순서 = 7      sub = 5          
        순서 = 8      sub = 6           
        순서 = 10     sub = 8          
        
    27	자바(JAVA)를 활용한 풀스택 융합 SW개발자 양성과정(B)	5.5
        순서 = 1      sub = 19      
        순서 = 2      sub = 20     
        순서 = 3      sub = 21      
        
        순서 = 6      sub = 19            
        순서 = 7      sub = 20           
        순서 = 8      sub = 21           
    
    28	Java기반 멀티 플랫폼 SW개발자 양성 과정	            5.5     50일
        순서 = 1      sub = 22      
        순서 = 2      sub = 23      
        순서 = 3      sub = 25       
        
        순서 = 4      sub = 3            
        순서 = 5      sub = 6            
        순서 = 6      sub = 24            
 
    29	자바&파이썬 기반 멀티 웹 개발자 양성과정(A)	            5.5     50일
        순서 = 1      sub = 27     
        순서 = 2      sub = 28     
        순서 = 3      sub = 29    
        
        순서 = 4      sub = 2          
        순서 = 5      sub = 14            
        순서 = 6      sub = 15           
        순서 = 7      sub = 10           
        순서 = 8      sub = 11            
        순서 = 9      sub = 12   
    
    30	자바&파이썬 기반 멀티 웹 개발자 양성과정(B)	            7       80일
        순서 = 1      sub = 30       
        순서 = 2      sub = 31       
        순서 = 3      sub = 33  
        
        순서 = 4      sub = 13          
        순서 = 5      sub = 7            
        순서 = 6      sub = 40           
        순서 = 7      sub = 9  
        
        순서 = 8      sub = 16            
        순서 = 9      sub = 17  
        순서 = 10      sub = 18     
    
    31	Java&Python을 활용한 웹 애플리케이션 개발자 양성과정(A)	6       60일
        순서 = 1      sub = 37       
        순서 = 2      sub = 38      
        순서 = 3      sub = 39    
        
        순서 = 4      sub = 34          
        순서 = 5      sub = 35            
        순서 = 6      sub = 36   
    -----------------------------------------------------------------------
    32	Java&Python을 활용한 웹 애플리케이션 개발자 양성과정(B)	5.5
    33	자바 기반 모바일 융합SW 개발자 양성 과정	5.5
    34	IOT사물인터넷	7
    24	JAVA기반의 스마트 웹 앱콘텐츠 양성과정	6
    25	Java&JavaScript library을 활용한 반응 웹 개발자 양성 과정	6
    35	빅데이터개발-활용	7
    36	가상현실,증강현실(VR,AR)앱 실무자 양성과정	5.5
    37	오라클기반 프레임워크 개발자	5.5
    38	디지털컨버전스(Frontend)웹퍼블리셔/프론트엔드 취업과정	7
    
    */
    
    
select * from tblLectureSubject;

--     26	자바(JAVA)를 활용한 풀스택 융합 SW개발자 양성과정(A)	6
                            --      순서      과목      과정
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 1, 26);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 26, 26);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 32, 26);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 4, 26);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 5, 26);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 6, 26);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 7, 8, 26);
    
----------------------------------------------------------------------------

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 19, 27);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 20, 27);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 21, 27);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 41, 27);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 42, 27);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 43, 27);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 44, 27);
    
select * from tblsubject where seq = 44; 
update tblsubject set subjectperiod = 21 where seq = 44;
    
----------------------------------------------------------------------------

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 22, 28);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 23, 28);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 25, 28);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 3, 28);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 6, 28);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 24, 28);
    
----------------------------------------------------------------------------

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 27, 29);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 28, 29);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 29, 29);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 2, 29);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 14, 29);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 15, 29);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 7, 10, 29);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 8, 11, 29);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 9, 12, 29);
    
----------------------------------------------------------------------------

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 30, 30);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 31, 30);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 33, 30);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 13, 30);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 7, 30);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 40, 30);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 7, 9, 30);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 8, 16, 30);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 9, 17, 30);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 10, 18, 30);
    
----------------------------------------------------------------------------

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 37, 31);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 38, 31);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 39, 31);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 34, 31);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 35, 31);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 36, 31);
    
----------------------------------------------------------------------------

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 27, 32);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 28, 32);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 29, 32);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 2, 32);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 14, 32);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 15, 32);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 7, 10, 32);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 8, 11, 32);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 9, 12, 32);
    
----------------------------------------------------------------------------

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 27, 33);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 28, 33);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 29, 33);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 2, 33);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 14, 33);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 15, 33);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 7, 10, 33);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 8, 11, 33);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 9, 12, 33);
    
----------------------------------------------------------------------------

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 30, 34);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 31, 34);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 33, 34);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 13, 34);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 7, 34);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 40, 34);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 7, 9, 34);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 8, 16, 34);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 9, 17, 34);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 10, 18, 34);
    
    
----------------------------------------------------------------------------

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 37, 24);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 38, 24);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 39, 24);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 34, 24);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 35, 24);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 36, 24);
    
----------------------------------------------------------------------------

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 37, 25);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 38, 25);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 39, 25);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 34, 25);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 35, 25);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 36, 25);
    
----------------------------------------------------------------------------

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 30, 35);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 31, 35);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 33, 35);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 13, 35);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 7, 35);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 40, 35);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 7, 9, 35);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 8, 16, 35);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 9, 17, 35);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 10, 18, 35);
    
----------------------------------------------------------------------------    
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 27, 36);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 28, 36);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 29, 36);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 2, 36);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 14, 36);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 15, 36);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 7, 10, 36);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 8, 11, 36);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 9, 12, 36);
    
----------------------------------------------------------------------------  
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 27, 37);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 28, 37);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 29, 37);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 2, 37);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 14, 37);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 15, 37);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 7, 10, 37);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 8, 11, 37);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 9, 12, 37);
    
----------------------------------------------------------------------------

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 1, 30, 38);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 2, 31, 38);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 3, 33, 38);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 4, 13, 38);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 5, 7, 38);

insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 6, 40, 38);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 7, 9, 38);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 8, 16, 38);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 9, 17, 38);
    
insert into tblLectureSubject (seq, ord, subjectseq, classseq)
    values (tblLectureSubject_seq.nextVAl, 10, 18, 38);
    

select subjectseq, count(*) from tblLectureSubject
    group by subjectseq
        order by subjectseq;
    
select  * from tblLectureSubject where subjectseq = 6;

update tblLectureSubject set subjectseq = 45 where seq = 12;

select * from tblSubject
    where seq = 8;

select * from tblSubject;

--select * from tblCustomer c 
--    inner join tblSales s 
--        on c.seq = s.cseq;  -- 부모테이블(PK) - 자식테이블 (FK)

select l.classseq, sum(s.subjectperiod) from tblLectureSubject l
    inner join tblSubject s
        on l.subjectseq = s.seq
            group by l.classseq
                order by l.classseq;

select * from tblopensubject;

commit;

select * from tblopensubject
    where openclassseq = 2;


select * from tblopenclass;
select * from tblclass;

insert into tblOpenSubject values(tblOpenSubject_seq.nextVal, '20/04/04', '20/04/22', 2, 19);
insert into tblOpenSubject values(tblOpenSubject_seq.nextVal, '20/04/23', '20/05/15', 2, 20);
insert into tblOpenSubject values(tblOpenSubject_seq.nextVal, '20/05/16', '20/06/04', 2, 21);
insert into tblOpenSubject values(tblOpenSubject_seq.nextVal, '20/06/05', '20/06/14', 2, 41);
insert into tblOpenSubject values(tblOpenSubject_seq.nextVal, '20/06/15', '20/06/25', 2, 42);
insert into tblOpenSubject values(tblOpenSubject_seq.nextVal, '20/06/26', '20/07/12', 2, 43);
insert into tblOpenSubject values(tblOpenSubject_seq.nextVal, '20/07/13', '20/07/28', 2, 44);

select * from tblsubject where seq = 42;

select * from tblpoint;

select * from tbltest;
delete tbltest;

commit;

select * from tbltest;
    