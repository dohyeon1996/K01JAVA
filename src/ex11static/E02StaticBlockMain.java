package ex11static;

public class E02StaticBlockMain {
// 프린트문실행후 블럭실행
	public static void main(String[] args) {
		System.out.println("static블럭-다른클래스의 메인메소드실행");
		StaticBlock sb=new StaticBlock();
		System.out.println("StaticBlock.staticVar="+
					StaticBlock.staticVar);
	}

}
