package com.ing_soft.strategy.quack;

import com.ing_soft.strategy.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
	public String quack() {
		return "<< Silence >>";
	}

}
