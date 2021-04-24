package ex14innerclass;
/*
익명클래스(Anonymous class)
-이름이 없는 클래스를 말한다.
-내부클래스처럼 이벤트기반의 프로그래밍에서 많이사용된다.
-부모클래스의 메소드를 오버라이딩 하는것이 목적이다.
-클래스를 정의하는것이 마치 메소드를 정의하는것과 비슷하다. 
-마지막에 세미콜론을 반드시 써줘야한다. 

형식] 
	부모클래스명 참조변수=new 부모클래스명() {
		익명클래스의 실행부;
		부모클래스의 메소드 오버라이딩();
	
	};
	※부모클래스를 상속받아 이름없는 자식클래스를 생성하는 개념으로
	이해하면된다. 상속되기 떄문에 오버라이딩이 가능하다. 다운캐스팅하려면이름이필요한데
	익명클래스라서 이름이 없기때문에 다운캐스팅이불가해서 오버라이딩만가능하다. 
	즉,{}안쪾은 "자식"의 영역이다. 
 */
class Person {
	String name;

	public Person(String n) {
		super();
		this.name = n;
	}
	void printInfo() {
		System.out.println(String.format("이름:%s", name));
	}
}
	class Student extends Person {
		String stNumber;

		public Student(String n, String stNum) {
			super(n);
			this.stNumber = stNum;
		}
		//자식에서 확장한 멤버메소드 (부모에는 정의되지 않음)
		String getInfo() {
			return String.format("학번:%s", stNumber);
		}
		//오버라이딩한 메소드(부모에 정의되어 있음)
		@Override
		void printInfo() {
			// TODO Auto-generated method stub
			super.printInfo();
			System.out.println(getInfo());
		}
	}

//추상클래스
abstract class AbstractClass {
	abstract void abstractMethod();
}

	
	
//인터페이스
interface Interface{
	void abstractMethod();
	
}
public class E03AnonymousClass {

	public static void main(String[] args) {
		/*
		Student라는 이름을 가진 자식클래스를 통해 객체를 생성하고
		부모의 참조변수로 참조하는 이질화 형태 .
		참조변수가 부모타입이므로 자식객체에 직접 접근은 불가능하고 
		접근시에는 반드시 다운캐스팅(강제형변환)이후 접근해야한다. 
		 */
		Person person=new Student("문사람","2016");
		person.printInfo();
		//person.stNumber="2015";-->에러발생
		((Student)person).stNumber="2015";//다운캐스팅이후 접근가능
		System.out.println(((Student)person).getInfo());
		/*
		Person클래스의 상속받은 익명클래스 정의
		:Person타입의 인스턴스 변수에 Person을 상속받은 익명클래스를
		생성해서 그 주소를 할당한다. 
		-개념적으로 new Person(){}; =>익명 extends Person();
		생각하면된다 
		-이름이없는 개체이므로 부모클래스의 이름을 빌려서 객체를 생성했따고 생각하자
		 */
		Person anonyPerson=new Person("이말년") {
			int newVar;
			void newMethod() {
				System.out.println("익명클래스에서새롭게 확장한 메소드");
				
				
			}
			void printInfo() {
				System.out.println("newVAr="+newVar);
				newMethod();
				System.out.println("익명클래스에서 오버라이딩");
			}
			
		};
		anonyPerson.printInfo();
		//anonyPerson.newMethod();
		//추상클래스를 상속해서 정의한 익명클래스 
		//간단한 기능을 가진 함수를 잠깐불러서 쓸때 사용한다. 
		AbstractClass abstractClass = new AbstractClass() {
			String str="확장변수";
			@Override
			void abstractMethod() {
				System.out.println("추상메소드 오버라이딩");
				System.out.println("str"+str);
				// TODO Auto-generated method stub
				
			}
		};
		abstractClass.abstractMethod();
		
		
		
		
		Interface in = new Interface() {
			int interVar=100;
			@Override
			public void abstractMethod() {
				System.out.println("인터페이스의 추상메소드 오버라이딩");
				System.out.println("interVar="+interVar);
			}
		};
		in.abstractMethod();
		
		/*
		상속의 목적은 "확장" 
		익명클래스 목적은 "오버라이딩"이다. 
		그러므로 주로 익명클래스의 부모는 interface를 사용한다. 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		;
	}

}
