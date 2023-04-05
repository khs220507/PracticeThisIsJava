package ch07_05;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupesonicAirplane sa = new SupesonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flymode = SupesonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode = SupesonicAirplane.NOMAL;
		sa.fly();
		sa.land();
	}
}
