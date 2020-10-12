package com.ing_soft.strategy.ducks;

import com.ing_soft.strategy.Duck;
import com.ing_soft.strategy.fly.FlyNoWay;
import com.ing_soft.strategy.quack.MuteQuack;

public class DecoyDuck extends Duck {
	
	public DecoyDuck (){
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new MuteQuack();
	}
	
	public String display() {
		return "I'm a Decoy Duck";
	}

}
