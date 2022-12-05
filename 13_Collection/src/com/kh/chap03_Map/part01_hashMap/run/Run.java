package com.kh.chap03_Map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_Map.part01_hashMap.model.vo.Snack;

public class Run {

	public static void main(String[] args) {

		HashMap<String, Snack> hm = new HashMap<>();

//		계층구조를 보면 List나 Set 계열은 Collection을 구현한 클래스 => 데이터를 추할때 add메소드
//		단, Map은 아니다 => 데이터를 추가할 떄 put메소드 사용(key+value 세트로 추가)

//		1.put(K key, V value) => map 공간에 key + value 세트로 추가해주느 메소드
		hm.put("다이", new Snack("쪼꼬", 1500));
		hm.put("칸쵸", new Snack("단맛", 950));
		hm.put("포카칩", new Snack("짠맛", 1950));
		hm.put("포테토칩", new Snack("짠맛", 1950));
		// {포카칩=Snack [flavor=짠맛, calory=1950], 다이=Snack [flavor=쪼꼬, calory=1500],
		// 포테토칩=Snack [flavor=짠맛, calory=1950], 칸쵸=Snack [flavor=단맛, calory=950]}

		System.out.println(hm);
//		1. 저장순서 유지 x
//		2. value 값이 동일하다고해도, key값이 중복되지 않기때문에 잘 저장됨.

		hm.put("포카칩", new Snack("매운맛", 1200));
//		중복된 key갑의 value값으로 덮어씌우기됨.
		System.out.println(hm);
//		{포카칩=Snack [flavor=매운맛, calory=1200], 다이=Snack [flavor=쪼꼬, calory=1500], 포테토칩=Snack [flavor=짠맛, calory=1950], 칸쵸=Snack [flavor=단맛, calory=950]}

//		2. get(Object key) : V => 컬렉션에서 해당 키값의 value값을 돌려주는 메소드
		System.out.println(hm.get("다이")); // Snack [flavor=쪼꼬, calory=1500]

		Snack s = hm.get("칸쵸"); // 제네릭설정을 해놧기 때문에 Snack타입 객체로 강제형변환 하는과정이 생략되었다.
		System.out.println(s); // Snack [flavor=단맛, calory=950]

//		3. size() => 컬렉션에 담겨있는 갯수
		System.out.println("size : " + hm.size()); // size : 4

//		4. replace(K key , V value) => 컬렉션에서 해당 key값을 찾아내서 새로 전달된 value로 변경해주는 메소드
		hm.replace("포카칩", new Snack("겁나짠맛", 15000));
		System.out.println(hm);
//		{포카칩=Snack [flavor=겁나짠맛, calory=15000], 다이=Snack [flavor=쪼꼬, calory=1500], 포테토칩=Snack [flavor=짠맛, calory=1950], 칸쵸=Snack [flavor=단맛, calory=950]}

//		5. remove(Object key) => 컬렉션에 해당 key값을 찾아서 key + value 값 동시에 지워주는 메소드.
		hm.remove("포테토칩");
		System.out.println(hm); // {포카칩=Snack [flavor=겁나짠맛, calory=15000], 다이=Snack [flavor=쪼꼬, calory=1500],
								// 칸쵸=Snack [flavor=단맛, calory=950]}

		System.out.println("===========================================================");

//		순차적으로 HashMap 안에 담겨있는 값에 접근하고자 할떄 ?

//		for문 사용 불가.

//		List와 Map은 다른 계열이기 떄문에 ArrayList에 담은 후 출력 불가.
//		ArrayList list = new ArrayList(hm);

//		iterator()는 List와 Set계열에서만 사용 하는 메소드이기 떄문에 바로 사용 불가.
//		Iterator it = hm.Iterator();

//		Map을 Set로 변경해주는 메소드가 있음. (2개 있음.)
//		HashMap => Set계열로 바꿔서 => Iterator 호출

//		1. keySet() 을 이용하는 방법
//		1) hm에 있는 key값들만 set에 담기.

		Set<String> keySet = hm.keySet();
		System.out.println(keySet); // [포카칩, 다이, 칸쵸]

//		2) 1번 과정에서 작업된 keySet을 Iterator에 담기
		Iterator<String> itkey = keySet.iterator();

//		3) 반복자에 담긴 값들을 순차적으로 뽑기
		while (itkey.hasNext()) {
			String key = itkey.next();
			Snack value = hm.get(key);
			System.out.println("key : " + key);
			System.out.println("value : " + value);
//			value : Snack [flavor=겁나짠맛, calory=15000]
//			key : 다이
//			value : Snack [flavor=쪼꼬, calory=1500]
//			key : 칸쵸
//			value : Snack [flavor=단맛, calory=950]
		}

		System.out.println("===========================================================");

//		2. entrySet() 이용하는 방법.

//		1) hm에 있는 key+ value값 모두 (Entry) set에 담기(Entry 집합형태)
//		Set<Entry<String, Snack>> entrySet = hm.entrySet();

		for (Entry<String, Snack> entry : hm.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

//		2) entrySet에 있는 것들을 Iterator에 담기.

		Iterator<Entry<String, Snack>> itEntry = hm.entrySet().iterator();

//		3) 반복자를 이용해서 순차적으로 값을 뽑기.
		while (itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
//			key : 포카칩
//			value : Snack [flavor=겁나짠맛, calory=15000]
//			key : 다이
//			value : Snack [flavor=쪼꼬, calory=1500]
//			key : 칸쵸
//			value : Snack [flavor=단맛, calory=950]
		}

	}
}
