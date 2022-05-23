package co.grandcircus;

/*
 * AUTHOR @JackConvis
 * Task:create several classes and several static methods 
 * that involve the idea of solar- and gas- powered racing cars.
 */
public abstract class Racer {
	protected String team;
	protected int speed;

	public abstract void accelerate();

	public abstract boolean isFuelEmpty();

	public Racer(String team, int speed) {
		super();
		this.team = team;
		this.speed = speed;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getSpeed() {
		return speed;
	}

}
