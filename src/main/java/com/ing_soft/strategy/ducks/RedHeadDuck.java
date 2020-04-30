package com.ing_soft.strategy.ducks;

import com.ing_soft.strategy.Duck;
import com.ing_soft.strategy.quack.Quack;
import com.ing_soft.strategy.fly.FlyWithWings;


public class RedHeadDuck extends Duck {
	 
	public RedHeadDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}
 
	public String display() {
		return "I'm a real Red Headed duck";
	}
}