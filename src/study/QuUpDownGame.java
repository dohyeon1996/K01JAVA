package study;

import java.util.Random;
import java.util.Scanner;


class NumberRangeException extends Exception {
	public NumberRangeException() {
		super("1~100까지의 숫자만입력해라");
	}
}

public class QuUpDownGame {
	public static void main(String[] args) {
		int a;
		int b;
		
		
		Random random= new Random();
		Scanner scanner=new Scanner(System.in);
		int count=1;
		
		b=random.nextInt(100)+1;
		System.out.println(b);
		while(true)	{
				try {
					System.out.println("숫자를입력하세요");
					a=scanner.nextInt();
					if(a<0||a>100) {
						
						NumberRangeException ex=new NumberRangeException();
						throw ex;
					}	
			if(a>b) {
				System.out.println("크다");
				
			}
			else if (a<b) {
				System.out.println("작다");
				
			}
			else if (a==b) {
				System.out.println("성공");
				break;
				}
			else 
				System.out.println("실패");
			
			
			if(count%7==0) {
				System.out.println("계속하려면 1번 그만두려면 0번");
				int gogo=scanner.nextInt();
				if(gogo==1) {
					continue;
				}
				if(gogo==0) {
					break;
				}
			
			}
			count++;
			
		}
			catch (NumberRangeException e) {
				
				System.out.println("1~100까지의 수만입력해라");
			}
		}	
		
	}
		
}

