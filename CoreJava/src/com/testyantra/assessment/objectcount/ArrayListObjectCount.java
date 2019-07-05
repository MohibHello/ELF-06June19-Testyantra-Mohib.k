package com.testyantra.java.assessment.objectcount;

import java.util.ArrayList;

import com.testyantra.java.assessment.animalsound.Animal;
import com.testyantra.java.assessment.animalsound.CowAnimal;
import com.testyantra.java.assessment.animalsound.GoatAnimal;

import lombok.extern.java.Log;

@Log
public class ArrayListObjectCount {

	public static void main(String[] args) {

		CowAnimal cow = new CowAnimal();
		GoatAnimal goat = new GoatAnimal();

		ArrayList<Animal> arrayList = new ArrayList<>();
		arrayList.add(cow);
		arrayList.add(goat);
		arrayList.add(cow);
		arrayList.add(goat);
		arrayList.add(cow);
		arrayList.add(goat);
		arrayList.add(cow);
		arrayList.add(cow);
		arrayList.add(cow);

		log.info("" + CowAnimal.count);
		log.info("" + GoatAnimal.count);
	}
}
