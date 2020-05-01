package com.ing_soft.strategy.ducks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MallardDuckTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void duckShouldBeAMallard() {
		MallardDuck mallard = new MallardDuck();
		assertEquals("I'm a real Mallard duck", mallard.display());
	}
	
	@Test
	public void mallardDuckShouldFlyWithWings() {
		MallardDuck mallard = new MallardDuck();
		assertEquals("I'm flying!!", mallard.performFly());
	}

}
