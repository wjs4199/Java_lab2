package com.example.lab2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(101,"Kim",23);
		al.add(s1);
		Student s2 = new Student(102,"Lee",21);
		al.add(s2);
		al.add(new Student(103,"Park",25));
		al.add(new Student(104,"Hong",20));
		al.add(new Student(105,"Jeon",22));
		al.add(new Student(106,"Sin",24));
		al.add(new Student(107,"Choi",26));
		al.add(new Student(108,"Oh",27));
		al.add(new Student(109,"Han",28));
		al.add(new Student(110,"Jin",29));
		
		Collections.sort(al);
		
		for (Student s: al) {
			System.out.println(s.toString());
		}
		
	}

}
