select * from tblteacher;

select * from tblsubject;

select * from tblPossible;


desc tblPossible;
insert into tblPossible (SEQ,TEACHERSEQ,SUBJECTSEQ)   values (1,1,10);
INSERT INTO tblPossible(SEQ, TEACHERSEQ, SUBJECTSEQ) VALUES (tblPossible_seq.NEXTVAL,1,15);

drop SEQUENCE tblPossible_seq;
create SEQUENCE tblPossible_seq;
delete tblPossible;


/*
3
4
5
6
7
8
9
10
1
2

*/

/*
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40

*/