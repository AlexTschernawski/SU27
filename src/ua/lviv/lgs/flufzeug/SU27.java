package ua.lviv.lgs.flufzeug;

public class SU27 extends Jet implements SpecialOptions {

	JetControl jetcontrol = new JetControl();
	public double Speed = 1200;
	public String Color = "Grey";

	SU27(double Speed, String Color) {

		this.Speed = Speed;
		this.Color = Color;

	}

	void fly() {
		jetcontrol.jetUp();
		jetcontrol.jetDown();
		jetcontrol.jetRight();
		jetcontrol.jetLeft();
		jetcontrol.toString();

	}
	
	
	@Override
	public void turboboost() {
		
		System.out.println((int)(Math.random() * 300) + Speed + " km/h");

	}

	@Override
	public void stells() {
		System.out.println(1+(int)(Math.random()*60) + " minutes");

	}

	@Override
	public void nuclearStrike() {
		System.out.println(1 + (int)(Math.random() * 10) + " Bombs");

	}

}
