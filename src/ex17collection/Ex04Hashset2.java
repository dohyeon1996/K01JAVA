package ex17collection;

import java.util.HashSet;

import common.Person;

public class Ex04Hashset2 {

	public static void main(String[] args) {
/*
	두 메소드의 오버라이딩은 person클래스를 참조하면됨 
 */
		HashSet<Person> hashSet=new HashSet<Person>();
		
		Person p1=new Person("정우성", 30); 
		Person p4=new Person("z", 30); 
		Person p2=new Person("x", 31); 
		Person p3=new Person("정우성", 32); 
		
		hashSet.add(p1);
		hashSet.add(p2);
		boolean b= hashSet.add(p1);
		System.out.println("p3객체 저장여부:"+b);
		System.out.println("Hashset에 저장된 객체수:"+hashSet.size());
	}

}
