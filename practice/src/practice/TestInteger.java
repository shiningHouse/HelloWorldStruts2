package practice;

public class TestInteger {
	public static void main(String args[]){
		Integer s = new Integer(9);
		Integer t = new Integer(9);
		Long u = new Long(9);
		
		//System.out.println((s==u));
		System.out.println((s==t));
		System.out.println((s.equals(t)));
		System.out.println((s.equals(9)));
		System.out.println(s.equals(new Integer(9)));
	}
}
