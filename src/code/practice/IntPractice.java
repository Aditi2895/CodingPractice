package code.practice;

/**
 * @author Aditi
 *
 */
public class IntPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * call3(); call4(); call5();
		 */
		call6();
	}

	private static void call1() {
		System.out.println(1 + 2 + "21");
	}

	private static void call2() {
		int a = 0;
		for (int i = 0; i < 5; i++) {
			++a;
		}
		System.out.println(a);
	}

	private static void call3() {
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
	}
	
	private static void call4() {
		int a = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(a++);
		}
		
	}
	
	private static void call5() {
		int a = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(++a);
		}
	}
		
	private static void call6() {
		int a=0;
		int i=0;
		int b = a++;
		int c = ++a;
		int d = c++;
		int e = ++c;
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(i);
		System.out.println(d);
		System.out.println(e);
	}
	
	}
	
