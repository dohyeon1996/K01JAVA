package ex17collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


import common.*;
public class QuArrayList {
	  
	@Override
	public  boolean equals(Object obj) { 
		Student st= (Student) obj;
		return true;
 	}
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		//LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		//1.검색할 이름을 입력받음
		System.out.println("검색할 이름을 입력하세요!");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		
		//2.확장for문으로 컬렉션 전체를 접근
		int index=-1; //인덱스의 초기값은 -1을 잡아주는게보통이다. 
					//보통0으로 인덱스가 시작되기때문이다. 
		for(Student st : list) {//for문안에는 remove쓰지말고 밖으로 빼야함 
			if((name.equals(st.getName()))) {
				index=list.indexOf(st);
				break;//해당객체를 찾았다면 즉시 푸르를 탈출한다. 
			}
		 }
		if(index==-1) {
			System.out.println("검색의 결과가 없습니다. ");
			for(Student st : list) 
			{
				st.showInfo();
			}
		}
		else {
			System.out.println("검색되었다 삭제후 정보출력");
			list.remove(index);
			//컬렉션에 저장된 객체를 인덱스를 통해 삭제하면 
			//삭제된 객체 자체를 반환하므로 멤버메소드를
			//바로 호출할수있다. 
		}
		for(Student st : list) {
			st.showInfo();
		}
		
	
	}
		
		
	
}
	
		//3.검색결과 유/무에 따라 
		//검색결과 있을때…검색된 데이터 삭제
		//검색결과 없을때...검색결과가 없다고 출력

		//4.전체정보 출력
	     
	
