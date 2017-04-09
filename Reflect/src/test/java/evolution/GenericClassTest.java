package evolution;

import java.lang.reflect.Method;

import org.junit.Test;

import evolution.annotation.AnyAnnotation;
import evolution.method.AnyMethod;

public class GenericClassTest {
	@Test
	public void testGenericClassByIndex() {
		Method method = AnyMethod.class.getDeclaredMethods()[0];
		Class<?> clazz = Ref.genericClass(method, 0, 0);
		System.out.println(clazz);
	}
	
	@Test
	public void testGenericClassByAnnotation() {
		Method method = AnyMethod.class.getDeclaredMethods()[0];
		Class<?> clazz = Ref.genericClass(method, AnyAnnotation.class, 0);
		System.out.println(clazz);
	}
}
