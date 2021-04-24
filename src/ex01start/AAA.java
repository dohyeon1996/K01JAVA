package ex01start;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AAA {

    public static void main(String[] args) {

   	 Scanner scan = new Scanner(System.in);
   	 Random random = new Random();
   	 
   	 int[] arr = new int[3];
   	 int[] com = new int[3];
   	 int st = 0;
   	 int ba = 0;
   	 int out = 0;
   	 int gameCount=0;
   	 
   	 while(true) {
   		 for(int i=0 ; i<com.length ; i++) {
   			 com[i] = (random.nextInt(9)+1);
   		 }
   		 if(!(com[0]==com[1] || com[0]==com[2] || com[1]==com[2])) {
   			 break;
   		 }
   	 }
   		 
   		 while(true) {
   			 try {
   				 if(st==3) {
   					 while(true) {
   						 for(int i=0 ; i<com.length ; i++) {
   							 com[i] = (random.nextInt(9)+1);
   						 }
   						 if(!(com[0]==com[1] || com[0]==com[2] || com[1]==com[2])) {
   							 break;
   						 }
   					 }
   				 }
   				 st=0;
   				 ba=0;
   				 out=0;
   				 System.out.print("1~9 숫자 3개를 입력하세요 ex)1 2 3: ");
   				 for(int i=0 ; i<arr.length ; i++) {
   					 arr[i] = scan.nextInt();
   					 System.out.print(arr[i]+"|");
   				 }
   				 System.out.println();
   				 for(int i=0 ; i<arr.length ; i++) {
   					 for(int j=0 ; j<arr.length ; j++) {
   						 if(i==j) {
   							 if(arr[i]==com[j])
   							 st++;
   						 }
   						 else if (arr[i]==com[j]){
   							 ba++;
   						 }
   					 }
   				 }
   				 gameCount++;
   				 out =3-(st+ba);
   				 System.out.printf("스코어:%d Strike | %d Ball | %d Out\n\n",st,ba,out);
   				 if(st==3) {
   					 System.out.println("====정답====");
   					 for(int i=0 ; i<arr.length ; i++) {
   						 System.out.print(com[i]+"|");
   					 }
   					 System.out.println();
   					 System.out.println("Win!! 시도횟수:"+gameCount+"회");
   					 System.out.printf("다시(1)?그만(0)?:");
   					 int reOrnot = scan.nextInt();
   					 if(reOrnot==1) {
   						 gameCount=0;
   						 continue;
   					 }
   					 else if(reOrnot==0){
   						 return;
   					 }
   				 }
   			 }
   		 catch (InputMismatchException e) {//필요한 예외 ->숫자 범위, 숫자 아닌거, 입력자리수?
   			 System.out.println("숫자를 입력하라고");
   			 scan.nextLine();
   		 }
   	 }
    }
}
