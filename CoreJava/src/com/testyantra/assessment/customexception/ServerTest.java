package com.testyantra.assessment.customexception;
import lombok.extern.java.Log;
@Log
public class ServerTest {

	public static void main(String[] args) {
		Server s = new Server();
		
		try {
			double temp = s.getServerRoomTemp(20);
		    log.info("Temperature : "+temp);
		} catch(MaximumTemperatureException e) {
			log.info("Exception: "+e.getMessage());
		}
		
	}

}
