//ex08_string.js

//문자열 함수
var txt = "Hello~ Hong~ Hong~"

//1. 문자열 길이
console.log(txt.length); //프로퍼티(Property)

//2. 검색
// - indexOd()
// - lastIndexOf()
console.log(txt.indexOf("~"));      //5
console.log(txt.indexOf("~",6));    //11
console.log(txt.indexOf("?"));      //-1
console.log(txt.lastIndexOf("~"));  //11

//3. 대소문자 변환
console.log(txt.toUpperCase());
console.log(txt.toLocaleLowerCase());

//4. 치환
// - 처음 만나는 요소만 치환(반복X)
// - 정규 표현식을 사용하면 반복 가능
console.log(txt.replace("Hong~","홍길동")); //Hello~ 홍길동 Hong~
console.log(txt.replace(/Hong/gi,"홍길동")); //Hello~ 홍길동 홍길동

//5. 범위 추출 (Hello~ Hong~ Hong~)
console.log(txt.substring(2,8));    //llo~ H
console.log(txt.substring(2));      //llo~ Hong~ Hong~

console.log(txt.substr(2,8));       //llo~ Hon //2번부터 8글자
console.log(txt.substr(2));         //llo~ Hong~ Hong~

//6. 공백 제거
console.log("    하나    둘    ".trim()); //"하나    둘"

//7. 분할
var result = "홍길동,아무개,하하하,호호호".split(",");
console.log(typeof result); //object
console.log(result[0]);
console.log(result[3]);
//[ '홍길동', '아무개', '하하하', '호호호' ]

//8. charAt
console.log(txt.charAt(1)); //e
console.log(txt.charCodeAt(1)); //101(문자 코드값)

//9. startsWith / endsWith
console.log(txt.startsWith("Hello"));   //101
console.log(txt.startsWith("홍"));      //false

console.log(txt.endsWith("~"));   //true

//bold(안씀)
console.log(txt.bold());    //<b>Hello~ Hong~ Hong~</b>




