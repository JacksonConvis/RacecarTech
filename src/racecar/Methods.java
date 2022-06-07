package racecar;

import java.util.List;

public class Methods {
	// iterates the for loop 3x due to indexes of items in List changing immediately
	// upon removal of another
	public static List<Racer> findRacersWithEmptyFuel(List<Racer> racers) {

		for (int i = 0; i < racers.size(); i++) {
			if (racers.get(i).isFuelEmpty() == false) {
				racers.remove(i);
			}
		}
		for (int i = 0; i < racers.size(); i++) {
			if (racers.get(i).isFuelEmpty() == false) {
				racers.remove(i);
			}
		}
		for (int i = 0; i < racers.size(); i++) {
			if (racers.get(i).isFuelEmpty() == false) {
				racers.remove(i);
			}
		}
		return racers;

	}

	public static double findAverageSpeed(Racer[] racers) {
		int sum = 0;
		for (int i = 0; i < racers.length; i++) {
			if (racers[i] == null) {
				return 0;
			}
			sum += racers[i].getSpeed();

		}
		double result = sum / racers.length;

		return result;
	}

	public static Racer getFasterRacer(Racer racerA, Racer racerB) {
		if (racerA.getSpeed() > racerB.getSpeed()) {
			return racerA;
		} else if (racerA.getSpeed() < racerB.getSpeed()) {
			return racerB;
		} else {
			return null;
		}

	}
}