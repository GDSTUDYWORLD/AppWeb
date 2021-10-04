package org.gds;

import org.gds.cars.Corolla;
import org.gds.cars.Swift;
import org.gds.interfaces.Car;

public class App {

	public static void main(String[] args) {
		Car swift = new Swift();
		Car corolla = new Corolla();
		
		System.out.println(swift.specs());
		System.out.println(corolla.specs());
		
		Car myCar = new Swift();
		System.out.println(myCar.specs());
	}
}
