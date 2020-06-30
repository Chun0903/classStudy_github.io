package com.test.testRCM;

import java.util.ArrayList;
import java.util.List;

class rcmMusicListMain {
	
	private String title; 		//노래 제목
	private String singer;	//가수 이름
	private String genre1;	//장르1
	private String genre2;	//장르2	
	private int playNum;	//재생횟수
	private int love;			//좋아요
	

	//생성자
	public rcmMusicListMain(String title, String singer, String genre1, String genre2, int playNum, int love) {
		super();
		this.title = title;
		this.singer = singer;
		this.genre1 = genre1;
		this.genre2 = genre2;
		this.playNum = playNum;
		this.love = love;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre1() {
		return genre1;
	}

	public void setGenre1(String genre1) {
		this.genre1 = genre1;
	}

	public String getGenre2() {
		return genre2;
	}

	public void setGenre2(String genre2) {
		this.genre2 = genre2;
	}

	public int getPlayNum() {
		return playNum;
	}

	public void setPlayNum(int playNum) {
		this.playNum = playNum;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}
	
	
	//toString
	@Override
	public String toString() {
		return String.format("(%s - %s,%s,%s,%d,%d)\n"
				, this.title, this.singer, this.genre1, this.genre2 ,this.playNum,this.love);
	}
	
	
	//myplayList List 가져오는 메소드
	public static List<rcmMusicListMain> getList() {

		List<rcmMusicListMain> list = new ArrayList<rcmMusicListMain>();
		List<String> fileList = new ArrayList<String>();
		
		fileList = getArrByFile("내뮤직파일명"); //jin 알아서 읽어요
		
		//jin fileList -> 여기에서 파일 읽어와 
		for(int i=0; i<fileList.size(); i++) {
			String[] fileData = fileList.get(i).split(",");
			list.add(new rcmMusicListMain(fileData[0], fileData[1], fileData[2], fileData[3], Integer.parseInt(fileData[4]), Integer.parseInt(fileData[5])));
		}

		/*
		list.add(new MusicList("가", "A", "댄스", "EDM", 1, 10));
		list.add(new MusicList("나", "A", "댄스", "발라드", 11, 10));
		list.add(new MusicList("다", "A", "댄스", "발라드", 2, 10));
		list.add(new MusicList("라", "A", "댄스", "발라드", 9, 10));
		list.add(new MusicList("바", "B", "댄스", "발라드", 12, 10));
		list.add(new MusicList("사", "B", "댄스", "밴드", 14, 10));
		list.add(new MusicList("아", "B", "댄스", "밴드", 3, 10));
		list.add(new MusicList("자", "B", "댄스", "밴드", 13, 10));
		list.add(new MusicList("차", "B", "댄스", "캐롤", 15, 10));
		list.add(new MusicList("카", "B", "댄스", "캐롤", 4, 10));
		list.add(new MusicList("타", "C", "댄스", "클래식", 17, 10));
		list.add(new MusicList("파", "C", "댄스", "재즈", 19, 10));
		list.add(new MusicList("하", "C", "댄스", "OST", 24, 10));
		list.add(new MusicList("기", "C", "댄스", "POP", 5, 10));
		list.add(new MusicList("니", "D", "댄스", "EDM", 8, 10));
		list.add(new MusicList("디", "D", "댄스", "EDM", 26, 10));
		list.add(new MusicList("리", "D", "댄스", "EDM", 6, 10));
		list.add(new MusicList("미", "E", "OST", "EDM", 28, 10));
		list.add(new MusicList("비", "E", "OST", "EDM", 7, 10));
		list.add(new MusicList("시", "F", "트로트", "EDM", 30, 10));
		list.add(new MusicList("이", "G", "락", "EDM", 38, 10));
		*/
		
		return list;
				
	}
	
	//같은나이대 사람들 리스트 불러오기 getAgeAllList
	public static List<rcmMusicListMain> getAgeAllList() {

		List<rcmMusicListMain> list = new ArrayList<rcmMusicListMain>();

		int i=0;
		
		String[] stLogInInfoArr = getArrByFile("로그인한파일정보파일명").get(0).split(","); //jin 로그인한 회원정보 파일 가져와서 리턴
		String wkAge = stLogInInfoArr[3].substring(0, 1); //27세일 경우 "2", 32세일 경우 "3"
		
		List<String> memInfoArr = new ArrayList<String>();
		List<String> memFileNameArr = new ArrayList<String>();
		List<String> memFileMusicArr = new ArrayList<String>();
		
		String[] stMemInfo;
		String[] fileData;
		
		//1.회원정보 File 읽어오기
		memInfoArr = getArrByFile("회원정보파일명"); //jin 회원정보File 읽어와서 넣어요
	
		//2. 전체 회원정보 중 특정 나이대 회원의 MusicList의 이름 가져오기
		for(i=0; i<memInfoArr.size(); i++) {
			stMemInfo = memInfoArr.get(i).split(",");
			if(wkAge.equals( stMemInfo[3].substring(0, 1))) {
				memFileNameArr.add(stMemInfo[0].concat("_FILENAME")); // 파일명 : 회원ID_FILENAME의 경우 //jin 파일명 수정하렴
			}
		}
		
		//3. 파일명으로 파일 읽어와서 memFileMusicArr에 몽땅 넣기
		for(i=0; i<memFileNameArr.size(); i++) {	
			 memFileMusicArr.addAll(getArrByFile(memFileNameArr.get(i)));
		}
		
		//4. 읽어온 파일을 LayOut에 맞게 생성자로 MusicList Class 초기화하며 생성
		for(i=0; i<memFileMusicArr.size(); i++) {
			fileData = memFileMusicArr.get(i).split(",");
			list.add(new rcmMusicListMain(fileData[0], fileData[1], fileData[2], fileData[3], Integer.parseInt(fileData[4]), Integer.parseInt(fileData[5])));
		}

		/*
		list.add(new MusicList("가", "A", "댄스", "EDM", 1, 10));
		list.add(new MusicList("나", "A", "댄스", "발라드", 11, 10));
		list.add(new MusicList("다", "A", "댄스", "발라드", 2, 10));
		list.add(new MusicList("라", "A", "댄스", "발라드", 9, 10));
		list.add(new MusicList("바", "B", "댄스", "발라드", 12, 10));
		list.add(new MusicList("사", "B", "댄스", "밴드", 14, 10));
		list.add(new MusicList("아", "B", "댄스", "밴드", 3, 10));
		list.add(new MusicList("자", "B", "댄스", "밴드", 13, 10));
		list.add(new MusicList("차", "B", "댄스", "캐롤", 15, 10));
		list.add(new MusicList("카", "B", "댄스", "캐롤", 4, 10));
		list.add(new MusicList("타", "C", "댄스", "클래식", 17, 10));
		list.add(new MusicList("파", "C", "댄스", "재즈", 19, 10));
		list.add(new MusicList("하", "C", "댄스", "OST", 24, 10));
		list.add(new MusicList("기", "C", "댄스", "POP", 5, 10));
		list.add(new MusicList("니", "D", "댄스", "EDM", 8, 10));
		list.add(new MusicList("디", "D", "댄스", "EDM", 26, 10));
		list.add(new MusicList("리", "D", "댄스", "EDM", 6, 10));
		list.add(new MusicList("미", "E", "OST", "EDM", 28, 10));
		list.add(new MusicList("비", "E", "OST", "EDM", 7, 10));
		list.add(new MusicList("시", "F", "트로트", "EDM", 30, 10));
		list.add(new MusicList("이", "G", "락", "EDM", 38, 10));
		*/
		return list;
				
	}
	
	//전체 리스트 불러오기 getAllList
	public static List<rcmMusicListMain> getAllList() {

		List<rcmMusicListMain> list = new ArrayList<rcmMusicListMain>();

		//jin test start
		List<String> testAllFileMusicArr = getArrByFile("전체파일명");
		
		String[] fileData;
		for(int i=0; i<testAllFileMusicArr.size(); i++) {
			fileData = testAllFileMusicArr.get(i).split(",");
			list.add(new rcmMusicListMain(fileData[0], fileData[1], fileData[2], fileData[3], Integer.parseInt(fileData[4]), Integer.parseInt(fileData[5])));
		}
		//jin test end
		//jin 나중에 지우고 채우시오
		
		return list;
				
	}
	//=================================================================================================================================
	
	//장르1
	public static List<String> getL1Genres() {
		
		List<String> list = new ArrayList<String>();
		List<rcmMusicListMain> musicLists = getList();
		
		for(rcmMusicListMain musicList : musicLists) {
			list.add(musicList.getGenre1());
		}
		return list;
	}
	
	public static List<String> getL2Genres() {
		
		List<String> list = new ArrayList<String>();
		List<rcmMusicListMain> musicLists = getList();
		
		for(rcmMusicListMain musicList : musicLists) {
			list.add(musicList.getGenre2());
		}
		return list;
	}
	
	/*
	public static List<String> getTitles(){
		
		List<String> list = new ArrayList<String>();
		List<rcmMusicListMain> musicLists = getList();
		
		for(rcmMusicListMain musicList : musicLists) {
			list.add(musicList.getTitle());
		}
		return list;
	}
	*/
	
	public static List<String> getSingers(String pMessage){
		
		List<String> list = new ArrayList<String>();
		
		List<rcmMusicListMain> musicLists = null;
		if("1".equals(pMessage) ) {
			musicLists = getList();
		}else {
			musicLists = getAgeAllList();
		}
		
		for(rcmMusicListMain musicList : musicLists) {
			list.add(musicList.getSinger());
		}
		return list;
	}
	
	/*
	public static List<Integer> getPlayNums(){
		
		List<Integer> list = new ArrayList<Integer>();
		List<rcmMusicListMain> musicLists = getList();
		
		for(rcmMusicListMain musicList : musicLists) {
			list.add(musicList.getPlayNum());
		}
		return list;
	}
	*/
	
	public static List<String> getGenreCtg(){
		
		List<String> genreList = new ArrayList();
		genreList.add("발라드");
		genreList.add("댄스");
		genreList.add("밴드");
		genreList.add("클래식");
		genreList.add("락");
		genreList.add("RNB");
		genreList.add("컨트리");
		genreList.add("OST");
		genreList.add("트로트");
		genreList.add("EDM");
		genreList.add("재즈");
		genreList.add("POP");
		genreList.add("캐롤");
		
		return genreList;
	}
	
	
	//jin 파일명으로 파일 읽어와서  Arr로 리턴
	public static List<String> getArrByFile(String pFileName){
		
		List<String> memMusicList = new ArrayList();

		//파일 읽어와서 List<String>로 리턴
		
		//jin test 절취선 start
		if ("내뮤직파일명".equals(pFileName)) {
			// jin 잘해라
			memMusicList.add("가,A,댄스,EDM,1,10");
			memMusicList.add("나,A,댄스,발라드,11,10");
			memMusicList.add("다,A,댄스,발라드,2,10");
			memMusicList.add("라,A,댄스,발라드,9,10");
			memMusicList.add("바,B,댄스,발라드,12,10");
			memMusicList.add("사,B,댄스,밴드,14,10");
			memMusicList.add("아,B,댄스,밴드,3,10");
			memMusicList.add("자,B,댄스,밴드,13,10");
			memMusicList.add("차,B,댄스,캐롤,15,10");
			memMusicList.add("카,B,댄스,캐롤,4,10");
			memMusicList.add("타,C,댄스,클래식,17,10");
			memMusicList.add("파,C,댄스,재즈,19,10");
			memMusicList.add("하,C,댄스,OST,24,10");
			memMusicList.add("기,C,댄스,POP,5,10");
			memMusicList.add("니,D,댄스,EDM,8,10");
			memMusicList.add("디,D,댄스,EDM,26,10");
			memMusicList.add("리,D,댄스,EDM,6,10");
			memMusicList.add("미,E,OST,EDM,28,10");
			memMusicList.add("비,E,OST,EDM,7,10");
			memMusicList.add("시,F,트로트,EDM,30,10");
			memMusicList.add("이,G,락,EDM,38,10");
		}else if ("전체파일명".equals(pFileName)) {
			memMusicList.add("전가,A,댄스,EDM,1,10");
			memMusicList.add("전나,A,댄스,발라드,11,10");
			memMusicList.add("전다,A,댄스,발라드,2,10");
			memMusicList.add("전라,A,댄스,발라드,9,10");
			memMusicList.add("전바,B,댄스,발라드,12,10");
			memMusicList.add("전사,B,댄스,밴드,14,10");
			memMusicList.add("전아,B,댄스,밴드,3,10");
			memMusicList.add("전자,B,댄스,밴드,13,10");
			memMusicList.add("전차,B,댄스,캐롤,15,10");
			memMusicList.add("전카,B,댄스,캐롤,4,10");
			memMusicList.add("전타,C,댄스,클래식,17,10");
			memMusicList.add("전파,C,댄스,재즈,19,10");
			memMusicList.add("전하,C,댄스,OST,24,10");
			memMusicList.add("전기,C,댄스,POP,5,10");
			memMusicList.add("전니,D,댄스,EDM,8,10");
			memMusicList.add("전디,D,댄스,EDM,26,10");
			memMusicList.add("전리,D,댄스,EDM,6,10");
			memMusicList.add("전미,E,OST,EDM,28,10");
			memMusicList.add("전비,E,OST,EDM,7,10");
			memMusicList.add("전시,F,트로트,EDM,30,10");
			memMusicList.add("전이,G,락,EDM,38,10");
		}
		//jin test 절취선 end
		
		return memMusicList;
	}
	
}