log.infocom.testyantra.javaapp.inheritance;
import lombok.extern.java.Log;

@Log
public class Test {

	public static void main(String[] args) {
		/*
		 * Pen p=new Marker();
		 * 
		 * p.cost=5;; p.write();
		 * 
		 * 
		 * Marker m=new Marker(); m.cost=9; m.color(); m.write();
		 */
		/*
		 * FatherBike sn=new SonBike(); sn.bike();
		 */
		Marker m=new Marker();
		m.write();
		
		Pen p=new Pen();
		p.write();
	}
}
