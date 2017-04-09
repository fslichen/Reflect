package evolution;

import java.lang.reflect.Method;

import org.junit.Test;

import evolution.dto.AnyDto;

public class RefTest {
	@Test
	public void testActualTypeArguments() {
		Method method = AnyDto.class.getDeclaredMethods()[0];
		Class<?> clazz = Ref.genericClass(method, 1, 0);
		System.out.println(clazz);
	}
}
