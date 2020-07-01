//ex11_object.js


/*

자바스크립트 객체
1. 내장 객체
    - Array, Date, Math 등..

2. BOM 객체
3. DOM 객체

4. 사용자 정의 객체
    - 클래스를 사용해서 객체를 생성하는 것과 유사 작업

사용자 정의 객체 생성
1. Object 클래스 사용
2. {} :객체 리터럴 사용(*****)


자바 + 홍길동 객체 생성

class User {
    private String name;
    private int age;
    private String address;
}

User hong = new User();
User lee = new User();



*/
var hong = new Object();    //무소유 순수 객체
hong.name = "홍길동";       //프로퍼티 생성
console.log(hong.name);
hong.age = 20;
hong.address = "서울시 강남구"
console.log(hong.age);
console.log(hong.address);
console.log(hong);

var lee = new Object();
lee.name = "이순신";
lee.age = 20;
lee.address = "서울시 강남구"
console.log(lee);

//객체 리터럴
var haha = {}; //new Object
haha.name = "하하하";
haha.age = 20;
haha.addredd = "서울시";

console.log(haha);

var hoho = {name: "호호호", age: 20, address: "서울시"};
console.log(hoho);

var huhu = {
    name : "후후후",
    age: 20,
    address: "서울시"
};

//프로퍼티 접근 방법
console.log(huhu.name);//읽기
huhu.name = "후후후후후후";//쓰기

console.log(huhu["name"]);  //읽기 - 연솬 배열 접근 방법(indexer)

huhu["gender"] = "남자";
huhu.height = 180;

huhu["mobile-number"] = "010"; //쓰지 말것 

console.log(huhu);

//프로퍼티 삭제

delete huhu.gender;
console.log(huhu);


//향상된 for문
// - 배열, 컬렉션 탐색(X)
// - 객체 프로퍼티 탐색(O)
// - 특정 객체가 가지고 있는 프로퍼티 목록을 탐색하는 제어문
 for (var p in huhu) {
     console.log(p);
 }

//객체(클래스) 멤버
//1. 변수
//2. 메소드

var hong = new Object();

hong.name = "홍길동";
hong.age = 20;

//익명 함수
hong.hello = function() {
    console.log("안녕하세요. 저는 " + this.name + "입니다.");
};

console.log(hong);
console.log(hong.name);
hong.hello();



var hong = {
    name : "홍길동",
    age : 20, 
    hello : function() {
        console.log("안녕~ 저는 " + this.name + "입니다.")
    }
};

hong.hello();

//서울시 강남구 역삼동 20번지
hong.address = "서울시 강남구 역삼동 20번지";

var hong = {
    name : "홍길동",
    age : 20, 
    hello : function() {
    },
    address:  {
        sido: "서울시",
        gugun: "강남구",
        dong: "역삼동",
        bunji: "20번지"
    },
    job: ["학생", "직장"]
    
}