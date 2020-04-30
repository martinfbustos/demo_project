package com.ing_soft.strategy.quack;

import com.ing_soft.strategy.QuackBehaviour;

public class FakeQuack implements QuackBehaviour {

	public String quack() {
		return "Qwak!";
	}
}
