package com.ing_soft.strategy.ducks;

import com.ing_soft.strategy.Duck;
import com.ing_soft.strategy.quack.MuteQuack;
import com.ing_soft.strategy.fly.FlyNoWay;

public class ModelDuck extends Duck {
	
	public ModelDuck(){
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new MuteQuack();
	}
	
	public String display() {
		return "I'm a Model Duck";
	}

}
