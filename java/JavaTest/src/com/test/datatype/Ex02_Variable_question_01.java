package com.test.datatype;

public class Ex02_Variable_question_01 {
	
	public static void main(String[] args) {
		
		//문제, 9개 자료형 X 10문장-> 주변 데이터 검색 -> 자료형 선택 -> 변수 생성 -> 값을 대입 
		//-> 문장으로 출력하기
		
		//70kg -> 가장 적합한 자료형 찾기
		//- 45 ~ 130 -> 가형범위
		//- 70.5 ->실수형 
		
		double weight;
		weight = 70.5;
		System.out.println("제 몸무게는" + weight + "kg 입니다.");
		
		// 과제
		//byte
		byte catNumber;
		catNumber = 2;
		System.out.println("고양이" + catNumber + "마리를 키웁니다.");
		
		byte candy_number;
		candy_number = 8;
		System.out.println("사탕이" + candy_number +"개 있습니다.");
		
		byte weightDown;
		weightDown = -10;
		System.out.println("다이어트 성공으로" + weightDown + "kg을 감량했습니다.");

		byte kilograms;
		kilograms = 20;
		System.out.println("조카의 몸무개는" + kilograms + "kg 입니다.");
		
		byte panNumber;
		panNumber = 3;
		System.out.println("필통 안에 팬의 갯수는" + panNumber + "개 입니다");

		byte bunch;
		bunch = 100;
		System.out.println("꽃다발에 장미꽃이" + bunch + "송이 있습니다.");
		
		byte bouquet;
		bouquet = 2;
		System.out.println("졸업식에서 꽃다발을" + bouquet + "다발 받았습니다.");
		
		byte person;
		person = 30;
		System.out.println("동창회에" + person + "명이 참석했습니다.");

		byte kilometres;
		kilometres = 11;
		System.out.println("집까지" + kilometres + "km 남았습니다");
		
		byte classmate;
		classmate = 28;
		System.out.println("반 친구는 모두" + classmate + "명 입니다.");
		
		//short
		short dollar;
		dollar = 10000;
		System.out.println("자동차가" + dollar + "달러 입니다.");
		
		short won;
		won = 30000;
		System.out.println("저녁 값은" + won + "원 입니다." );
		
		short yen;
		yen = 1300;
		System.out.println("게임기가" + yen + "엔 입니다.");
		
		short euros;
		euros = 2520;
		System.out.println("여행비용이" + euros + "유로 들었습니다.");
		
		short pound;
		pound = 1890;
		System.out.println("빵의 가격이" + pound + "파운드 였습니다.");
		
		short rouble;
		rouble = 600;
		System.out.println("비행기 값이" + rouble + "루블 입니다.");
		
		short unit;
		unit = 249;
		System.out.println("지구에 국가는" + unit + "국가 존재합니다.");
		
		short year;
		year = 2002;
		System.out.println("올림픽이" + year + "년도에 열렸습니다.");
		
		short yearOfBirth;
		yearOfBirth = 1997;
		System.out.println("제 출생연도는" + yearOfBirth + "년 입니다.");
		
		short chapte;
		chapte = 1200;
		System.out.println("그 책은" + chapte + "페이지였습니다.");
		
		//int
		int populationKorea;
		populationKorea = 51470000;
		System.out.println("대한민국 인구 수는" + populationKorea + "명 입니다.");
		
		int millilitres;
		millilitres = 50000;
		System.out.println("일주일동안 물을" + millilitres + "ml 마셨습니다.");
		
		int populationVietnam;
		populationVietnam =95540000;
		System.out.println("베트남의 인구 수는" + populationVietnam + "명 입니다.");
		
		int areaChina;
		areaChina = 9597000;
		System.out.println("중국의 국토면적은" + areaChina + "km²입니다.");
		
		int areaRussia;
		areaRussia = 17100000;
		System.out.println("러시아의 국토면적은" + areaRussia + "km²입니다.");
		
		int membershipNaver;
		membershipNaver = 42000000;
		System.out.println("네이버의 회원수는" + membershipNaver + "명 입니다.");
		
		int yearOld;
		yearOld = 200000000;
		System.out.println("쥐라기는" + yearOld + "년 전 시대입니다.");
		
		int plant;
		plant = 650000000;
		System.out.println("나무" + plant + "그루를 심었습니다.");
		
		int petal;
		petal = 850000000;
		System.out.println("꽃잎" + petal + "개가 졌습니다.");
		
		int bring;
		bring = 760000000;
		System.out.println("젓가락" + bring + "개를 가져왔습니다.");
		
		//long
		long budget;
		budget = 4690000000000L;
		System.out.println("우리나라의 2019년 예산은" + budget + "원 입니다.");
		
		long collectTaxes;
		collectTaxes = 571000000000000000L;
		System.out.println("우리나라의 부과가치세는" + collectTaxes + "원 입니다.");
	
		long populationEarth;
		populationEarth = 7530000000L;
		System.out.println("전 세계 인구수는" + populationEarth + "명 입니다.");
		
		long investment;
		investment = 85400000000L;
		System.out.println("사장님이" + investment + "원을 투자했습니다.");
		
		long donate;
		donate =6780500000000L;
		System.out.println("부자가" + donate + "원을 기부했습니다.");
		
		long kilometresEarth;
		kilometresEarth = 4007500000L;
		System.out.println("지구의 둘레는" + kilometresEarth + "cm 입니다." );
		
		long areaSiberia;
		areaSiberia = 1310000000000L;
		System.out.println("시베리아의 국토 면적은" + areaSiberia + "cm²입니다.");
		
		long areaCanada;
		areaCanada = 998467000000L;
		System.out.println("캐나다의 국토 면적은" + areaCanada + "cm²입니다.");
		
		long areaUsa;
		areaUsa = 983351700000L;
		System.out.println("미국의 국토 면적은" + areaUsa + "cm²입니다.");
		
		long areaBrazil;
		areaBrazil = 851577000000L;
		System.out.println("미국의 국토 면적은" + areaBrazil + "cm²입니다.");
		
		//float 
		float circularConstant;
		circularConstant = 3.14F;
		System.out.println("원주율은" + circularConstant + "입니다.");
		
		float scoreone;
		scoreone = 98.5F;
		System.out.println("1학년 평균 점수는" + scoreone + "점 입니다.");
		
		float scoretwo;
		scoretwo = 86.4F;
		System.out.println("2학년 평균 점수는" + scoretwo + "점 입니다.");
		
		float scoreThree;
		scoreThree = 78.2F;
		System.out.println("3학년 평균 점수는" + scoreThree + "점 입니다.");
		
		float scoreFour;
		scoreFour = 82.7F;
		System.out.println("4학년 평균 점수는" + scoreFour + "점 입니다.");
		
		float scoreFive;
		scoreFive = 64.5F;
		System.out.println("5학년 평균 점수는" + scoreFive + "점 입니다.");
		
		float scoreSix;
		scoreSix = 58.5F;
		System.out.println("6학년 평균 점수는" + scoreSix + "점 입니다.");
		
		float approvalRatingA;
		approvalRatingA = 21.2F;
		System.out.println("A당의 지지율은" + approvalRatingA + "퍼센트 입니다.");
		
		float approvalRatingB;
		approvalRatingB = 11.5F;
		System.out.println("B당의 지지율은" + approvalRatingB + "퍼센트 입니다.");
		
		float approvalRatingC;
		approvalRatingC = 5.2F;
		System.out.println("C당의 지지율은" + approvalRatingC + "퍼센트 입니다.");
		
		//double
		double scoreA;
		scoreA = 59.3241683321313433;
		System.out.println("A반의 평균 점수는" + scoreA + "점 입니다.");
		
		double scoreB;
		scoreB = 21.516843213434634213;
		System.out.println("B반의 평균 점수는" + scoreB + "점 입니다.");
		
		double scoreC;
		scoreC = 85.1384653152463451;
		System.out.println("C반의 평균 점수는" + scoreC + "점 입니다.");
		
		double scoreD;
		scoreD = 31.54615384213582;
		System.out.println("D반의 평균 점수는" + scoreD + "점 입니다.");
		
		double scoreE;
		scoreE = 52.105343584121354121;
		System.out.println("E반의 평균 점수는" + scoreE + "점 입니다.");
		
		double scoreF;
		scoreF = 35.5463483213854321;
		System.out.println("F반의 평균 점수는" + scoreF + "점 입니다.");
		
		double scoreG;
		scoreG = 67.2135435157521341384;
		System.out.println("G반의 평균 점수는" + scoreG + "점 입니다.");		
		
		double scoreH;
		scoreH = 87.52464513485432132413512;
		System.out.println("H반의 평균 점수는" + scoreH + "점 입니다.");
		
		double scoreI;
		scoreI = 97.546845431324135105242135;
		System.out.println("I반의 평균 점수는" + scoreI + "점 입니다.");
		
		double scoreJ;
		scoreJ = 65.855134542522238753;
		System.out.println("J반의 평균 점수는" + scoreJ + "점 입니다.");
		
		//char
		char favoritePlace;
		favoritePlace = '강';
		System.out.println("제가 가장 좋아하는 곳은" + favoritePlace + "입니다.");
		
		char favoriteFood;
		favoriteFood = '떡';
		System.out.println("제가 가장 좋아하는 음식은" + favoriteFood + "입니다.");
		
		char classA;
		classA = '동';
		System.out.println("A반은" + classA + "쪽에 있습니다.");
		
		char classB;
		classB = '서';
		System.out.println("B반은" + classB + "쪽에 있습니다.");
		
		char classC;
		classC = '남';
		System.out.println("C반은" + classC + "쪽에 있습니다.");
		
		char classD;
		classD = '북';
		System.out.println("D반은" + classD + "쪽에 있습니다.");
		
		char placeSouth;
		placeSouth = '남';
		System.out.println("남대문은" + placeSouth + "쪽에 있습니다.");
		
		char placeNorth;
		placeNorth = '북';
		System.out.println("북대문은" + placeNorth + "쪽에 있습니다.");
		
		char placeEast;
		placeEast = '동';
		System.out.println("동대문은" + placeEast + "쪽에 있습니다.");
		
		char placeWest;
		placeWest = '서';
		System.out.println("서대문은" + placeWest + "쪽에 있습니다.");
		
		//boolean
		boolean favoriteAnimal;
		favoriteAnimal = true; 
		System.out.println("제일 좋아하는 동물은 고양이다." + favoriteAnimal);
		
		boolean man;
		man = true; 
		System.out.println("나는 사람이다." + man);
		
		boolean age;
		age = false; 
		System.out.println("나는 30살이다." + age);
		
		boolean height;
		height = false; 
		System.out.println("나는 키가 크다." + height);
		
		boolean fall;
		fall = true; 
		System.out.println("원숭이도 나무에서 떨어질 때가 있다." + fall);
		
		boolean proverb;
		proverb = true; 
		System.out.println("가는 말이 고와야 오는말이 곱다." + proverb);
		
		boolean tomato;
		tomato = false; 
		System.out.println("토마토는 과일이다." + tomato);
		
		boolean ranke;
		ranke = true; 
		System.out.println("랑케는 철학자다." + ranke);
		
		boolean dolphin;
		dolphin = false; 
		System.out.println("돌고래는 곤충이다." + dolphin);
		
		boolean breath;
		breath = false; 
		System.out.println("사람은 물 속에서 숨을 쉴 수 있다." + breath);
		
		//String
		String name;
		name = "천정주";
		System.out.println("내 이름은" + name + "다");
		
		String nameCat;
		nameCat = "냥이";
		System.out.println("고양이의 이름은" + nameCat + "다");
		
		String nameDog;
		nameDog = "복실이";
		System.out.println("강아지의 이름은" + nameDog + "다");
		
		String nameSnake;
		nameSnake = "네기니";
		System.out.println("뱀의 이름은" + nameSnake + "다");
		
		String nameOwl;
		nameOwl = "헤그리드";
		System.out.println("부엉이의 이름은" + nameOwl + "다");
		
		String namePig;
		namePig = "꿀꿀이";
		System.out.println("돼지의 이름은" + namePig + "다");
		
		String nameChick;
		nameChick = "짹짹이";
		System.out.println("병아리의 이름은" + nameChick + "다");
		
		String nameRabbit;
		nameRabbit = "토깽이";
		System.out.println("토끼의 이름은" + nameRabbit + "다");
		
		String namebear;
		namebear = "곰탱이";
		System.out.println("곰의 이름은" + namebear + "다");
		
		String namefox;
		namefox = "여우비";
		System.out.println("여우의 이름은" + namefox + "다");
		
		
		
	}
	
}
