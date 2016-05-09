package practice;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflexedTest {
	
    public static void main(String[] args) {
    	ArrayList<String> arr = new ArrayList<>();
    	
    	String classname ="java.util.ArrayList";
        try {
            Class c=Class.forName(classname);
            Method m[]=c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i].toString());
            }
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
	
}
