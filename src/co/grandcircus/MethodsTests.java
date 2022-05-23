package co.grandcircus;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MethodsTests {
	//FINDRACERSWITHEMPTYFUELTESTS
@Test
void findEmptyFuelTest() {
	//test case with a list of GasCar where some have no fuel.
	List<Racer> racers = new ArrayList<Racer>();
	GasCar I = new GasCar("Baggins", 2);
	racers.add(I);
	GasCar II = new GasCar("Oakenshield", 0);
	racers.add(II);
	GasCar III = new GasCar("Gamgee", 3);
	racers.add(III);
	GasCar IV = new GasCar("Brandybuck", 0);
	racers.add(IV);
	GasCar V = new GasCar("Greenleaf", 0);
	racers.add(V);
	Methods.findRacersWithEmptyFuel(racers);
	int expected = 3;
	int result = racers.size();
	assertEquals(expected, result);
	
}
@Test
void findEmptyFuelTest2() {
	//test case with a list of GasCar where all have no fuel.
	List<Racer> racers = new ArrayList<Racer>();
	GasCar I = new GasCar("Bagged", 0);
	racers.add(I);
	GasCar II = new GasCar("Oakenspeed", 0);
	racers.add(II);
	GasCar III = new GasCar("Gamgee-Force", 0);
	racers.add(III);
	GasCar IV = new GasCar("BrandyBoxerEngine", 0);
	racers.add(IV);
	GasCar V = new GasCar("GreenLeadFoot", 0);
	racers.add(V);
	Methods.findRacersWithEmptyFuel(racers);
	int expected = 5;
	int result = racers.size();
	assertEquals(expected, result);
	
}
@Test
void findEmptyFuelTest3() {
	//test case with a list of GasCar where none have no fuel--empty list as result.
	List<Racer> racers = new ArrayList<Racer>();
	GasCar I = new GasCar("Bagged", 34);
	racers.add(I);
	GasCar II = new GasCar("Oakenspeed", 80);
	racers.add(II);
	GasCar III = new GasCar("Gamgee-Force", 70);
	racers.add(III);
	GasCar IV = new GasCar("BrandyBoxerEngine", 9);
	racers.add(IV);
	GasCar V = new GasCar("GreenLeadFoot", 3);
	racers.add(V);
Methods.findRacersWithEmptyFuel(racers);
	boolean expected = true;
	boolean result = racers.isEmpty();
	assertEquals(expected, result);
	
}
@Test
void findEmptyFuelTest4() {
	//test case with a list of SolarCar. (Expect an empty list as the result.)
	List<Racer> racers = new ArrayList<Racer>();
	SolarCar I = new SolarCar("Baginbox", 25);
	racers.add(I);
	SolarCar II = new SolarCar("Oakenspeed", 80);
	racers.add(II);
	SolarCar III = new SolarCar("Gamgee-Force", 70);
	racers.add(III);
	SolarCar IV = new SolarCar("BrandyBoxerEngine", 9);
	racers.add(IV);
	SolarCar V = new SolarCar("GreenLeadFoot", 3);
	racers.add(V);
Methods.findRacersWithEmptyFuel(racers);
	boolean expected = true;
	boolean result = racers.isEmpty();
	assertEquals(expected, result);
	
}
@Test
void findEmptyFuelTest5() {
	/*test case with a list that has a mix of SolarCar and GasCar.
	**int variable in the SolarCar constructor == speed -- not fuel */
	List<Racer> racers = new ArrayList<Racer>();
	SolarCar I = new SolarCar("Baginbox", 25);
	racers.add(I);
	GasCar II = new GasCar("Oakenspeed", 0);
	racers.add(II);
	SolarCar III = new SolarCar("Gamgee-Force", 0);
	racers.add(III);
	GasCar IV = new GasCar("BrandyBoxerEngine", 0);
	racers.add(IV);
	SolarCar V = new SolarCar("GreenLeadFoot", 3);
	racers.add(V);
Methods.findRacersWithEmptyFuel(racers);
int expected = 2;
int result = racers.size();
assertEquals(expected, result);
	
}
@Test
void findEmptyFuelTest6() {
	//test case with an empty list. (Expect an empty list as the result.)
	List<Racer> racers = new ArrayList<Racer>();
	boolean expected = true;
	boolean result = racers.isEmpty();
	assertEquals(expected, result);
	
}
//FINDAVERAGESPEED TESTS
@Test
void findAverageSpeedTest() {
	//test case with an array of GasCar with different speeds.
	Racer[] racers = new Racer[4];
	racers[0] = new GasCar("Giants", 6);
	racers[1] = new GasCar("Jets", 8);
	racers[2] = new GasCar("Speedsters", 9);
	racers[3] = new GasCar("Runners", 10);
	racers[0].accelerate();
	racers[3].accelerate();
	racers[3].accelerate();
	racers[1].accelerate();
	double expected = 2;
	//[6 /6 = 1.5] (.accelerate method increases speed by 2 in GasCars)
	double result = Methods.findAverageSpeed(racers);
	assertEquals(expected, result);
}
@Test
void findAverageSpeedTest2() {
	//test case with a mixed array of GasCar and SolarCar with different speeds.
	Racer[] racers = new Racer[4];
	racers[0] = new SolarCar("Tesla", 0);
	racers[1] = new GasCar("DieselWeasels", 8);
	racers[2] = new SolarCar("EVO", 0);
	racers[3] = new GasCar("E87Boys", 10);
	racers[0].accelerate();
	racers[0].accelerate();
	racers[2].accelerate();
	racers[2].accelerate();
	//accelerating a SolarCar = +1 added to speed
	double expected = 1;
	double result = Methods.findAverageSpeed(racers);
	assertEquals(expected, result);
}
@Test
void findAverageSpeedTest3() {
	//test case with array of cars where speed = 0 in all cars
	Racer[] racers = new Racer[4];
	racers[0] = new SolarCar("Muskrats", 0);
	racers[1] = new GasCar("DieselWeasels", 8);
	racers[2] = new SolarCar("Ravian", 0);
	racers[3] = new GasCar("E87Boys", 10);
	double expected = 0;
	double result = Methods.findAverageSpeed(racers);
	assertEquals(expected, result);
}
@Test
void findAverageSpeedTest4() {
	//test case with empty array - expect 0
	Racer[] racers = new Racer[4];
	double expected = 0;
	double result = Methods.findAverageSpeed(racers);
	assertEquals(expected, result);
}


//GETFASTERRACER METHOD TESTS
@Test
void getFastTest(){
	//Test case with racerA faster. -- implements accelerate method because default speed is set to 0
	Racer racer1 = new SolarCar("Speedy Gonzalez" ,0);
	Racer racer2 = new SolarCar("RACECARMAN", 0);
	racer1.accelerate();
	Racer expected = racer1;
	Racer result = Methods.getFasterRacer(racer1, racer2);
	assertEquals(expected, result);
}
@Test
void getFastTest2(){
	//Test case with racerB faster.
	Racer racer1 = new SolarCar("Speedy Gonzalez" ,0);
	Racer racer2 = new SolarCar("RACECARMAN", 0);
	racer2.accelerate();
	Racer expected = racer2;
	Racer result = Methods.getFasterRacer(racer1, racer2);
	assertEquals(expected, result);
}
@Test
void getFastTest3(){
	//Test case with both racers the same speed. -- expect null as result
	Racer racer1 = new SolarCar("Speedy Gonzalez" ,0);
	Racer racer2 = new SolarCar("RACECARMAN", 0);
	Racer result = Methods.getFasterRacer(racer1, racer2);
	assertNull(result);
}
@Test
void getFastTest4(){
	//Test case with GasCar and SolarCar parameters
	Racer racer1 = new GasCar("Speedy Gonzalez" , 9);
	Racer racer2 = new SolarCar("RACECARMAN", 0);
	racer1.accelerate();
	racer1.accelerate();
	racer2.accelerate();
	Racer expected = racer1;
	Racer result = Methods.getFasterRacer(racer1, racer2);
	assertEquals(expected, result);
}







}
