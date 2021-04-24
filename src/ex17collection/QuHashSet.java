package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;



class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}
	/*
	Set컬렉션에 저장시 중복제거를 위한 메소드 오버라이딩 
	 */
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Avengers avengers=(Avengers)obj;
		System.out.println("equals메소드 호출됨");
		if(avengers.name.equals(this.name)) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class QuHashSet {
	public static void main(String[] args) {

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		
		
		
		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());
			 
		}
		Scanner scanner=new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요");
		String heroName=scanner.nextLine();
		
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Object object=itr.next();
			if(object instanceof Avengers) {
				if(((Avengers) object).getName().contains(heroName)) {
					System.out.println(object);
				}
			}
			else {
				System.out.println("정보를찾지못했습니다");
			}
			
		}
	}
}


