package com.example.lab2_2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(101, "Apple", 1000);
		fl.add(s1);
		Fruit s2 = new Fruit(102, "Orange", 1500);
		fl.add(s2);
		fl.add(new Fruit(103, "Kiwi",2500));
		fl.add(new Fruit(104, "Banana",2100));
		fl.add(new Fruit(105, "Grape",2200));
		fl.add(new Fruit(106, "Cherry",3000));
		fl.add(new Fruit(107, "Pineapple",2800));
		fl.add(new Fruit(108, "Peach",2600));
		fl.add(new Fruit(109, "Plum",2550));
		fl.add(new Fruit(110, "Blueberry",7000));
		
		Collections.sort(fl, new FruitComparator());
		
		for(Fruit s: fl) {
			System.out.println(s.toString());
		}
		
		System.out.println("Fruit List (reverse ordered by name");
		
		Collections.sort(fl, new FruitComparatorDesc());
		
		for(int i = 0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}

	}

}
