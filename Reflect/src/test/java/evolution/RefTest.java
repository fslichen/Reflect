package evolution;

import java.lang.reflect.Method;

import org.junit.Test;

import evolution.dto.AnyAnnotation;
import evolution.dto.AnyDto;

public class RefTest {
	@Test
	public void testGenericClassByIndex() {
		Method method = AnyDto.class.getDeclaredMethods()[0];
		Class<?> clazz = Ref.genericClass(method, 0, 0);
		System.out.println(clazz);
	}
	
	@Test
	public void testGenericClassByAnnotation() {
		Method method = AnyDto.class.getDeclaredMethods()[0];
		Class<?> clazz = Ref.genericClass(method, AnyAnnotation.class, 0);
		System.out.println(clazz);
	}
}
