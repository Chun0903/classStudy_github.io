-- 스크립트 파일(*sql) 

/*

 

D:\class\oracle\ex01.sql

 

오라클 계정

1. system(sys)

    - 최고 관리자

2. hr

    - 학습용 계정

3. scott

    - 학습용 계정

 

잠긴 계정 활성화하기

- 권한이 있는 유저(관리자)가 한다.

- system

 

alert user 유저명 account unlock; --계정 풀기

alert user 유저명 account lock; --계정 잠그기

 

 

암호 바꾸기

- 권한이 있는 유저만 실행 가능

- alter user 유저명 identified by 암호;

- alter user hr identified by 암호;

 

*/

 

alter user hr account unlock;

alter user hr identified by java1234;

 

select * from tabs;

 

 

 

SET TERMOUT ON

SET ECHO ON

 

alter user scott account unlock;

alter user scott identified by java1234;

 

alter user scott account unlock identified by java1234;

 

/*

 

데이터 베이스, Database

오라클, Oracle

- 회사명, 제품명

- 데이터 베이스(Database) -> 데이터베이스 관리시스템(Database Management System)

    -> 관계형 데이터 베이스 관리시스템(Relation Database Management System > RDBMS)

 

데이터 베이스

- 데이터의 집합

 

관계형 데이터 베이스 관리시스템의 종류(RDBMS)

1. Oracle

    - Oracle

    - 기업용

    

2. MS-SQL

    - Microsoft

    - 기업용

 

3. MySQL

    - Oracle

    - 개인용 + 기업용

    

4. MariaDB

    - MySQL 기반

    - 무료

    - 개인용 + 기업용

    

5. PostgreSQL

    - 무료

    - 개인용 + 기업용

    

6. DB2

    - IBM

    - 메인 프레임

    

7. Access

    - MS

    - 개인용 + 소규모 기업

    

8. 티베로(DBMS)

    - 티맥스(TMax)

    - 제우스(웹서버)

 

9. SQLite

    - 경량

    - 모바일 등

    

 

데이터베이스 클라이언트 툴

1. SQL Developer

     - 무료

     - Oracle

     

2. Toad(두꺼비)

 

3. SQLGate

 

4. DataGrip(JetBrain) - 30일 평가판 > 대학교 이메일

 

5. SQL*Plus

    - 오라클 설치하면 기본 설치 되는 툴

    - CLI(Commend Line Interface)

    - cmd > sqlplus > hr + java1234 > select * from tabs;

 

오라클 에디션 + 버전

 

 

 

프로젝트 > 다른 컴퓨터의 오라클 접속

1. 오라클 서버 > 방화벽 열기(1521)

2. 접속 생성

 

SQL, Structured Query Language

- SQL == Query

- 질의를 목적으로 만들어진 언어

- 자바에 비해 자연어에 가깝다. 

 

1. DBMS와 SQL은 서로 독립적이다.

    - 표준 SQL(ANSI-SQL)

    - 표준 SQL은 모든 DBMS에서 공통으로 사용한다.

    - SQL-86 > SQL89 > ......SQL99>SQL2011

2. 대화식 언어이다.

    -질문 > 답변 > 질문 > 답변 x 반복

    

오라클 = ANS-92/99 + PL/SQL

 

ANSI SQL 종류

1. DDL

    - Data Definition Language

    - 데이터 정의어

    - 구조를 만드는 명령어

    - 테이블, 뷰, 사용자, 인덱스 등의 객체를 생성/수정/삭제하는 명령어

    a. create : 생성

    b. drop : 삭제

    c. alter : 수정

    - 데이터베이스 관리자

    - 데이터베이스 담당자

    - 프로그래머(일부)

2. DML

    - Data Manipulation Language

    - 데이터 조작어

    - 데이터 베이스의 데이터 추가/수정/삭제/조회 명령어

    - CRUD(Create, Read, Update, Delete)

    a. select : 읽기(****************)

    b. insert : 추가

    c. update : 수정

    d. delete : 삭제

    - 데이터베이스 관리자

    - 데이터베이스 담당자

    - 프로그래머(*********************)

3. DCL

4. DQL

5. TCL

 

 

 

*/
