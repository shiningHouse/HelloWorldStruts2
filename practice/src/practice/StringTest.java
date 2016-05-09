package practice;

public class StringTest {
	public static void main(String args[]){
		String s = new String("Hello");
		String t = new String("Hello");
		char arr[] = {'H','l','l','o'};
		
		//System.out.println((s==u));
		System.out.println((s==t));
		System.out.println((s.equals(t)));
		System.out.println((s.equals("Hello")));
		System.out.println(s.equals( new String("Hello")));
	}
}
