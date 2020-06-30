package com.project.recommend;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class rcmMusicListMain {
	
	private String title; 		//노래 제목
	private String singer;	//가수 이름
	private String genre1;	//장르1
	private String genre2;	//장르2	
	private int playNum;	//재생횟수
	private int love;			//좋아요
	
	private static String gv_id = "hoit80605";
	//private static String gv_age = "14";
	private static String gv_age = "24";
	
	
//	private static String gv_AllId = AllName;
	
	private static String gv_dirMemPath 	= "F:\\더미\\회원\\";
	private static String gv_dirMusicPath 	= "F:\\더미\\music\\";
	
	
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
	
	public static String getAge() {
		return gv_age;
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
		List<String> myPlayList = new ArrayList<String>();
		List<String> myPlaySongInfo = new ArrayList<String>();
		
		String dirPath1 = gv_dirMemPath + gv_id; //회원 플레이리스트 Dir
		String fileName1 = gv_id + "playlist.txt"; //회원 플레이리스트 FileName
		
		String[] mp3Nm;
		String[] mp3Info;
		
		// ID에 해당하는 PlayList를 가지고 온다.
		myPlayList = getArrByFile(dirPath1,fileName1);

		String stSongNm = "";
		String stSongInfo = "`";
		for(int i=0; i < myPlayList.size(); i++) {
			stSongNm = myPlayList.get(i); //노래제목-가수.mp3
			myPlaySongInfo = new ArrayList<String>();
			myPlaySongInfo = getArrByFile(gv_dirMusicPath,stSongNm);
			stSongInfo = myPlaySongInfo.get(0);
			
			mp3Nm = stSongNm.split("-");
			mp3Info = stSongInfo.split(","); 
			
			list.add(new rcmMusicListMain(mp3Nm[0], mp3Nm[1].replace(".mp3", ""), mp3Info[0], mp3Info[1], Integer.parseInt(mp3Info[2]), Integer.parseInt(mp3Info[3])));
		}
		return list;
	}
	
	//전체 회원 아이디 가져오기
	public static List<File>  gatAllName() {
		
		//전체 회원 아이디 저장
		List<File> playlist = new ArrayList<File>();
		
		File file = new File(gv_dirMemPath);
		File[] mems = file.listFiles();
		
		for(File member : mems) {
			
			System.out.println(member.getName());
			String path2 = gv_dirMemPath +member.getName() + "\\" + member.getName() + "playlist.txt";
			System.out.println(path2);
			
			File file2 = new File(path2);
			
			playlist.add(file2);
			
			
		}
		
		return playlist;
	}
	
	
	//같은나이대 사람들 리스트 불러오기 getAgeAllList
	public static List<rcmMusicListMain> getAgeAllList() {

		List<rcmMusicListMain> list = new ArrayList<rcmMusicListMain>();
		List<String> memFileMusicArr = new ArrayList<String>();
		int i = 0;
		
		String[] stMemInfo;
		
		String dirPath1;// = "E:\\더미\\회원\\" + id; //회원 Dir
		String fileName1;// = id + ".txt"; //회원 정보 FileName
		String fileName2; //회원 플레이리스트 FileName
		
		//1.회원정보 File 읽어오기
		File file = new File(gv_dirMemPath);
	    File[] mlist = file.listFiles();
	    
	    String stMem;
	    String stId;
	    
	    for(i=0; i < mlist.length; i++) {
	    	stId = mlist[i].getName();
	    	dirPath1 = gv_dirMemPath + stId;
			fileName1 = stId + ".txt";
			fileName2 = stId + "playlist.txt";
			
			stMem = getArrByFile(dirPath1, fileName1).get(0);
			stMemInfo = stMem.split(",");
			
			// 나이 앞자리수가 같은 회원 ID 추출
			if(gv_age.substring(0, 1).equals( stMemInfo[3].substring(0, 1))) {
				//memArr.add(stId);
				//나이대가 같은 회원의 플레이리스트 더하기 
				memFileMusicArr.addAll(getArrByFile(dirPath1,fileName2));
			}
	    }
	    
	    String[] wkMp3;
	    String[] wkMp3Info;
	    String stMpInfo;
		//4. 읽어온 파일을 LayOut에 맞게 생성자로 MusicList Class 초기화하며 생성
		for(i=0; i<memFileMusicArr.size(); i++) {
			wkMp3 = memFileMusicArr.get(i).split("-");
			
			stMpInfo = getArrByFile(gv_dirMusicPath, memFileMusicArr.get(i)).get(0);
			wkMp3Info = stMpInfo.split(",");
    		list.add(new rcmMusicListMain(wkMp3[0], wkMp3[1].replace(".mp3", ""), wkMp3Info[0], wkMp3Info[1], Integer.parseInt(wkMp3Info[2]), Integer.parseInt(wkMp3Info[3])));
    	}
		return list;
	}
	
	//전체 리스트 불러오기 getAllList
	public static List<rcmMusicListMain> getAllList() {

		List<rcmMusicListMain> list = new ArrayList<rcmMusicListMain>();

//		//jin test start
//		List<String> testAllFileMusicArr = getArrByFile("전체파일명");
//		
//		String[] fileData;
//		for(int i=0; i<testAllFileMusicArr.size(); i++) {
//			fileData = testAllFileMusicArr.get(i).split(",");
//			list.add(new rcmMusicListMain(fileData[0], fileData[1], fileData[2], fileData[3], Integer.parseInt(fileData[4]), Integer.parseInt(fileData[5])));
//		}
//		//jin test end
//		//jin 나중에 지우고 채우시오
		
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
	//public static List<String> getArrByFile(File pFile){
	public static List<String> getArrByFile(String pPath, String pFileName){
		
		String fillInfo = pPath+"\\"+pFileName;
		File file = new File(fillInfo);
		
		List<String> arrList = new ArrayList<String>();

		String line = null;		
		try {
    		BufferedReader reader = new BufferedReader(new FileReader(file));
    		while ((line = reader.readLine()) != null) {
    			arrList.add(line);
    		}
    		reader.close();
    		
    	} catch (Exception e) {
    		System.out.println("파일 리드에 실패했습니다.");
    		System.out.println(e);
    	}
    
		
		return arrList;
	}
	
	public static List<rcmMusicListMain> getAllMusic()  {
	      
		List<rcmMusicListMain> list = new ArrayList<rcmMusicListMain>();
		
	    String path = gv_dirMusicPath; //음악파일
	      
	    File file = new File(path);
	    File[] mlist = file.listFiles();
	    List<String> arrfile = new ArrayList<String>();

	    String[] wkMp3;
	    String[] wkMp3Memo;

	    for(int i=0; i<mlist.length; i++) {
	    	wkMp3 = mlist[i].getName().split("-");

	    	arrfile = getArrByFile(mlist[i].getParentFile().getPath(), mlist[i].getName());
	    	
	    	for(int j=0; j < arrfile.size(); j++) {
	    		wkMp3Memo = arrfile.get(j).split(",");
    			list.add(new rcmMusicListMain(wkMp3[0], wkMp3[1].replace(".mp3", ""), wkMp3Memo[0], wkMp3Memo[1], Integer.parseInt(wkMp3Memo[2]), Integer.parseInt(wkMp3Memo[3])));
	    	}
	    }
	    return list;
	 }
	
}