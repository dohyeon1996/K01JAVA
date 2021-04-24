package ex12inheritance;

public class E08VariableArgument {
	
	static int getTotal(int param) {
		int total=0;
		total +=param;
		return total;
	}
	static int getTotal(int param1,int param2) {
		int total=0;
		total +=param1+param2;
		return total;
	}
	
	static int getTotal(int param1,int param2,int param3) {
		int total=0;
		total+=(param1+param2+param3);
		return total;
	}
	/*
	가변인자 
	형식] 메소드명(자료형 ... 매개변수명) {
			실행문;
			}
			1.필요에따라 매개변수를 변경해서사용할수있따.
			한꺼번에 받아야하니 배열로 반환해야한다.
			2.매개변수가 하나의 타입일때만 가능하다 .
			둘이상의 타입이라면 정의할수없다.
	 */
	static int getTotal(int ...param) {
		int total=0;
		for(int i=0;i<param.length;i++) {
			
			total+=param[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println("getTotal(args1)호출:"+getTotal(10));
		System.out.println("getTotal(args1,args2)호출:"+getTotal(10,20));
		System.out.println("getTotal(args1,args2,args3)호출:"+getTotal(10,20,30));
		System.out.println("getTotal(매개변수6개호출)"+getTotal(10,20,30,40,50,60));
		//매개변수의 타입이 double이 포함되어 호출 불가능함
		System.out.println("getTotal(args1, args2)ghcnf"+getTotal(10,20.3));
	}

}
