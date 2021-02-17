package ua.lviv.lgs.flufzeug;

import java.util.Random;

public class JetControl {
	
	Random r = new Random();

	void jetUp() {

		System.out.println(r.nextInt(100) + " meter up");

	}

	void jetDown() {
		System.out.println(r.nextInt(100) + " meter down");

	}

	void jetRight() {
		System.out.println(r.nextInt(100) + " meter right");

	}

	void jetLeft() {
		System.out.println(r.nextInt(100) + " meter left");

	}

}
