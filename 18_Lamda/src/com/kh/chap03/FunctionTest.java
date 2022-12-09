package com.kh.chap03;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import com.kh.model.vo.Product;

public class FunctionTest {

//	Function 인터페이스 특징
//	1. 타입 변환
//	ex) 컬렉션에서 특정값만 뽑거나, 연산할때 사용됨.

	public static void main(String[] args) {

		Product p = new Product("갤럭시 z플립 4", 1350000, 10);

//		1) Function<T, R> : T형을 인자로 받아서 R형값을 리턴.
//			Product 객체에서 가격에대한 정보만 쏙 빼기

		Function<Product, Integer> f1;
		f1 = (p1) -> {
			return p1.getPrice();
		};
		System.out.println(f1.apply(p));

//		2)BiFunction<T, U, R> : T, U 두개를 인자로 받고 R을 리턴
		BiFunction<Integer, Integer, Double> bf;
		bf = (num1, num2) -> {
			return num1 * (double) num2;
		};
		System.out.println("z 플립 1000대의 가격은 = " + bf.apply(p.getPrice(), p.getStock()));

//		그외
//		3) xxxFunction<T> : xxx를 인자로 받아서 T형을 리턴.
//		4) xxxtoYYYFunction : xxx를 인자로 받아서 yyy리턴.
//		5) toxxxFunction<T> : T를 받아서 xxx를 리턴
//		6) toxxxBiFunction<T,U> : T,U를 인자로 받아서 xxx를 리턴

//		객체배열을 통한 람다식 실습.
//		1) 핸드폰 객체배열 만들기
		ArrayList<Product> pList = new ArrayList<Product>();
		pList.add(new Product("갤럭시 플립1", 650000, 55));
		pList.add(new Product("갤럭시 플립2", 850000, 20));
		pList.add(new Product("갤럭시 플립3", 1550000, 35));
		pList.add(new Product("갤럭시 플립4", 1950000, 47));
		pList.add(new Product("아이폰13", 1850000, 59));
		pList.add(new Product("아이폰14", 2350000, 18));

//		2) 해당상품들을 모두 팔게되면 남는 이윤을 계산할수 있는 람다식 생성.
//			이윤 계산 => (Product.가격 * Product.재고)
//			매개변수로 Product를 인자로 받아야함. 그리고 결과값은 int로 반환해야함.
		ToIntFunction<Product> tif;
		tif = (product) -> {
			return product.getPrice() * product.getStock();
		};

//		4) 일반메소드 호출.
		printProduct(pList, tif);

	}

//	3) 생성한 람다식 함수를 활용한 객체배열 관리용 일반메서드 생성.
	public static void printProduct(ArrayList<Product> pList, ToIntFunction<Product> toIntFunction) {
		for (Product p : pList) {
			System.out.printf("%s상품의 현재 가격은 %d원이며, 모두 판매했을때 이윤은 %d입니다.\n", p.getpName(), p.getPrice(),
					toIntFunction.applyAsInt(p));
		}
	}
}
