package ua.lviv.lgs.flufzeug;

public class Main {

	public static void main(String[] args) {

		SU27 SU27 = new SU27(1200, "Grey");

		SU27.startEngine();
		SU27.takeoffJet();
		SU27.fly();
		SU27.stells();
		SU27.nuclearStrike();
		SU27.turboboost();
		SU27.landingJet();
	}

}
