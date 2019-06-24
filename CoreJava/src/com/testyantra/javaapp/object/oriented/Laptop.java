package com.testyantra.javaapp.object.oriented;
import lombok.extern.java.Log;

@Log
public class Laptop 
{
 String brand;
 String processor;
 int ram;
 
 void on()
 {
	 log.info("Laptop turning on");
 }
 void off()
 {
	 log.info("shutting down");
 }
 void running()
 {
	 log.info("laptop is running application ");
 }
}
