package co.grandcircus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GasCarTests {
	@Test
	void teamFuelTest() {
		// verifies that team field is set from GasCar constructor parameter
		GasCar g = new GasCar("Wheaties", 5);
		String expected = "Wheaties";
		String result = g.getTeam();
		assertEquals(expected, result);
	}

	@Test
	void teamFuelTest2() {
		// verifies that fuel field is set from GasCar constructor parameter
		GasCar g = new GasCar("Wheats", 5);
		int expected = 5;
		int result = g.getFuel();
		assertEquals(expected, result);
	}

	@Test
	void fuelDefaultTest() {
		// verifies that fuel field is 10 when set from GasCar constructor with only
		// parameter
		GasCar g = new GasCar("Typer");
		int expected = 10;
		int result = g.getFuel();
		assertEquals(expected, result);
	}

	@Test
	void speedDefaultTest() {
		// verifies that speed field is 0 when set from GasCar constructor
		GasCar g = new GasCar("Typer");
		int expected = 0;
		int result = g.getSpeed();
		assertEquals(expected, result);
	}

	@Test
	void accelerateTest() {
		// verifies that calling accelerate once brings speed to 2
		GasCar g = new GasCar("Hyper");
		g.accelerate();
		int expected = 2;
		int result = g.getSpeed();
		assertEquals(expected, result);
	}

	@Test
	void accelerateTest2() {
		// verifies that calling accelerate twice brings speed to 4
		GasCar g = new GasCar("Hyper");
		g.accelerate();
		g.accelerate();
		int expected = 4;
		int result = g.getSpeed();
		assertEquals(expected, result);
	}

	@Test
	void accelFuelTest() {
		// verifies that fuel depletes by 1 when accelerate is called
		GasCar g = new GasCar("nerds", 5);
		g.accelerate();
		int expected = 4;
		int result = g.getFuel();
		assertEquals(expected, result);
	}
	void accelFuelTest2() {
		// verifies that fuel depletes by 2 when accelerate is called twice
		GasCar g = new GasCar("nerds", 5);
		g.accelerate();
		g.accelerate();
		int expected = 3;
		int result = g.getFuel();
		assertEquals(expected, result);
	}
	void FuelemptyTest() {
		// verifies that isFuelEmpty returns true when fuel is 0.
		GasCar g = new GasCar("Geeks", 0);
		boolean expected = true;
		boolean result = g.isFuelEmpty();
		assertEquals(expected, result);
	}
	void FuelemptyTest2() {
		// verifies that isFuelEmpty returns false when fuel is < 0.
		GasCar g = new GasCar("Geeks", 3);
		boolean expected = false;
		boolean result = g.isFuelEmpty();
		assertEquals(expected, result);
	}
}
