import org.junit.*;
import org.junit.Assert.*;

import com.tongli.test.HelloWorld;
public class TestHello {
	@Test
	public void testHello(){
		  
		Assert.assertEquals("Hello World",new HelloWorld().sayHello());
	}
}
