//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.util.Random;
//
//public class TeacherSubject {
//	
//	static Random rnd;
//	
//	static {
//
//		rnd = new Random(); 
//
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		
//		
//		subjects();
//		
//		
//	}
//
//	private static void subjects() {
//		
//		
//	      Connection conn = null; // DB연결된 상태(세션)을 담은 객체
//	        PreparedStatement pstm = null;  // SQL 문을 나타내는 객체
//	        
//	        try {
//	           conn = DBConnection.getConnection();
//	           
//	           
//	           for (int i = 0; i<40; i++) {        	   
////	        	int teacherseq = makeTeacherseq();
//	        	int subjectseq = makeSubjectseq();
//	        	int teacherseq[] = {1,2,3,4,5,6,7,8,9,10};
//	           
//	           String quary = "INSERT INTO tblPossible(SEQ, teacherSeq, subjectSeq) VALUES (tblPossible_seq.NEXTVAL," + teacherseq[i] + ","  + subjectseq  +")";
//	           System.out.println(quary);
//	           pstm = conn.prepareStatement(quary);
//	            pstm.executeUpdate();
//	           }
//	           System.out.println("Insert 완료");
//	           conn.close();
//	        } catch (Exception e) {
//	           e.printStackTrace();
//	      }
//	   
//	
//	
//	}//main
//
//	private static int makeSubjectseq() {
////		int subjectseq = 0;
//		
//		int subjectSeq[] = {1,2,3,4,5,6,7,8,9,10
//					,11,12,13,14,15,16,17,18,19,20
//					,21,22,23,24,25,26,27,28,29,30
//					,31,32,33,34,35,36,37,38,39,40};	//seq 적기
//		
//		int subjectSeqRND = rnd.nextInt(subjectSeq.length);
//				
//		return subjectSeq[subjectSeqRND];
//	}
//
////	private static int makeTeacherseq() {
//////		int teacherseq = 0;
////		
////		int teacherseq[] = {1,2,3,4,5,6,7,8,9,10};	//seq 적기
////		
////		int teacherseqRND = rnd.nextInt(teacherseq.length);
////				
////		return teacherseq[teacherseqRND];
////		
////	}
//	
//	
//	
//
//}//sub
