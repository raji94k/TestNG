package testNgIgnore;

import org.testng.annotations.Test;

public class IgnoreAtMethodLevel {

	@Test
	public void a()
	{
		System.out.println("a");
	}

	@Test(enabled = false) //IGNORE AT METHOD LEVEL
	public void b()
	{
		System.out.println("b");
	}

	@Test
	public void c()
	{
		System.out.println("c");
	}
}


