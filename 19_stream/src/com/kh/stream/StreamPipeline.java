package com.kh.stream;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StreamPipeline {

	public static void main(String[] args) {

//		PipeLine
//		데이터의 처리결과가 다음 단계의 데이터처리에 사용되면 또 다음 데이터처리에 사용되는
//		연속적인 처리구조를 의미함
//		
//		파이프라인은 여러개의 스트림을 "연결"하여 사용하는데
//		중간처리 스트림n개 + 최정처리 스트림 1개로 구성됨.
//		
//		중간처리 스트림역할 : 필요한 데이터검색 및 필터링, 형변환 등등 (filter, map, sort ..)
//		최종처리 스트림역할 : 중간처리스트림의 값을 토대로 결과값 반환 (sum, min ..)

		ArrayList<Product> pList = new ArrayList<Product>();
		pList.add(new Product("갤럭시 z플립3", 1050000, 25, "샘숭"));
		pList.add(new Product("갤럭시 z플립4", 1950000, 12, "샘숭"));
		pList.add(new Product("아이폰13", 1850000, 30, "애플"));
		pList.add(new Product("아이폰14", 2050000, 8, "애플"));

//		삼성제품의 평균가격 구하기.
//		Stream<Product> avgPrice = pList.stream(); --> 전에 했던 방법.
		double avgPrice = pList.stream().
//								pList에서 브랜드명이 삼성인 요소만 남김.
				filter(product -> product.getBrand().equals("샘숭")).
//								현재 스트림요소(Product)에서 제품의 가격에대한 값으로 데이터를 변경
				mapToInt(product -> product.getPrice()).average().getAsDouble(); // 결과값 반환.

		System.out.println("삼성폰 평균 가격은 ? " + avgPrice + "만원 입니다.");

//		:: 더블콜론.
//		
//		람다식을 더욱 간결하게 표현해주는 방법.
//		람다표현식이 단 하나의 메소드만 참조하는경우 매개변수를 제거해서 사용할수 있도록함.
//		
//		[표현법]
//		클래스이름 or 변수이름 :: 메소드이름

		pList.stream()// .mapToInt(product -> product.getPrice());
				.mapToInt(Product::getPrice) // 클래스이름 :: 메소드이름
//		.forEach(price -> System.out.println(price));
				.forEach(System.out::println); // 클래스이름 :: 메소드이름
	}

}
