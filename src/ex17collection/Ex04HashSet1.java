package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;
/*
 * HashSet컬렉션
 * 		:set계열의 인터페이스를 구현한 컬렉션으로 
 * -객체가 순서없이 저장된다.
 * -객체의 중복저장을 기본적으로 허용하지 않는다.
 * 단,기본클래스가 아닌 새롭게 정의한 클래스라면
 * hashCode(),equls()를 적절히 오버라이딩하여 정의해야한다.
 * List배열의 성격이라면 set은 집합의 성격을 가진다. 
 */

public class Ex04HashSet1 {

	public static void main(String[] args) {
		/*
		1]set컬렉션 생성
		 */
		HashSet<Object> set=new HashSet<Object>();
		
		/*
		2] 다양한 객체 생성
		 */
		String strObject1="JAVA";
		String strObject2=new String ("KOSMO61기");
		Date dateObject=new Date();
		int number=100;
		Teacher teacher=new Teacher("김봉두,",55,"체육");

		/*
		3]객체저장  add()메소드를 통해 저장되고 , 문제가 없다면
			true가 반환된다. 
		
		 */
		System.out.println(set.add(strObject1));
		set.add(strObject2);
		set.add(dateObject);
		set.add(number);//--< Integer객체로 Boxing처리후 저장됨
		set.add(teacher);
		
		/*
		 * 
		4]저장된 객체수열기
		 */
		System.out.println("[중복저장전 객체수]:"+set.size());//5개
		
		/*
		5-1] 기본클래스형의 객체중복저장
					:기본클래스인 경우 별도의 오버라이딩 처리없이도
					중복이 제거된다. 따라서 아래의 경우 flase가 반환된다.
		 */
		System.out.println(set.add(strObject2)?"저장성공":"저장실패");
		System.out.println("[중복(String)저장후 객체수:]"+set.size());
		
		/*
		 5-2]개발자가 정의한 객체 중복저장 
		 			:사용자 정의 클래스인 경우 hashCode,equals 메소드를
		 			오버라이딩 하지 않으면 중복저장이 허용된다. 아래의 경우 
		 			저장에 성공하여 true가 반환된다. 
		 */
		Teacher teacher2=new Teacher("김봉두", 55, "체육");
		System.out.println(set.add(teacher2)?"성공":"실패");
		System.out.println("[중복(Teacher2)저장후 객체수:]"+set.size());//6개
		
		/*
		 * 6] 저장된 객체출력
		 * 				:순서없이 저장되므로 출력순서도 지정할수 없다. 
		 * 				
		 */
		Iterator itr=set.iterator(); //이터레이터 객체 생성및 준비
		while(itr.hasNext()) {//추출할 객체가 있는지 확인 후..
			Object object=itr.next();//추출 
			
			if(object instanceof String ) {
				System.out.println("string 타입:"+object);
			}
			else if(object instanceof Date) {
				System.out.println("Date 타입:"+object);
			}
			else if(object instanceof Integer) {
				System.out.println("Integer 타입:"+object);
			}
			else if(object instanceof Teacher) {
				System.out.println("Teacher 타입:"+((Teacher)object).getInfo());
			}
			else {
				System.out.println("넌뭐임?");
			}
		}
		//1-7] 검색 객체의 존재여부 확인
		System.out.println(set.contains(strObject1)?"strObject1있다":"strObject1없다");
		System.out.println(set.contains("JAVA")?"JAVA있다":"JAVA없다");
		
		//1-8] 객체 삭제 순서생각할필요없음
		System.out.println(set.remove(strObject2)?"strObject2삭제성공":"strObject2삭제실패");
		System.out.println(set.remove("Android")?"Android삭제성공":"Android삭제실패");
		System.out.println("[삭제후 객체수]"+set.size());
		
		//1-9]전체삭제
		set.clear();
		System.out.println("전체삭제"+set.removeAll(set));
		System.out.println("[전체삭제후 객체수]"+set.size());
		
		
	}

}
