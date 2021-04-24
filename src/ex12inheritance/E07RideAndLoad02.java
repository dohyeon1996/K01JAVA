package ex12inheritance;

public class E07RideAndLoad02 {

	public static void main(String[] args) {

		System.out.println("Child형 참조변수로 Child객체참조");
		DeChild child = new DeChild("율곡이이",49,"00학번");
		
		/*
		오버라이딩 처리된 메소드이므로 참조변수에 상관없이 무조건 
		자식쪽 메소드가 호출된다.
		 */
		child.excecise();
		child.sleep();
		child.printParent();
		
		child.study();//자식에서 확장한 메소드
		
		child.walk();//오버로딩 정의
		child.walk(25);//오버로딩 자식쪽에 정의
		/*
		정적메소드는 클래스명을 통해 호출한다. static의 기본규칙을 따른다.
		오버라이딩의 대상이 될수없다
		 */
		DeChild.staticMethod();
		////////////////////////////////////////
		
		System.out.println("Parent형 참조변수로 Child객체참조");
		DeParent parent= new DeChild("퇴계이황",35,"99학번");
		/*
		오버라이딩 처리된 메소드이므로 참조변수에 상관없이 무조건
		자식쪽 메소드가 호출된다. 참조변수의 영향을 받지 않는다.
		 */
		parent.excecise();
		parent.sleep();
		parent.printParent();
		
		//parent.study();
		parent.walk();
		//parent.wait(20);
		/*
		정적메소드는 오버라이딩 되지 않는다.
		 */
		DeParent.staticMethod();
		
	}

}
