package ex14innerclass;

class OuterClass {
	InnerStaticClass innerStaticClass=new InnerStaticClass();
	int outerMemberVar;
	
	void outerMemberMethod() {
		System.out.println("외부클래스의 멤버메소드 호출됨 ");
		innerStaticClass.innerMemberVar=100;
		InnerStaticClass.innerStaticVar=101;
	}
	
	static int outerStaticVar;
	static void outerStaticMethod() {
		System.out.println("외부클래스의 정적 메소드 호출됨");
		 InnerStaticClass.innerMemberVar=102;
		 InnerStaticClass.innerMemberMethod();
			
		 InnerStaticClass.innerStaticVar=103;
		 InnerStaticClass.innerStaticMethod();
			
		 InnerStaticClass.innerMemberVar=104;
		 InnerStaticClass.innerMemberMethod();
			
		}
	//내부정적 클래스(Nested class)
	static class InnerStaticClass {
		//인스턴스형 멤버
		int innerMemberVar;
		void innerMemberMethod() {
		System.out.println("내부클래스의 멤버메소드 호출");
			}
		//정적멤버	
		static int innerStaticVar;
		static void innerStaticMethod() {
		System.out.println("내부클래스의 정적메소드 호출");
			}
		}
	}


public class E02InnerStaticClass {

	public static void main(String[] args) {

		OuterClass.InnerStaticClass.innerStaticVar=1;
		OuterClass.InnerStaticClass.innerStaticMethod();
		
		OuterClass.InnerStaticClass=new OuterClass.InnerStaticClass();
		E02InnerStaticClass.inner 
	}

}
