-- ex04_operator.sql

/*

연산자, Operator

1. 산술 연산자
- +, -, *, /
- %(없음) -> 함수로 제공(mod())

2. 문자열 연산자
- concat
- +(X) -> ||(O)

3. 비교 연산자
- >, >=, <, <=
- =(==), <>(!=)
- 컬럼 리스트에서 사용 불가 > 조건절 사용

4. 논리 연산자
- and(&&), or(||), not(!)
- 컬럼 리스트에서 사용 불가 > 조건절 사용

5. 대입 연산자
- =
- 복합 연산자(++)X
- insert, update 문에서만 주로 사용

6. 3항 연산자
- 없음
- 유사한 행동 함수

7. 증감 연산자
- 없음
- num++ -> num = num + 1 (insert, update 문에서만 주로 사용)

8. SQL 연산자(절)
- in, between, like, is, any, all 등...

*/

--scott
select * from emp;
desc emp;

select ename, sal, sal + 100, 100, 10 + 20, sal / 3 from emp;

select 100 from emp;

select ename || ' ' || job from emp; --ORA-01722: invalid number

select empno, sal, empno > sal from emp;    --boolean 표현X 저장이 불가능한 자료형, 내부적으로만 사용 
select empno, sal from emp where empno > sal;   --주로 조건을 판단할 때 사용









