package racecar;

public class GasCar extends Racer {

	public GasCar(String team, int fuel) {
		super(team, 0);
		this.fuel = fuel;
		
	}

	public GasCar(String team) {
		super(team, 0);
		fuel = 10;
	}

	public int fuel;

	

	@Override
	public void accelerate() {
		this.speed = speed+2;
		this.fuel = fuel-1;
	}

	@Override
	public boolean isFuelEmpty() {
		if(fuel <= 0) {
			return true;
		}else {
			return false;
		}
		
	}

	public int getFuel() {
		return fuel;
	}

}
