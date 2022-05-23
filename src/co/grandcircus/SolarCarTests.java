package co.grandcircus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolarCarTests {

	@Test
	void teamTest() {
		// The team field is set from the constructor parameter
		SolarCar s = new SolarCar("Bucks", 0);
		String expected = "Bucks";
		String result = s.getTeam();
		assertEquals(expected, result);

	}

	@Test
	void speedTest() {
		// The speed field will always start at 0.
		SolarCar s = new SolarCar("Buckies", 3);
		int expected = 0;
		int result = s.getSpeed();
		assertEquals(expected, result);

	}

	@Test
	void accelerateTest() {
		// Calling accelerate once brings speed to 1.
		SolarCar s = new SolarCar("Vikings", 0);
		s.accelerate();
		int expected = 1;
		int result = s.getSpeed();
		assertEquals(expected, result);
	}

	@Test
	void accelerateTest2() {
		// Calling accelerate twice will bring speed to 2.
		SolarCar s = new SolarCar("Vikingies", 0);
		s.accelerate();
		s.accelerate();
		int expected = 2;
		int result = s.getSpeed();
		assertEquals(expected, result);
	}

	@Test
	void emptyFuelTest() {
		// verifies isFuelEmpty returns false
		SolarCar s = new SolarCar("Winners", 0);
		boolean expected = false;
		boolean result = s.isFuelEmpty();
		assertEquals(expected, result);
	}

}
