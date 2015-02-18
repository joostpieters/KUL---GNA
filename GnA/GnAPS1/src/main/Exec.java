package main;


public class Exec {

	public static void main(String[] args) {
		test1();
		test2();
//		array4();
	}

	public static void test1(){
		Func.create2(1000);
		Func.create3(1000);
	}
	public static void test2(){
		Func.create2(2000);
		Func.create3(2000);
	}
//	public static void array3(){
//		Func.create4(100000);
//	}
}
