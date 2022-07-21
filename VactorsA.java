package com.advance.collection.vector;

import java.util.Vector;

public class VactorsA {

	public static void main(String[] args) {
	Vector<String>toDoVector= new Vector<>(2,3);
	System.out.println("initial capacity of the vector:"+toDoVector);
	
	toDoVector.add("eating");
	toDoVector.add("sleeping");
	toDoVector.add("waking");
	
	System.out.println("After adding 3 elements capacity of the vector:" +toDoVector.capacity());
	System.out.println("After adding 3 elements size of the vector:" +toDoVector.size());
	
	
	System.out.println("first element of the vector is:" +toDoVector.firstElement());
	System.out.println("last element of the vector is:" +toDoVector.lastElement());
	
	

	}

}
