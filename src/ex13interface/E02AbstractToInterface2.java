package ex13interface;
/*
추상클래스를 인터페이스로 변경하기 
	abstract class ==> interface
	메소드인경우 public abstract 제거
	멤버상수인경우 public static final 제거
 */
interface PersonalNumberStorageImpl{
	void addPersonalInfo(String juminNum,String name);
	
	String searchPersonalInfo(String juminNum);
	
	
}
//DTO는 정보를 저장하는 용도이므로 변경없음
class PersonalInfoVO {
	private String name;
	private String juminNum;
	public PersonalInfoVO(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	//private 멤버를 반환하기 위한 getter메소드 정의
	public String getName() {return name;}
	public String getJuminNum() {return juminNum;}
	
}
/*
 * 클래스가 클래스를 상속할때 extends를쓰고
 * 클래스가 인터페이스를 상속할때 implement를 쓴다.  구현한다라는표현이맞다. 
 * 인터페이스가 인터페이스 상속할때 extends를 사용
 * 
 * extends 상속표현 implements 구현이라 표현한다. 
 */
class PersonalNumberStorage implements PersonalNumberStorageImpl {
	PersonalInfoDTO[] personalArr;//정보저장용 객체배열
	int numofPerInfo;//입력정보 카운트
	
	public PersonalNumberStorage(int arrSize) {
		personalArr=new PersonalInfoDTO[arrSize];
		numofPerInfo=0;
	}
	
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numofPerInfo]=new PersonalInfoDTO(name, juminNum);
		numofPerInfo++;
	}
	//주민번호를 인자로 객체배열을 검색한후 정보를 반환한다. 
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i=0;i<numofPerInfo;i++) {
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0) {
				return personalArr[i].getName();
			}
		}
		//검색결과가 없을때는 null을 반환한다. 
		return null;
	}
}

public class E02AbstractToInterface2 {
	
	public static void main(String[] args) {
		//객체 생성
		PersonalNumberStorage storage=new PersonalNumberStorage(10);
		//정보추가
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		//주민번호를 통해 정보 검색
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("901234-1090333"));
	}

}
