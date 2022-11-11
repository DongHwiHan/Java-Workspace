package com.kh.operator;

public class B_InDecrease {
	
//	
//	
//	증감연산자(단항연산자) ++ --
//	++ : 변수에 담긴 값을 1씩 증가시키는 연산자
//		++변수 (전위연산자) 변수++ (후위연산자)
//	-- : 값을 1씩 감소시키는 연산자
//		--변수 (전위연산자) 변수-- (후위연산자)
//	
//	(증감연산자)변수 : 전위연산 -> 선증감 후처리.
//	변수(증감연산자) : 후위연산 -> 선처리 후증감.
//	

	public void method1() {
//		전위연산 테스트
		int num = 10;
		System.out.println("전위연산 적용 전 num :"+ num);//10
		System.out.println("1회 수행후 결과 : "+ ++num);
//		10에서 증감연산을 먼저 실행하여 11로 num을 증가시키고 최종적으로 11이 출력됨.
		System.out.println("2회 수행후 결과 : "+ ++num);
//		현재 num=11이 담겨있음. 따라서 12가 출력됨.
		System.out.println("3회 수행후 결과 : "+ ++num);//13
		
		System.out.println("최종 num :" +num);
		
		System.out.println("=========================================");
		
//		후위 연산 테스트
		int num2 =10;
		System.out.println("후위연산 적용 전 num :"+ num2);//10
		System.out.println("1회 수행후 결과 : "+ num2++ );//10출력 후 1증가
//		즉, 출력당시에는 10이출력되고, 출력처리가 끝나고나서 11로 증감처리됨.
		System.out.println("2회 수행후 결과 : "+ num2++ );//11출력 후 1증가 num2 = 12
		System.out.println("3회 수행후 결과 : "+ num2++ );//12출력 후 1증가 num2 = 13
		
		System.out.println("최종 num2 : " + num);
	}
	
	public void method2() {
//		전위연산
		int a = 10;
		int b = ++a; // b = 11 a = 11
		System.out.println("a : "+ a +", b: "+ b);//
		
		//후위연산
		int c = 10;
		int d = c++;// d = 10 c = 11
		System.out.printf("c : %d, d : %d", c,d);
		
//		=====================================
//		예측
		int num = 20;
		System.out.println("");
		System.out.println("현재 num : " + num);//20
		System.out.println("++num ? :" + ++num);//21 +1
		System.out.println("num++ ? : " + num++ );//21 0
		System.out.println("--num ? : " + --num );//21 +1 -1
		System.out.println("num-- ? : " + num-- );//21 -1
		
		System.out.println("최종 num ? : " + num );//20
	}
	//===============================================================================
	
	public void method3() {
		
		int num1 = 20;
		int result1 = num1++ *3; // result1 = 20 * 3 연산 후 num1 = num1+1
		
		System.out.println("num1 : "+num1);
		System.out.println("result1 : "+result1);
		
		int num2 = 20;
		int result2 = ++num2 *3;// num2 = num2 +1 연산 후 result2 = 21 * 3
		
		System.out.println("num2 : "+num2);
		System.out.println("result2 : "+result2);		
	}
	
	public void method4() {
		int a =10;
		int b = 20;
		int c = 30; 
		
//		어떻게 값이 출력될지 예상해보기.
		System.out.println(a++);//10 11
		System.out.println((++a) + (b++));//32    a12 b 20 c 29
		System.out.println((a++) + (--b) + (--c));// 61
		System.out.println("a : "+ a+ ", b : "+ b +", c : " + c);// a = 13 b = 20 c = 29
	}
	
	public void quiz() {
		
		int a =5;// a = 5
		int b = 10;// b =10
		
		int c =(++a) + b;// a = 6, b = 10, c = 16 
		int d = c / a;// a = 6, b = 10, c = 16, d =2
		int e = c % a;// a = 6, b = 10, c = 16, d = 2, e = 4
		
		int f = e++;// a = 6, b = 10, c = 16, d = 2, e = 4(5), f =4 
		int g =(--b) + (d--);// a = 6, b = 10(9), c = 16, d = 2(1), e = 5, f =4, g = 11
		int h = 2;// a = 6, b = 9, c = 16, d = 1, e = 5, f = 4, g = 11, h = 2
		
		int i = (a++) + b / (--c / f) * (g-- - d)% (++e + h);
//		 a = 6(7), b = 9, c = 15, d = 1, e = 6, f =4, g = 11(10), h = 2
//		6 + 9 / 3 * 10 % 8
//		연산자 우선순위가 동일하다면 앞에껏 먼저 실행시킴.
//		6 + 3 * 10 % 8
//		6 + 30 % 8
//		6 + 6
//		12
//		a = 7, b = 9, c = 15, d = 1, e = 6, f = 4, g = 10, h = 2, i = 12
		System.out.println("a :"+a);//7
		System.out.println("b :"+b);//9
		System.out.println("c :"+c);//15
		System.out.println("d :"+d);//1
		System.out.println("e :"+e);//6
		System.out.println("f :"+f);//4
		System.out.println("g :"+g);//10
		System.out.println("h :"+h);//2
		System.out.println("i :"+i);//12
	}
}
