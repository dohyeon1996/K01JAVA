package ex13interface;

import java.util.Scanner;
/*
인터페이스에 변수를 정의하면 무조건 상수가 되므로 
주로 인터페이스형 상수라고 표현한다. 주로 설정 값이나 명시적인 코드를 위해 사용된다. 
 */
interface Week {
	int MON=1, THE=2,WED=3,THU=4,FRI=5,SAT=6,SUN=7;
 	
}

public class E04InterfaceConstant {

	public static void main(String[] args) {

		System.out.println("오늘의 요일을 선택하세요.");
		System.out.println("1.월요일~7.일요일");
		System.out.print("선택(정수입력):");
		Scanner sc=new Scanner(System.in);
		int sel=sc.nextInt();
		
		switch(sel)
		{
		case Week.MON:
			System.out.println("주간회의가잇습니다");
			break;
		case Week.THE:
			System.out.println("프로젝트기획회의가있습니다");
			break;
		case Week.WED:
			System.out.println("진행사항보고");
			break;
		case Week.THU:
			System.out.println("사내축구시헙");
			break;
		case Week.FRI:
			System.out.println("프로젝트마감일");
			break;
		case Week.SAT:
			System.out.println("가족과 함꼐즐거운시간읇내세ㅛㅇㄷ");
			break;
		case Week.SUN:
			System.out.println("오늘은휴일입니다");
					}	
	}
}
