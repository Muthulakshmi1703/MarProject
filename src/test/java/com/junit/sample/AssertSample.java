package com.junit.sample;

import org.junit.Assert;
import org.junit.Test;

public class AssertSample {

	@Test
	public void assertMethod() {
		String a1 = "Welcome";
		String a2 = "welcome";
		
		Assert.assertEquals(a1, a2);
	}
}
