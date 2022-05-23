package co.grandcircus;

public class SolarCar extends Racer {
	

	public SolarCar(String team, int speed) {
		super(team, 0);
	}

	@Override
	public void accelerate() {
		this.speed = speed + 1;
		
	}

	@Override
	public boolean isFuelEmpty() {
		return false;
	}

}
