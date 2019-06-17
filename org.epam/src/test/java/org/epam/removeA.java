package org.epam;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class removeA {

	@Test
	public void test() {
		RemA rem=new  RemA();
		String h=rem.remov("AAAAA");
		assertEquals("AAA", h);
	
		
	}
//	public static void main(String[] args) {}
	//	assertEquals("BC", rem.remov("ABC"));
	
	@Test
	public void test4Char1() {
		RemA rem=new  RemA();
		String h=rem.remov("ABCD");
		assertEquals("BCD",h );
	}
	
	@Test
	public void test4Char2() {
		RemA rem=new  RemA();
		String h=rem.remov("AACD");
		assertEquals("CD", h);	
	}
	
	@Test
	public void test4Char3() {RemA rem=new  RemA();
	String h= rem.remov("BACD");
		assertEquals("BCD",h);
	}
	
	@Test
	public void test4Char4() {RemA rem=new  RemA();
	String h= rem.remov("BBAA");
		assertEquals("BBAA",h);
	}
	
	@Test
	public void testnChar() {RemA rem=new  RemA();
	String h=rem.remov("AABAA");
		assertEquals("BAA", h);
	}
	
	@Test
	public void test0Char() {RemA rem=new  RemA();
	String h= rem.remov("");
		assertEquals("",h);
	}
	
	@Test
	public void test1Char1() {RemA rem=new  RemA();
	String h= rem.remov("A");
		assertEquals("",h);
	}
	
	@Test
	public void test1Char2() {RemA rem=new  RemA();
	String h=rem.remov("B");
		assertEquals("B",h );
	}
	
	@Test
	public void test2Char1() {RemA rem=new  RemA();
	String h=rem.remov("AA");
		assertEquals("",h );
	}
	
	@Test
	public void test2Char2() {RemA rem=new  RemA();
	String h=rem.remov("AB");
		assertEquals("B", h);
	}
	
	@Test
	public void test2Char3() {RemA rem=new  RemA();
	String h=rem.remov("BA");
		assertEquals("B", h);
	}
	
	
	
}
