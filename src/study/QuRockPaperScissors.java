package study;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public  class QuRockPaperScissors {
	
	public static void main(String[] args) {
		int a;
		int b;
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		int gameCount=0;
		
		while(true) {
			
			System.out.println("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보)");
			a=scanner.nextInt();
			b=random.nextInt(3)+1;
			try { if(!(a==1)||!(a==2)||!(a==3)) {
			
			if(a==1 && b==2) {
				System.out.println("사용자 :가위,컴퓨터 :바위");
				System.out.println("졌습니다");
			}
			else if(a==1 && b==3) {
				System.out.println("사용자:가위,컴퓨터 보");
				System.out.println("이겼습니다 ");
			}
			else if(a==1 && b==1) {
				System.out.println("비겼습니다");
			}
			else if(a==2 && b==1) {
				System.out.println("사용자:바위 컴퓨터: 가위");
				System.out.println("이겼습니다");
			}
			else if(a==2 &&b==2) {
				System.out.println("비겼습니다");
			}
			else if(a==2 && b==3) {
				System.out.println("사용자 바위 컴퓨터 보");
				System.out.println("졌습니다");
			}
			else if(a==3 && b==1) {
				System.out.println("사용자 보 컴퓨터 가위");
				System.out.println("졌습니다");
				
			}
			else if(a==3 && b==2) {
				System.out.println("사용자 보 컴퓨터 바위");
				System.out.println("이겼습니다");
			}
			else if(a==3 &&b==3) {
				System.out.println("비겼습니다");
			}
			
			gameCount++;
			
			if(gameCount==5) {
				System.out.println("계쏙하려면 1번 그만하려면 0번을 눌러라");
				int gogo=scanner.nextInt();
				if(gogo==1) {
					continue;
				}
				else if (gogo==0) {
					break;
				}
			}
		}		
}
		catch (InputMismatchException e) {
			System.out.println("1,2,3 중 숫자만입력하세요 가위바위보할줄모름?");
			
			e.printStackTrace();
			return;
		}
		
		}
		
			
		}	
	}
		



