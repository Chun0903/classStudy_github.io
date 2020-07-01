//ex09_date.js

//날짜 시간 자료형
// - new Date()
// - Object(자료형)

//현재 시각
var now = new Date(); //Calender.getInstance()
console.log(now.toLocaleString()); //2020-7-1 2:17:31 ├F10: PM┤

//c.get(Calendar.Year)
console.log(now.getYear());             //120(2000년 이전에 쓰던것)
console.log(now.getFullYear());         //2020
console.log(now.getMonth());            //6(0부터)
console.log(now.getDate());             //1
console.log(now.getDay());              //3(일(0) ~ 토(6))
console.log(now.getHours());            //14
console.log(now.getMinutes());          //20
console.log(now.getSeconds());          //23
console.log(now.getMilliseconds());     //0.408
console.log(now.getTime());             //1593580833956 틱값

//출력
console.log(now);
console.log(now.toString());
console.log(now.toLocaleString());

console.log(now.toLocaleDateString());
console.log(now.toLocaleTimeString());

//특정 시각 만들기
var christmas = new Date();
christmas.setMonth(11);             //c.set(Calender.MONTH, 11);
christmas.setDate(25);
console.log(christmas.toString());

var birthday = new Date(1990, 5, 20);
var birthday2 = new Date(1990, 5, 20, 12, 20, 30);

//연산
console.log(christmas - now); //15292800010

//오늘 + 100일
// console.log(now + 1);
//c.add(Calender.DATE, 100)L

var result = new Date();
result.setTime(now.getTime() + (100 * 24 * 60 * 60 *1000));
 now.getTime() + (100 * 24 * 60 * 60 *1000)