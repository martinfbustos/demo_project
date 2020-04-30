package com.ing_soft.strategy.ducks;

import com.ing_soft.strategy.Duck;
import com.ing_soft.strategy.quack.Quack;
import com.ing_soft.strategy.fly.FlyWithWings;

public class MallardDuck extends Duck {
	 
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}
 
	public String display() {
		return "I'm a real Mallard duck";
	}
}

