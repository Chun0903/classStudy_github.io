package com.test.testRCM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//import com.test.lambda.Item;

public class RecommendGenre {


	public static void main(String[] args) throws Exception {
		
		recommGan();

	   	
	    
	    

		
	}//main




	private static void recommGan() throws Exception {
		Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성
		String message;
		
	    boolean loop = true;
		
		for (;loop;) {
		
		
		System.out.println("----------------------------------");
		System.out.println("◈장르 추천◈\n");
		System.out.println("1. 나의 장르 추천\n2. 장르별 추천 \nb. 뒤로가기 \nh. 홈\n");
		System.out.println("----------------------------------");
		
	    System.out.print("▶선택:");
	      
	    message = scan.nextLine(); 
	    System.out.println();
	    
	    if(message.equals("1")) {
		    favoritGanRecom();
		    break;
	    } else if(message.equals("2")){
	    	recomGan1();
			break;
		}else if(message.equals("b")) {
	    	System.out.println("추천 화면으로 이동합니다.");
	    	break;
	    }else if(message.equals("h")) {
	    	System.out.println("홈 화면으로 이동합니다.");
	    	break;
	    }else {
	    	System.out.println("정상적인 접근이 아닙니다 다시 입력하세요.");
	    	pause();
	    }
		
		}
	}



	
	private static void recomGan1() throws Exception {
		
		Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성
		String message;	
		String choice = "";
		
	    boolean loop = true;
		
	    List<String> genreList = rcmMusicListMain.getGenreCtg(); // 장르목록
	    
		for (;loop;) {

			System.out.println("----------------------------------");
			System.out.println("원하는 장르를 선택해 주세요.\n");
	         
	        for( int i=0; i < genreList.size(); i++ ){
	        	System.out.println((i+1)+". "+genreList.get(i));
	        }
	        	
	        System.out.println("\nb. 뒤로가기\nh. 홈");
				
			/*
			System.out.println("1. BALLADE\n2. BAND\n3. CAROL\n4. CLASSIC\n5. COUNTRY"
					+ "\n6. DANCE\n7. EDM\n8. JAZZ\n9. OST\n10.POP\n11. RNB\n12. ROCK\n13. TROT"
					+ "\nb. 뒤로가기\nh. 홈");
					*/
			System.out.println("----------------------------------");
			
		    System.out.print("▶선택:");
		      
		    message = scan.nextLine(); 
		    System.out.println();

		    String stMsg = "";
		    int iMessage = 0;
		    try {
		    	iMessage = Integer.parseInt(message);
		    	stMsg = "NUMBER";
		    }catch(Exception e){
		    	stMsg = "STRING";
		    }
		    
		    if("NUMBER".equals(stMsg)) {
		    	if( iMessage > genreList.size() ) {
		    		System.out.println("정상적인 접근이 아닙니다 다시 입력하세요.");
			    	pause();
		    	}
		    	
		    	choice = genreList.get(iMessage-1);
		    }else {
		    	if(message.equals("b")) {
		    		System.out.println("장르 추천 화면으로 이동합니다.");
		    		recommGan();
		    		break;
		    	} else if(message.equals("h")) {
		    		System.out.println("홈 화면으로 이동합니다.");
		    		break;	
		    	}else {
		    		System.out.println("정상적인 접근이 아닙니다 다시 입력하세요.");
		    		pause();
		    	}
		    }
		    
		    List<HashMap<String, String>> rList = getChoiceGan(choice);
	    	singNumchoice(scan, rList);
	    	break;

		}
		
		
		
	}
	
	@SuppressWarnings("unchecked")
	public static List<HashMap<String, String>> getChoiceGan(String choice) {
		List<rcmMusicListMain> musicLists = rcmMusicListMain.getAllList();
		
		List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> aMap = new HashMap<String, String>();
		HashMap<String, String> bMap = new HashMap<String, String>();
		
		musicLists.stream()
			.filter(musicList -> musicList.getGenre1().equals(choice) 
					|| musicList.getGenre2().equals(choice))
			.sorted((musicList1, musicList2) -> musicList2.getPlayNum() - musicList1.getPlayNum())
			.limit(10).forEach(musicList -> {
					//System.out.println(musicList.getSeq()+". "+musicList.getTitle()+" : "+musicList.getSinger());
					aMap.put("TITLE", musicList.getTitle());
					aMap.put("ITEM", musicList.getSinger());
					aList.add((HashMap<String, String>)aMap.clone());
				});
		
		
		for(int i=0; i<aList.size(); i++) {
			bMap = aList.get(i); 
			bMap.put("SEQ", i+1+"");
			System.out.println(bMap.get("SEQ")+". "+bMap.get("TITLE")+" : "+bMap.get("ITEM"));
			//System.out.println(aList.get(i).get("SEQ")+". "+aList.get(i).get("TITLE")+" : "+aList.get(i).get("ITEM"));
		}
		
		return aList; 
	}

