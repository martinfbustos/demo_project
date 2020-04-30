package com.ing_soft.strategy;

public abstract class Duck {
	
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;
	protected int weight;
	
 
	public Duck() {
		
	}
	
	public void setFlyBehavior (FlyBehaviour fb) {
		flyBehaviour = fb;
	}
 
	public void setQuackBehavior(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
 
	public abstract String display();
 
	public String performFly() {
		return flyBehaviour.fly();
	}
 
	public String performQuack() {
		return quackBehaviour.quack();
	}
 
	public String swim() {
		return "All ducks float, even decoys!";
	}
	
	public void setWeight(int _weight) throws DuckWeightException {
		if (_weight > 0){
			weight = _weight;
		}else {
			throw new DuckWeightException("Weight cannot be less or equal than 0");
		}
	}
	
}