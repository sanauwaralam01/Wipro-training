package alam;

import org.junit.Test;

public class TestClass {
	@Test 
	public void test1() {
		System.out.println("test1 running" + Thread.currentThread());
	}
	@Test 
	public void test2() {
		System.out.println("test2 running" + Thread.currentThread());
	}
	@Test 
	public void test3() {
		System.out.println("test3 running" + Thread.currentThread());
	}

}
