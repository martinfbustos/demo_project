package com.ing_soft.strategy.ducks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RedHeadDuckTest {

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
	public void duckShouldBeARedHeadDuck() {
		RedHeadDuck redHeadDuck = new RedHeadDuck();
		assertEquals("I'm a real Red Headed duck", redHeadDuck.display());
	}
	
	@Test
	public void redHeadDuckShouldFlyWithWings() {
		RedHeadDuck redHeadDuck = new RedHeadDuck();
		assertEquals("I'm flying!!", redHeadDuck.performFly());
	}

}
