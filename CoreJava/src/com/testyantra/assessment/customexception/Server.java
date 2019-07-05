package com.testyantra.assessment.customexception;


import lombok.extern.java.Log;
@Log
public class Server {
	
	double getServerRoomTemp(double temp) throws MaximumTemperatureException {
		if (temp >= 18) {
			throw new MaximumTemperatureException();
		} else {
			return temp;
		}
	}
}
