package evolution;

import org.junit.Test;

import evolution.pojo.AnyDto;
import evolution.pojo.ListOfStrings;

public class DefaultObjectTest {
	@Test
	public void testListOfStrings() {
		Object obj = Ref.defaultObject(ListOfStrings.class);
		System.out.println(obj);
	}
	
	@Test
	public void testAnyDtp() {
		Object obj = Ref.defaultObject(AnyDto.class);
		System.out.println(obj);
	}
}
