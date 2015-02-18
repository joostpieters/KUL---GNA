package main;


public class Exec {

	public static void main(String[] args) {
		array2();
		array3();
//		array4();
	}

	public static void array2(){
		Func.create2(100000);
	}
	public static void array3(){
		Func.create3(100000);
	}
//	public static void array3(){
//		Func.create4(100000);
//	}
}
