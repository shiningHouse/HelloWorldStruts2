package practice;


class Enclosignoe{
	// 非静态内部类
	public class InsideOne{}
	// 静态内部类
	public static class InsideTwo{}
}


public class InnerClassTest {
	public static void main(String args[]){
		Enclosignoe.InsideOne obj1 = new Enclosignoe().new InsideOne();  // 非静态内部类对象
		Enclosignoe.InsideTwo obj2 = new Enclosignoe.InsideTwo();  // 静态内部类对象
	}
}
