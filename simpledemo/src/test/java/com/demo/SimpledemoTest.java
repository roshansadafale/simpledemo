package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.Simple;

public class SimpledemoTest {

	@Test
	public void test() 
	{
		Simple s1 = new Simple();
		assertEquals("Hello World", s1.printhello());
	}

}
