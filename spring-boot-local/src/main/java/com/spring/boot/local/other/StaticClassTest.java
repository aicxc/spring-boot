package com.spring.boot.local.other;

/**
 * @author aicxc
 */
public class StaticClassTest {

	public static void main(String[] args) {
		Test2.StaticClass.show();

		new Test3().new StaticClass().show();

		new Test4.StaticClass().show();

		show();

		new StaticClassTest.Test1().show();
	}


	private static final String NAME = "local.static.class.test";

	@Override
	public String toString() {
		return super.toString();
	}

	static class Test1 {
		void show() {
			System.out.println("成员属性内部静态类");
		}
	}

	static void show() {
		new Object() {
			void show() {
				System.out.println("局部每部类");
			}
		}.show();
	}

}



class Test2 {
	static class StaticClass {
		static void show() {
			System.out.println("静态内部类，静态方法");
		}
	}
}



class Test3 {
	class StaticClass {
		 void show() {
			System.out.println("非静态内部类，非静态方法");
		}
	}
}




class Test4 {
	static class StaticClass {
		void show() {
			System.out.println("静态内部类，非静态方法");
		}
	}
}

