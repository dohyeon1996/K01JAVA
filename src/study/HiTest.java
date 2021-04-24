package study;

import java.util.ArrayList;

public class HiTest {

	public static void main(String[] args) {
		int[]answers= {1,3,2,4,2};
		 int[] answer1 = {1,2,3,4,5};
	        int[] answer2={2,1,2,3,2,4,2,5};
	        int[] answer3={3,3,1,1,2,2,4,4,5,5};
	       int count1=0;
	       int count2=0;
	       int count3=0;
	       for(int i=0;i<answers.length;i++) {
	    	   if(answers[i]==answer1[i%5]) {
	    		   count1++;
	    	   }
	    	   if(answers[i]==answer2[i%8]) {
	    		   count2++;
	    	   }
	    	   if(answers[i]==answer3[i%10]) {
	    		   count3++; 
	    	   }
	       }
	      // System.out.println(count1);
	      // System.out.println(count2);
	      // System.out.println(count3);
	    //
	      
	       if(count1==count2 &&count2==count3&& count1==count3) {
	    	   System.out.println(1+2+3);
	       }
	       else if (count1>count2 &&count1>count3) {
	    	  System.out.println("1");                  
	       }
	       else if (count2>count1 && count2>count3) {
	    	   System.out.println("2");   
	    	   
	       }
	       else if (count3>count1 && count3>count1) {
	    	   System.out.println("3");   
	       }
	       
	       
	       
	       
	        
	}

}
