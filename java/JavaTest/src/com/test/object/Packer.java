package com.test.object;

public class Packer {
	
	private static int PencilCount;
	private static int EraserCount;
	private static int BallPoinPenCount;
	private static int RulerCount;
	
	
	public static int getPencilCount() {
		return PencilCount;
	}
	public static void setPencilCount(int pencilCount) {
		PencilCount = pencilCount;
	}
	
	
	public static int getEraserCount() {
		return EraserCount;
	}
	public static void setEraserCount(int eraserCount) {
		Packer.EraserCount = eraserCount;
	}
	
	
	public static int getBallPoinPenCount() {
		return BallPoinPenCount;
	}
	public static void setBallPoinPenCount(int ballPoinPenCount) {
		Packer.BallPoinPenCount = ballPoinPenCount;
	}
	
	
	public static int getRulerCount() {
		return RulerCount;
	}
	public static void setRulerCount(int rulerCount) {
		Packer.RulerCount = rulerCount;
	}
	
	public void packing(Pencil pencil) {
		if (pencil.getHardness().equals("4B")
				|| pencil.getHardness().equals("3B")
				|| pencil.getHardness().equals("2B")
				|| pencil.getHardness().equals("B")
				|| pencil.getHardness().equals("HB")
				|| pencil.getHardness().equals("H")
				|| pencil.getHardness().equals("2H")
				|| pencil.getHardness().equals("3H")
				|| pencil.getHardness().equals("3H")) {
			System.out.printf("포장 전 검수 : %s 진하기 연필입니다.\n", pencil.getHardness());
			System.out.println("포장을 완료했습니다.");
			PencilCount++;
		}else {
			System.out.println("연필 포장 불량");
		}
	}
	
	public void packing(Eraser eraser) {
		if(eraser.getSize().equals("Large") 
				||eraser.getSize().equals("Medium")
				||eraser.getSize().equals("Small")){
			System.out.printf("포장 전 검수 : %s 사이즈 지우개입니다.\n",eraser.getSize());
			System.out.println("포장을 완료했습니다.");
			EraserCount++;
		}else {
			System.out.println("지우개 포장 불량");
		}
	}
	
	public void packing(BallPointPen ballPointPen) {
		if((ballPointPen.getThickness() == 0.3 
				|| ballPointPen.getThickness() == 0.5
				|| ballPointPen.getThickness() == 0.7
				|| ballPointPen.getThickness() == 1
				|| ballPointPen.getThickness() == 1.5)
				&& (ballPointPen.getColor().equals("red") 
				|| ballPointPen.getColor().equals("blue")
				|| ballPointPen.getColor().equals("green")
				|| ballPointPen.getColor().equals("black"))) {
			System.out.printf("포장 전 검수 : %s 색상 %.1fmm 볼펜입니다.\n"
					,ballPointPen.getColor(),ballPointPen.getThickness());
			System.out.println("포장을 완료했습니다.");
			BallPoinPenCount++;
		}else {
			System.out.println("볼펜 포장 불량");
		}
		
	}
	
	public void packing(Ruler ruler) {
		if((ruler.getLength() == 30 
				|| ruler.getLength() ==50
				|| ruler.getLength() == 100)
				&& ruler.getShape().equals("줄자")
				|| ruler.getShape().equals("운형자")
				|| ruler.getShape().equals("삼각자")) {
			System.out.printf("포장 전 검수 : %dcm %s입니다.\n"
					,ruler.getLength(), ruler.getShape());
			System.out.println("포장을 완료했습니다.");
			RulerCount++;
		}else {
			System.out.println("지우개 포장 불량");
		}
		
	}
	
	public void countPacking(int type) {
		if (type == 0) {
			System.out.println("===================");
			System.out.println("포장 결과");
			System.out.println("===================");
			System.out.printf("연필 %d회\n지우개 %d회\n볼펜 %d회\n자 %d회\n"
					,PencilCount,EraserCount,BallPoinPenCount,RulerCount);
			System.out.println();
		
		} else if (type == 1) {
			System.out.println("===================");
			System.out.println("포장 결과");
			System.out.println("===================");
			System.out.printf("연필 %d회\n",PencilCount);
			System.out.println();
		
		} else if (type == 2) {
			System.out.println("===================");
			System.out.println("포장 결과");
			System.out.println("===================");
			System.out.printf("지우개 %d회\n",EraserCount);
			System.out.println();
			
		} else if (type == 3) {
			System.out.println("===================");
			System.out.println("포장 결과");
			System.out.println("===================");
			System.out.printf("볼펜 %d회\n",BallPoinPenCount);
			System.out.println();
			
		} else if (type == 4) {
			System.out.println("===================");
			System.out.println("포장 결과");
			System.out.println("===================");
			System.out.printf("자 %d회\n",RulerCount);
			System.out.println();
		}
		
	
	
	}
			
			
			
	

}