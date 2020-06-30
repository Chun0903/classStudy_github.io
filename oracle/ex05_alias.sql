--ex05_alias.sql

/*

select 문

- select 절 : 컬럼을 지정하는 역할. 2번
- from 절 : 테이블을 지정하는 역할. 1번



*/

select * from tblcountry;
select * from tblinsa;


/*

별칭, Alias
- 컬럼, 테이블
1. 이름을 간소화시키기 위해서
2. 이름으로 올바르지 않은 이름을 가지는 경우 > 올바른 이름으로 수정

*/

-- > select 결과 -> 표 반환 -> 결과 테이블(Result Table) or 결과셋(ResultSet)
select name as 국가명, capital as 수도명 from tblcountry;         -- *******
select name 국가명, capital 수도명 from tblcountry;               -- 가독성 낮음
select name as "국가명", capital as "수도명" from tblcountry;     -- 상황에 따라
select name "국가명", capital "수도명" from tblcountry;           --가동성 낮음

select name as 국가명, capital as "국가 이름" from tblcountry;   
select name as "select" from tblcountry;

-- 함수의 결과값, 연산의 결과
select name, length(name) as length, area + 100 as area from tblcountry;

select name, population as pop from tblcountry;

select tblcountry.name from tblCountry;

select c.name from tblcountry c;

-- 조인
select m.name, w.name from tblMen m inner join tblWomen w on m.name = w.couple;



