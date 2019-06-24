package com.testyantra.javaapp.javabean;
import lombok.extern.java.Log;

@Log
public class TestM {
	public static void main(String[] args) {

		Marker m = Marker.getMarker();
		log.info(m.hashCode());
		Marker t = m;
		log.info(t.hashCode());
		Marker tt = Marker.getMarker();

		log.info(tt.hashCode());
	}
}
