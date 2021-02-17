package ua.lviv.lgs.flufzeug;

abstract class Jet {

	int weight = 100;
	int width = 24;
	int lenght = 35;

	public void startEngine() {

		System.out.println(22 + (int) (Math.random() * 67) + " seconds");

	}

	public void takeoffJet() {
		System.out.println(0 +(int)(Math.random() * 1001) + " km");

	}

	public void landingJet() {
		System.out.println("Jet is landing");

	}

}
