package study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;



public class QuBaseballGame {
	
	public static void main(String[] args) {
		int []com=new int[3];
		int []user=new int [3];
		Random random=new Random();
		while(true) {
	         for(int i=0 ; i<com.length ; i++) {
	            com[i] = (random.nextInt(9)+1);
	         }
	         if(!(com[0]==com[1] || com[0]==com[2] ||com[1]==com[2])) {
	            break;
	         }
	      }
		//System.out.print(com[0]+" "+com[1]+" "+com[2]);
		
		int countb=0;
		int countc=0;
		int strike=0;
		int out=0;
		int ball=0;
		while(true) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("숫자세개를 입력하세요");
			System.out.println("예를들어"+"1 "+"2 "+"3 "+"띄어쓰기해라");
			
			int first=scanner.nextInt();
			int second=scanner.nextInt();
			int throd=scanner.nextInt();
			
			user[0]=first;
			user[1]=second;
			user[2]=throd;
			int countfirst=0;
			
			for(int i=0; i<3;i++) {
					for(int j=0;j<3;j++) {
						if (user[i]==com[j] && !(i==j)) {
							System.out.println("ball 입니다");
							ball++;
							
						}
						else if(user[i]==com[j] && i==j) {
							System.out.println("strike입니다");
							strike++;
						}
					}
			}
			out=3-(strike+ball);
			 System.out.printf("스코어:%d Strike | %d Ball | %d Out\n\n",strike,ball,out);

			if(strike==3) {
				System.out.println("게임을종료합니다");
				break;
			}
		}
	}

}
