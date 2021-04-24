package study;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class BudgetProblem {

	public static void main(String[] args) {
		 int answer = 0;
	        int [] d = {2,2,3,3};
	    	int budget=10;
	    	Arrays.sort(d); // 1 2 3 4 5 
	    	int sum=0;
	    	List list=new ArrayList();
	    	for(int i=0;i<d.length;i++) {
	    		sum=d[i]+sum;
	    		boolean small=(sum<=budget);
	    		if(small==true) {
	    			//System.out.println(i);
	    			list.add(i+1);
	    		}
	       	}
	    	
	    	answer=(int)Collections.max(list);
	        System.out.println(answer);
	}

}
