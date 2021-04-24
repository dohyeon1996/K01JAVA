package ex08class;

class CalculatorEx {
	int count1;
	int count2;
	int count3;
	int count4;
	
	
	void init () {
		count1=0;
		count2=0;
		count3=0;
		count4=0;
		
	}
	int add (int a,int b) {
		int c=a+b;
		count1++;
		return c;
	}
	double min (double a,double b ) {
		double c=a-b;
		
		count2++;
		return c;
	}
	double mul (double a,double b) {
		double c=a*b;
		count3++;
		return c;
	}
	double div (double a,double b) {
		double c=a/b;
		count4++;
		return c;
	}
	
	void showOpCount() {
		System.out.println("덧셈의횟수"+count1);
		System.out.println("뺄셈의횟수"+count2);
		System.out.println("곱셈의횟수"+count3);
		System.out.println("나눗셈의횟수"+count4);
	}
	
}
public class QuSimpleCalculator {

	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();


	}

}
