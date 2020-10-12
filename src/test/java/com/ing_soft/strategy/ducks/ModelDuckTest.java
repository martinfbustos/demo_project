package com.ing_soft.strategy.ducks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelDuckTest {

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
	public void duckShouldBeAModelDuck() {
		ModelDuck modelDuck = new ModelDuck();
		assertEquals("I'm a Model Duck", modelDuck.display());
	}
	
	@Test
	public void modelDuckShouldNotFly() {
		ModelDuck modelDuck = new ModelDuck();
		assertEquals("I can't fly", modelDuck.performFly());
	}

	
	@Test
	public void modelDuckShouldSquek() {
		ModelDuck modelDuck = new ModelDuck();
		assertEquals("<< Silence >>", modelDuck.performQuack());
	}


}
