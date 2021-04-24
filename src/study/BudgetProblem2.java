package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class BudgetProblem2 {
	public static void main(String[] args) {
	        int [] d = {2,2,3,3};
	    	Arrays.sort(d); // 1 2 3 4 5 
	    	int budget=10;
	    	int answer = 0;
	    	int count=0;
	    	int sum=0;
	    	for(int i=0;i<d.length;i++) {
	    		sum=d[i]+sum;
	    		if(sum<=budget) {
	    			count++;
	    		}
	    	}
	    	System.out.println(count);
	}

}
