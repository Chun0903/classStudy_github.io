import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class MakeDummy {
	static Random rnd;
	
	static {
		rnd = new Random();
	}

	public static void main(String[] args) {
		insertMember();
//		insertTeacher();
		
	}

	private static void insertTeacher() {
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
        PreparedStatement pstm = null;  // SQL 문을 나타내는 객체
        ResultSet rs = null;  // 쿼리문을 날린것에 대한 반환값을 담을 객체
        
       
		
		
        
        try {
        	conn = DBConnection.getConnection();
        	for (int i = 0; i < 10; i++) {
        		String name = makeName();
        		String id = makeId();
        		String ssn = makeSsn();
        		String tel = makeTel();
        		String account = makeAccount();
        		String quary = "INSERT INTO TBL_TEACHER(SEQ, NAME, ID, SSN, TEL) VALUES (TEACHER_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\')";
        		pstm = conn.prepareStatement(quary);
                pstm.executeUpdate();
			}
        	System.out.println("Insert 완료");
        	conn.close();
        } catch (Exception e) {
        	e.printStackTrace();
		}
        
		
	}

	private static String makeAccount() {
//		110-423-918684
		String account = "";
		account += rnd.nextInt(900) + 100;
		account += "-";
		account += String.format("%03d", rnd.nextInt(1000));
		account += "-";
		account += String.format("%06d", rnd.nextInt(1000000));
				
		return account;
	}

	public static void insertMember() {
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
        PreparedStatement pstm = null;  // SQL 문을 나타내는 객체
        ResultSet rs = null;  // 쿼리문을 날린것에 대한 반환값을 담을 객체
        
       
		
		
        
        try {
        	conn = DBConnection.getConnection();
        	
//        	for (int i = 0; i < 26; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', SYSDATE)";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 30; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2020-04-07\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 30; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2020-02-15\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//            
//        	for (int i = 0; i < 26; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2020-01-27\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 30; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2020-03-02\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 30; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2020-01-05\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
            
        	
        	
        	
        	
        	
        	
//        	for (int i = 0; i < 30; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2019-07-25\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 26; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2019-09-07\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 30; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2019-11-14\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 26; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2019-08-23\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 30; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2019-02-23\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 26; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2019-05-22\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 30; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2019-06-14\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 26; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2018-02-07\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 30; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2018-01-04\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
//        	
//        	for (int i = 0; i < 26; i++) {
//        		String name = makeName();
//        		String id = makeId();
//        		String ssn = makeSsn();
//        		String tel = makeTel();
//        		String account = makeAccount();
//        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2018-03-11\')";
//        		pstm = conn.prepareStatement(quary);
//                pstm.executeUpdate();
//			}
        	
        	
        	
        	
        	
        	
        	
        	for (int i = 0; i < 30; i++) {
        		String name = makeName();
        		String id = makeId();
        		String ssn = makeSsn();
        		String tel = makeTel();
        		String account = makeAccount();
        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2018-04-15\')";
        		pstm = conn.prepareStatement(quary);
                pstm.executeUpdate();
			}
        	
        	for (int i = 0; i < 30; i++) {
        		String name = makeName();
        		String id = makeId();
        		String ssn = makeSsn();
        		String tel = makeTel();
        		String account = makeAccount();
        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2018-05-20\')";
        		pstm = conn.prepareStatement(quary);
                pstm.executeUpdate();
			}
        	
        	for (int i = 0; i < 30; i++) {
        		String name = makeName();
        		String id = makeId();
        		String ssn = makeSsn();
        		String tel = makeTel();
        		String account = makeAccount();
        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2018-06-01\')";
        		pstm = conn.prepareStatement(quary);
                pstm.executeUpdate();
			}
        	
        	for (int i = 0; i < 30; i++) {
        		String name = makeName();
        		String id = makeId();
        		String ssn = makeSsn();
        		String tel = makeTel();
        		String account = makeAccount();
        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2018-07-14\')";
        		pstm = conn.prepareStatement(quary);
                pstm.executeUpdate();
			}
        	
        	for (int i = 0; i < 30; i++) {
        		String name = makeName();
        		String id = makeId();
        		String ssn = makeSsn();
        		String tel = makeTel();
        		String account = makeAccount();
        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2018-01-18\')";
        		pstm = conn.prepareStatement(quary);
                pstm.executeUpdate();
			}
        	
        	for (int i = 0; i < 30; i++) {
        		String name = makeName();
        		String id = makeId();
        		String ssn = makeSsn();
        		String tel = makeTel();
        		String account = makeAccount();
        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2018-08-20\')";
        		pstm = conn.prepareStatement(quary);
                pstm.executeUpdate();
			}
        	
        	for (int i = 0; i < 30; i++) {
        		String name = makeName();
        		String id = makeId();
        		String ssn = makeSsn();
        		String tel = makeTel();
        		String account = makeAccount();
        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2018-10-07\')";
        		pstm = conn.prepareStatement(quary);
                pstm.executeUpdate();
			}
        	
        	for (int i = 0; i < 30; i++) {
        		String name = makeName();
        		String id = makeId();
        		String ssn = makeSsn();
        		String tel = makeTel();
        		String account = makeAccount();
        		String quary = "INSERT INTO TBL_STUDENT(SEQ, NAME, ID, SSN, TEL, ACCOUNT, REGDATE) VALUES (STUDENT_SEQ.NEXTVAL,\'" + name + "\',\'" + id + "\',\'" + ssn + "\',\'"+ tel +"\', \'"+ account +"\', \'2019-12-11\')";
        		pstm = conn.prepareStatement(quary);
                pstm.executeUpdate();
			}
        	
            System.out.println("Insert 완료");
            conn.close();
          
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}

	private static String makeTel() {
		String tel = "";
		tel += "010-";
		tel += String.format("%04d", rnd.nextInt(9000)+1000);
		tel += "-";
		tel += String.format("%04d", rnd.nextInt(10000));
		return tel;
	}

	private static String makeSsn() {
		String ssn = "";
		ssn += rnd.nextInt(10) +  85 + "";								// 년도
		int month = rnd.nextInt(12) + 1;  
		ssn += String.format("%02d", month);							// 월
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day = rnd.nextInt(maxDays[month-1]) + 1;
		ssn += String.format("%02d", day);								// 일
		ssn += "-";
		ssn += rnd.nextInt(1) + 1;
		ssn += String.format("%06d", rnd.nextInt(1000000));
		
		return ssn;
	}

	private static String makeName() {
		  String[] name1 = { "김", "이", "박", "최", "백", "권", "윤", "장", "정", "신" };
		String[] name2 = { "동", "현", "지", "호", "진", "영", "태", "성", "민", "승", "환", "종", "선", "찬", "우", "식", "윤", "예",
				"혜", "대" };
		
		String name =name1[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name2.length)] + name2[rnd.nextInt(name2.length)];
		return name;
	}

	private static String makeId() {
		String name = "";
		for (int i = 0; i < rnd.nextInt(4) + 3; i++) {
			name += (char) (rnd.nextInt(26) + 97);
		}
		for (int i = 0; i < rnd.nextInt(10); i++) {
			name += rnd.nextInt(10);
		}
		if (name.length() <= 4 && name.length() >= 17)
			name = makeId();
		return name;
	}

}