	private static void favoritGanRecom() throws Exception {
		Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성
		String message;
		
	    boolean loop = true;
		
		for (;loop;) {
			
			System.out.println("----------------------------------");
			System.out.printf("◈당신이 제일 좋아하는 장르는 [%s] 입니다.◈\n",getFavoritGan());	
			System.out.printf("1. [%s] 추천! \nb. 뒤로가기 \nh. 홈\n",getFavoritGan());
			System.out.println("----------------------------------");
			
		    System.out.print("▶선택:");
		      
		    message = scan.nextLine(); 
		    System.out.println();
		    
		    if(message.equals("1")) {
				System.out.println("----------------------------------");
				List<HashMap<String, String>> rList = serchGenre();
				System.out.println("----------------------------------");
		    	singNumchoice(scan, rList);
		    	break;
		    }else if(message.equals("b")) {
		    	System.out.println("장르 추천 화면으로 이동합니다.");
		    	recommGan();
		    	break;
		    } else if(message.equals("h")) {
		    	System.out.println("홈 화면으로 이동합니다.");
		    	break;	
		    }else {
		    	System.out.println("정상적인 접근이 아닙니다 다시 입력하세요.");
		    	pause();
		    }
		}
	}




	static void singNumchoice(Scanner scan, List<HashMap<String, String>> pList) {
		String message;
		System.out.print("▶노래 번호 선택:");
		message = scan.nextLine();
		
		for(int i=0; i<pList.size(); i++) {
			if(pList.get(i).get("SEQ").equals(message)) {
				System.out.println();
				System.out.println("----------------------------------");
				System.out.printf("%S번 노래를 재생합니다.%s(%s)\n",message,pList.get(i).get("TITLE"),pList.get(i).get("ITEM"));
				System.out.println("----------------------------------");
			}
		}
		
	}
	

	

	//가장 좋아하는 장르 찾기
	public static String getFavoritGan() {		//List 불러오기
		List<String> genres1 = rcmMusicListMain.getL1Genres();
		List<String> genres2 = rcmMusicListMain.getL2Genres();
		
		//장르 List 합치기
		List <String> genres = new ArrayList<String>(genres1);
		genres.addAll(genres2);
		
		//잘 합쳐졌는지 확인
		
		//맵 만들기
		Map<String, Integer> ganMap = new HashMap<String, Integer>();
		
		for(int i = 0 ; i < genres.size(); i++) {
			
			//존재하면 count에 하나씩 더하기 -> value에 넣기
			if(ganMap.containsKey(genres.get(i))) {			
				ganMap.put(genres.get(i), ganMap.get(genres.get(i))+1);
			//존재하지 안으면 key 추가, value = 1	
			}else {
				ganMap.put(genres.get(i), 1);
			}
			
		}

		//value 가장 큰 key 찾기
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : ganMap.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		String favoritGan = maxEntry.getKey();
		
		return favoritGan;
		
	}
	
	static void pause() throws Exception{
		System.out.println();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("네(엔터 입력)");
		reader.readLine();		
	}
	
	
	//가장 좋아하는 장르 기반 추천 노래
	private static List<HashMap<String, String>> serchGenre() {

		List<rcmMusicListMain> musicLists = rcmMusicListMain.getAllList();
		
		List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> aMap = new HashMap<String, String>();
		HashMap<String, String> bMap = new HashMap<String, String>();
		
		musicLists.stream()
			//.sorted((item1, item2) -> item1.getName().compareTo(item2.getName()))
			
			.filter(musicList -> musicList.getGenre1().equals(getFavoritGan()) 
					|| musicList.getGenre2().equals(getFavoritGan()))
			.sorted((musicList1, musicList2) -> musicList2.getPlayNum() - musicList1.getPlayNum())
			.limit(10).forEach(musicList -> {
				aMap.put("TITLE", musicList.getTitle());
				aMap.put("ITEM", musicList.getSinger());
				aList.add((HashMap<String, String>)aMap.clone());
				});
		
		for(int i=0; i<aList.size(); i++) {
			bMap = aList.get(i); 
			bMap.put("SEQ", i+1+"");
			System.out.println(bMap.get("SEQ")+". "+bMap.get("TITLE")+" : "+bMap.get("ITEM"));
		}

		return aList;
		
	}

	

}//Recomm














