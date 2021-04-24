package study;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


class WrongNumberException extends Exception{
   
   public WrongNumberException() {
      super("숫자는 1,2,3만입력해라");
   }
}
public class QuRockPaperScissors1 {

   
	   public static void main(String[] args) {
	        int a;
	        int b;
	        Scanner scanner=new Scanner(System.in);
	        Random random=new Random();
	        int gameCount=0;
	        while(true) {
	            try {
	                System.out.println("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보)");
	                a=scanner.nextInt();        
	                b=random.nextInt(3)+1;
	                if(a<1||a>3) {
	                    WrongNumberException ex=new WrongNumberException();
	                    throw ex;
	                }
	                
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
	               
	               if(gameCount%5==0) {
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
	            catch (InputMismatchException e) {
	            	//무한루프 처리해결방법 ㅋㅋ엔터키도 문자로인식해서 무한루프에빠진다 확실하게 무슨말인지모르겟음
	            	 scanner.nextLine();
	               System.out.println("1,2,3중에하나를입력하세용~");
	            }
	            catch (WrongNumberException e) {
	               System.out.println("1,2,3중 하나를 입력하세용");
	               
	            }
	        }
	    }
	}