package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/*
HashMap<K,V>
	:Map<T>인터페이스를 구현한 컬렉션 클래스로
	key value의 쌍으로 객체를 저장한다.
	키값은 중복될 수 없다. 중복될 경우 덮어쓰기로 처리된다.
	키값으로 검색하므로 다른 컬렉션보다 속도가빠르다.
	순서를보장한다.!!!!! 
 */
public class Ex05HashMapMain {

	public static void main(String[] args) {
		//Map 컬렉션 생성 Key와 Value는 둘다 String 형으로 선언함
		HashMap<String,String> map= new HashMap<String,String>();
		/*
		객체저장	: 객체저장시 기존에 저장된 동일한 Key값이 존재하면 
				이전에 저장된 객체가 반환된다. 만약 처음 임력이라면 
				null값이 반환된다. 
		 */
		System.out.println("name이라는 키값으로 저장된 이전의 값:"+map.put("name", "홍길동"));
		
		int number=20;
		//map.put("age", number); 에러발생 타입이맞지않는다.
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		
		//Map에 저장된 객체수 반환
		System.out.println("저장된 객체수:"+map.size());
		
		
		/*
		중복저장: 기존에 입력된 name키값이 있으므로 "홍길동"이 출력된다. 
			그리고 기존의 값이 "최길동"으로 갱신된다. 
		 */
		System.out.println("name이라는 키값으로 저장된 이전의값"+map.put("name", "최길동"));
		System.out.println("키값으로 중복저장후 객체수"+map.size());
		/*
		출력하기 
			1.키값을 알고있을때 :get(키값)으로 출력한다. 
		 */
		System.out.println("키값을 알떄:"+map.get("name"));
		
		
		/*
			2.키값을 모를때 	: keyset()메소드로 호출하여 키값을 Set컬렉션으로 
						얻어온다. 해당 반환값을 확장 for문을 통해 출력하고, 이를
						통해 값을 출력할수 있따. 
						
			※Map계열의 컬렉션은 처음부터 확장 for문을 사용하는것이 불가능하다. 
			아래처럼 key값을 먼저 얻어온 후 사용해야한다. 
		 */
		Set<String> keys=map.keySet(); //키값을몰라서 keyset()메소드를불러온것이고
		System.out.println("[확장 for문 적용]");
		for(String key :keys) {
			String value=map.get(key); //여기서 get()메소드를 부른것
			System.out.println(String.format("%s:%s",key,value ));
		
		}
		
		/*
		3.이터레이터를 통한출력
			:이터레이터를 통해 출력할때도 keyset()을 통해
				먼저 key값을 불러온후 반복한다. 
		 */
		System.out.println("[박복자사용하기]");
		Set<String> keys2=map.keySet();//키값을 불러오기위해서 keyset()메소드을 불러온것이다.
		Iterator<String> it=keys2.iterator();
		while(it.hasNext()) {
			String key=it.next();//키값얻기
			String value=map.get(key);//벨류값얻기 
			System.out.println(String.format("%s:%s",key,value));
		}
		/*
		Value 만 얻어와야할때 :values()메소드 사용
		 */
		System.out.println("value값들만 출력하기]");
		Collection<String > values=map.values();
		for(String value : values) {
			System.out.println(value);
		}
		/*
		존재유무확인 
				:key 혹은 value가 존재할경우 true가반환된다. 
		 */
		System.out.println(map.containsKey("name")?"name키값있따":"name키값없다");
		System.out.println(map.containsKey("account")?"account키값있따":"account키값없다");
		System.out.println(map.containsKey("남자")?"남자키값있따":"남자키값없다");
		System.out.println(map.containsKey("여자")?"여자키값있따":"여자키값없다");
		
		
		//삭제 : 집어넣을때도 key값을 통해서집어넣고 삭제할때도 key값으로 삭제한다. 
		System.out.println("삭제된 객체:"+map.remove("age"));
		System.out.println("[age키값을 삭제한후 출력]");
		for(String key:keys) {
			System.out.println(String.format("%s:%s",key,map.get(key)));
		}
		
		
		//전체삭제:removeAll()은 없음.clear()만 사용가능함.
		map.clear();
		System.out.println("전체삭제후 객체수:"+map.size());
		
	}
	

}
