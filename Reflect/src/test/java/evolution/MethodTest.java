package evolution;

import java.util.List;

import org.junit.Test;

public class MethodTest {
	public List<String> anyMethod(String string) {
		return null;
	}
	
	@Test
	public void test() {
		try {
			Class<?> clazz = Ref.genericClass(MethodTest.class.getDeclaredMethod("anyMethod", String.class), 0);
			System.out.println(clazz);
		} catch (Exception e) {}
	}
}
