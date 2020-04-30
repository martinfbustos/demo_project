package com.ing_soft.strategy;

import com.ing_soft.strategy.ducks.*;
import com.ing_soft.strategy.fly.*;


public class DuckSimulator 
{
    public static void main( String[] args )  throws Exception
    {
    	
    	Duck mallard = new MallardDuck();
    	
    	mallard.setWeight(8);
    	
    	System.out.println(mallard.performQuack());
		System.out.println(mallard.performFly());
   
		Duck model = new ModelDuck();
		System.out.println(model.performFly());
		model.setFlyBehavior(new FlyWithRocketPowered());
		System.out.println(model.performFly());
    }
}
