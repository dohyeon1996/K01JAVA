package ex11static;
/*
 * static 블럭
 * 		:동일 클래스안의 main메소드보다 먼저실행되는 블럭으로
 * 		main메소드의 실행코드가 없어도 먼저 실행된다.
 * 		단,다른 클래스에 main이 있는 경우에는 main이 순차적으로 실행
 * 		되다가 static 블럭이있는 클래스가 객체화될때 실행된다
 * 		이떄 생성자보다 static 블럭이 먼저실행된다.
 */

public class StaticBlock {
	//인스턴스형 멤버변수 및 메소드
	int instanceVar;
	void instanceMethod() {}
	
	//정적멤버
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
	//static 블럭 
	static {
		//블럭내에서 정적멤버에 접근가능
		staticVar=1000;
		/*
		블럭내에서만 사용할 수 있는 변수로써,블럭내에서
		일반적인 변수를 생성할수있다.
		 */
		
		int localVar;
		localVar=1000;
		System.out.println("localVar="+localVar);//허용됨
		/*
		static 블럭내에서는 인스턴스형 멤버에 접근할수없다.
		 */
		//System.out.println("instanceVAr="+instanceVar);
		//instanceMethod();
		/*
		정적멤버에는 접근할수있다.
		 */
		System.out.println("staticVar="+staticVar);
		staticMethod();
		System.out.println("==static block===");
		
	}
	//생성자 메소드
	/*
	외부파일의 main메소드에서 실행되는 경우 해당 클래스의 객체가
	생성자를 통해 생성되기전에 static 블럭이 먼저 실행된다.
	 */
	public StaticBlock() {
		staticVar=-1;
		System.out.println("==staticBlock의생성자===");
	}
	
	/*
	main메소드가 외부파일에 있을경우 테스트를 위해 아래부분은 주석처리후
	실행해본다. E02예제를 실행하면된다.
	 */
	//여기는 static블록실행후 메인메소드 프린트문실행 E02는다름
	public static void main(String[] args) {
		System.out.println("메인메소드"); 
		//System.out.println("localVar="+localVar);
		/*
		static블랙내에서 선언된 지역변수이므로 main메소드에서는 
		사용이 불가능하다.
		 */
	}
}
