package org.array;

import java.util.ArrayList;


public class Nanda {
public static void main(String[] args) {
	ArrayList <Integer>li = new ArrayList<>();
	
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(50);
	System.out.println(li.add(60));
	
	System.out.println(li);
	
	
	
	int d=li.size();
	System.out.println(d);
	
	Integer x=li.get(4);
	System.out.println(x);
	
	li.add(2, 60);
	System.out.println(li);
	
	
	li.set(2, 25);
	System.out.println(li);
	
	li.remove(2);
	
	int Indexof=li.indexOf(10);
	System.out.println(Indexof);
	
	int lastIndexof=li.lastIndexOf(10);
	System.out.println(lastIndexof);
	
	
	boolean g=li.contains(90);
	System.out.println(g);
	
	li.clear();
	System.out.println(li);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
