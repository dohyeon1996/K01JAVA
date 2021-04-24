package ex12inheritance;

/*
연습문제]  AnimalDog 클래스 정의
	강아지를 표현한 클래스 
	- Dog is a Animal이 성립하므로 상속관계로 표현하기에 
		적합한 모델\
	
	멤버변수
		강아지의종류 : 푸들, 포매라니안 등 -> dogKind
		이름 -> name
	멤버메소드
		bark() : 강아지가 짖는것을 표현
			출력결과 : 이름이 XX이고 종(포유류)이 
				YY인 강아지가 짖는다.
		showDog() : 강아지의 현재상태(멤버변수)를 출력하는 
			메소드
	인자생성자
		: 부모클래스까지 초기화할수 있도록 구성할것
 */

public class AnimalDog extends Animal {
	//확장한 멤버변수
	String dogKind;//강아지 종류
	String name;//이름

	
	public AnimalDog (String species,int age,String gender,String dogKind, String name) {
		super(age ,species,gender);
		/*
		자신멤버변수를 초기화한다.
		 */
		this.dogKind=dogKind;
		this.name=name;
		/*
		자식클래스에서는 반드시 부모클래스의 객체를먼저생성해야한다.여기서사용된
		super()는 부모클래스의 생성자 메소드를 호출하는 용도로 사용된다.
		 */
	}
	/*
	부모클래스의 species 멤버변수는 private으로 선언되어 자식에서는
	접근이 불가능하므로 이때는 public 으로 선언된 getter메서드를
	통해접근해야한다.
	 */
	public void bark() {
		
		System.out.println(name+"의"+getSpecies()+"강아지가짖는다.");
	}
	public void showDog() {
		/*
		여기서 사용된 super는 부모클래스의 객체를 가르키는 의미로 
		부모클래스의 showAnimal() 메소드를 호출한다.
		 */
		super.showAnimal();
		System.out.println(dogKind+"의이름은"+name);
		
	}
}
