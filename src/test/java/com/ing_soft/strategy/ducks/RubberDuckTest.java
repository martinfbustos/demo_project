package com.ing_soft.strategy.ducks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RubberDuckTest {

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
	public void duckShouldBeARubberDuck() {
		RubberDuck rubberDuck = new RubberDuck();
		assertEquals("I'm a Rubber Duck", rubberDuck.display());
	}
	
	@Test
	public void rubberDuckShouldNotFly() {
		RubberDuck rubberDuck = new RubberDuck();
		assertEquals("I can't fly", rubberDuck.performFly());
	}

	
	@Test
	public void redHeadDuckShouldSquek() {
		RubberDuck rubberDuck = new RubberDuck();
		assertEquals("Squeak", rubberDuck.performQuack());
	}
	

}
