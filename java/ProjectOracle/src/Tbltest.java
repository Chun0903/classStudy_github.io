import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

public class Tbltest {
	
	static Random rnd;
	
	static {

		rnd = new Random(); 

	}
	
	
	
	public static void main(String[] args) {
		
		
		insertTest();
		
		
	}
	
	private static void insertTest() {
	      Connection conn = null; // DB연결된 상태(세션)을 담은 객체
	        PreparedStatement pstm = null;  // SQL 문을 나타내는 객체
	        ResultSet rs = null;  // 쿼리문을 날린것에 대한 반환값을 담을 객체
	        
	        try {
	           conn = DBConnection.getConnection();
	           for (int i = 0; i < 45; i++) {
	              String write = makeWrite();
	              String practice = makePractice();
	              String testdate = makeTestDate();
	              int opensubjectseq[]= 
	            	  {		1
	            			  ,2
	            			  ,33
	            			  ,3
	            			  ,4
	            			  ,5
	            			  ,6
	            			  ,7
	            			  ,8
	            			  ,9
	            			  ,10
	            			  ,11
	            			  ,12
	            			  ,13
	            			  ,14
	            			  ,15
	            			  ,16
	            			  ,17
	            			  ,18
	            			  ,19
	            			  ,20
	            			  ,21
	            			  ,22
	            			  ,23
	            			  ,24
	            			  ,25
	            			  ,26
	            			  ,27
	            			  ,28
	            			  ,29
	            			  ,30
	            			  ,31
	            			  ,32
	            			  ,34
	            			  ,35
	            			  ,36
	            			  ,37
	            			  ,38
	            			  ,39
	            			  ,40
	            			  ,41
	            			  ,42
	            			  ,43
	            			  ,44
	            			  ,45};
	              String quary = "INSERT INTO TBLTEST(SEQ, WRITE, PRACTICE, TESTDATE, OPENSUBJECTSEQ) VALUES (TBLTEST_SEQ.NEXTVAL,\'" + write + "\',\'" + practice + "\',\'" + testdate + "\',"+ opensubjectseq[i]+")";
	              pstm = conn.prepareStatement(quary);
	                pstm.executeUpdate();
	         }
	           System.out.println("Insert 완료");
	           conn.close();
	        } catch (Exception e) {
	           e.printStackTrace();
	      }
	   }//insertTest
//
//	   private static int makeOpenSubjectSeq() {
//	      // TODO Auto-generated method stub
//	      return 0;
//	   }

	   private static String makeTestDate() {
	      
	      String Date = "2020/";
	      
	      for (int i = 0; i < rnd.nextInt(1) + 1; i++) {
	         Date += rnd.nextInt(6) + 6 + "/"; 
	      }
	      
	      for (int i = 0; i < rnd.nextInt(1) + 1; i++) {
	         Date += rnd.nextInt(28) + 1;
	      }
	      
	      return Date;
	      
	   }

	   private static String makePractice() {
	      
	      String name = "practice";
	      
	      for (int i = 0; i < rnd.nextInt(4) + 1; i++) {
	         name += rnd.nextInt(4) + 1; 
	      }
	      
	      System.out.println(name);
	      
	      return name;
	      
	   }

	   private static String makeWrite() {
	      String name = "write";
	      
	      for (int i = 0; i < rnd.nextInt(4) + 1; i++) {
	         name += rnd.nextInt(4) + 1; 
	      }
	      
	      return name;
	   }
}