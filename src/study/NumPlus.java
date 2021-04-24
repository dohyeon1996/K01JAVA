ttttttpackage study;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
public class NumPlus {
	public static void main(String[] args) {
		HashSet<Integer> result=new HashSet<Integer>();
		int[] number= {5,0,2,7};
		Arrays.sort(number);
		int num=0;
		for(int i=0;i<number.length-1;i++) {
			for(int j=0;j<number.length-1;j++) {
				if(i<=j) {
					result.add(number[i]+number[j+1]);
					num++;
				}
			}
		}
		Iterator<Integer> answer1=result.iterator();
		int[] answer=new int[result.size()];
		int index=0;
		while(answer1.hasNext()) {
			answer[index++]=answer1.next();
			
		}
		for(int i=0; i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}
	}
}

