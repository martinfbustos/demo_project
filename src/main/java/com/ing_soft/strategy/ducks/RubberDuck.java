package com.ing_soft.strategy.ducks;

import com.ing_soft.strategy.Duck;
import com.ing_soft.strategy.quack.Squeak;
import com.ing_soft.strategy.fly.FlyNoWay;


public class RubberDuck extends Duck {
	 
	public RubberDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
	}
 
	public String display() {
		return "I'm a Rubber Duck";
	}
}