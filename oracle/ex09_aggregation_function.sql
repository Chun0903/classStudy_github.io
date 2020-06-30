--ex09_aggregation_function.sql



/*

메서드, 함수, 서브루틴, 프로시저 등..


집계함수, Aggregation Function
- 다량의 데이터를 대상으로 통계값을 구하는 함수

1. count()
2. sum()
3. avg()
4. max()
5. min()

1. count()
- select > 결과셋의 레코드 수를 반환한다.
- number count(대상컬럼)
- 매개변수에는 단 1개의 컬럼명을 넣을 수 있다.
- 예외로 *를 넣을 수 있다.
- null 은 제외한다.(***)

*/

select name from tblCountry;
select count(name) from tblCountry;

select name from tblInsa;
select count(name) from tblInsa;

select count(name) from tblInsa where city in ('서울','인천');  --29
select count(name) from tblinsa where ssn like '%-2%';        --29
select count(name) from tblinsa where ssn like '%-1%';        --31

select count(*) from tblcountry;
select count(name, capital) from tblCountry; --X

select population from tblcountry;
select count(population) from tblcountry;

select count(name) from tblCountry;         --14
select count(population) from tblcountry;   --13
select count(*) from tblCountry;

select * from tblTodo;
select count(*) from tblTodo;

-- 한일 갯수? 안할일 갯수?
select count(*) from tblTodo where completedate is not null;--12
select count(*) from tblTodo where completedate is null;    --8

select count(*), count(completedate), count(*)- count(completedate) from tblTodo;  --20,12,8

-- tblInsa, 총인원수? 연락처O? 연락처X ?
select 
    count(*) as 총인원수, 
    count(tel) as 연락처있음,
    count (*) - count(tel) as 연락처없음
from tblInsa;                           --60, 57, 3

--tblComedian. 남자 몇명? 여자 몇명?
select * from tblComedian;

select count(*) from tblComedian where gender ='m'; --8
select count(*) from tblComedian where gender ='f'; --2

select * from tblComedian;

select
    count(*) as 전체수,
    count(case 
        when gender = 'm' then 1
    end) as 남자수,
    count(case 
        when gender = 'f' then 1
    end) as 여자수 
from tblcomedian;


-- 모든 집계 함수 사용 시 주의할 점 > 에러 발생
-- 1. ORA-00937: not a single-group group function
-- 컬럼 리스트에 집계 함수와 단일 컬럼은 동시에 사용할 수 없다.
select count(*), name from tblInsa; 
select count(*) from tblInsa; 
select name from tblInsa; 

-- 2. ORA-00934: group function is not allowed here
-- where절에는 집계 함수를 사용할 수 없다.
-- where절의 개인에 대한 질문 -> 집합값 사용 불가능
select avg(basicpay) from tblInsa; --155만
select * from tblInsa where basicpay > avg(basicpay); 

select count(100) from tblInsa;

/*

2. sum()
- number sum(대상컬럼)
- 해당 컬럼값의 총합을 구한다.
- 숫자형에만 사용 가능(문자형X, 날짜형X)

*/

select sum(weight) from tblComedian;
select sum(first) from tblComedian; --문자열 ORA-01722: invalid number
select sum(ibsadate) from tblInsa;  --날짜시간 ORA-00932: inconsistent datatypes: expected NUMBER got DATE

select 
    sum(basicpay), sum(sudang),
    sum(basicpay) + sum(sudang),
    sum(basicpay + sudang)
from tblInsa;

select
    count(case 
        when gender = 'm' then 3    --의미없는 값, 존재O
    end),
    sum(case 
        when gender = 'm' then 3    --의미있는 값
    end) 
from tblcomedian;


/*

3. avg()
- number avg(대상컬럼)
- 해당 컬럼값의 평균값을 반환한다.
- 숫자형마 가능하다.

*/
select 
    avg(basicpay),
    sum(basicpay)/ count(*)    
from tblinsa;

select 
    avg(population),                    --15588
    sum(population)/ count(*),          --14475
    sum(population) / count(population) --15588
from tblcountry;

-- 회사 성과금 지급
-- 1. 균등 지급: 총지급액 / 모든 팀원수 = sum() / count(*)
-- 2. 차등 지급: 총지급액 / 참여 팀원수 = sum() / count(참여팀원) -> avg

/*

4. max()
5. min()
- object max(대상컬럼) : 최댓값 변환
- object min(대상컬럼) : 최솟값 변환
- 모든 자료형에 사용 가능
*/

select max(height), min(weight) from tblcomedian;   --숫자형
select max(name), min(name) from tblinsa;           --문자형
select max(ibsadate), min(ibsadate) from tblinsa;   --날짜시간형

select
    count(*) as '총 직원 수'
    sum(basicpay) as '총 급여 합'
    avg(basicpay) as '평균 급여'
    max(basicpay) as '최대 급여'
    min(basicpay) as '최소 급여'
from tblInsa
where buseo = '기획부';

--sum()
-- 1. tblCountry. 유럽과 아프리카에 속한 나라의 인수의 총합? 14,198 
select 
    sum(population)
from tblcountry
where continent in ('EU', 'AF');


-- 2. employees. 메니저(108)이 관리하고 있는 직원들의 급여 총합? 39,600
select 
    sum(salary)
from employees
where manager_id = 108;

-- 3. 직업(ST_CLERK, SH_CLERK)을 가지고 직원들의 급여 총합? 120,000
select 
    sum(salary)
from employees
where job_id in ('ST_CLERK','SH_CLERK');

-- 4. tblIna. 서울에 있는 직원들의 급여합(basicpay + sudang) 33,812,400
select 
    sum(basicpay + sudang)
from tblinsa
where city = '서울';

-- 5. 장급(부장, 과장)들의 급여 총함? 36,289.000
select 
    sum(basicpay)
from tblInsa
where jikwi in('부장','과장');

--avg()
-- 1. tblCountry. 아시아에 속한 국가의 평균 인구수? 39.165
select 
    avg(population) 
from tblcountry
where continent = 'AS';

-- 2. 장급(부장, 과장)들의 평균 급여? 2,419,266
select 
    avg(basicpay)
from tblInsa
where jikwi in('부장','과장');

-- 3. 장급(부장, 과장)들의 평균 급여와 사원급(대리,사원)의 평균 급여 차액? 1,150,320
select
    avg(case
        when jikwi in ('부장', '과장') then basicpay
    end)
    - 
    avg(case
        when jikwi in ('대리', '사원') then basicpay
    end)
from tblInsa;


-- max(), min()
-- 1. 면적이 가장 넓은 나라의 면적? 959
select * from tblcountry;

select 
    max(area) 
from tblcountry;

-- 2. 급여(basicpat + sudang)가 가장 적은 직원은 얼마를 받는지? 988,000
select 
    min(basicpay + sudang) 
from tblInsa;