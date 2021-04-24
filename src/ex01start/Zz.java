package ex01start;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

class A {
	int a;
	void aa(){
		System.out.println("뭐");
	}
}
class B {
	int b;
	public B(int b) {
		this.b=b;
		A a=new A();
		a.aa();
	}
	void bb() {
		System.out.println("으짤낀데");
	}
	
}


public class Zz {

	public static void main(String[] args) {
		  HashSet<Integer> result=new HashSet<Integer>();
			int[] number= {};
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
			while(answer1.hasNext()) {
				System.out.println(answer1.next());
			}

	}

}
