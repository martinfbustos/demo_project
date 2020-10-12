package com.ing_soft.strategy.ducks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DecoyDuckTest {

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
	public void duckShouldBeADecoyDuck() {
		DecoyDuck decoyDuck = new DecoyDuck();
		assertEquals("I'm a Decoy Duck", decoyDuck.display());
	}
	
	@Test
	public void decoyDuckShouldNotFly() {
		DecoyDuck decoyDuck = new DecoyDuck();
		assertEquals("I can't fly", decoyDuck.performFly());
	}

	
	@Test
	public void decoyDuckShouldSquek() {
		DecoyDuck decoyDuck = new DecoyDuck();
		assertEquals("<< Silence >>", decoyDuck.performQuack());
	}


}
