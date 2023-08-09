package com.java.practiceClasses;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for (int i = 0; i <= 50; i++) {
			al.add(i);
		}

		LinkedList ll = new LinkedList();
		for (int i = 0; i <= 50; i++) {
			ll.add(i);
		}

		Vector v = new Vector();
		for (int i = 0; i<=50; i++) {
			v.add(i);
		}

		Stack s = new Stack();
		for (int i = 0; i<=50; i++) {
			s.add(i);
		}

		HashMap hm = new HashMap();
		String name = "naveen dabas";
		for (int i = 0 ; i<=50; i++) {
			hm.put(i, name);
		}

		LinkedHashMap lhm = new LinkedHashMap();
		for (int i = 0; i<=50; i++) {
			lhm.put(i, name);
		}

		TreeMap tm = new TreeMap();
		for (int i = 0;i<=50;i++) {
			tm.put(i, name);
		}

		HashSet hs = new HashSet();
		for (int i = 0; i<=50; i++) {
			hs.add(i);
		}

		LinkedHashSet lhs = new LinkedHashSet();
		for (int i = 0; i<=50; i++) {
			lhs.add(i);
		}

		TreeSet ts = new TreeSet();
		for (int i =0; i<=50; i++) {
			ts.add(i);
		}

		Enumeration  e = v.elements();
		while(e.hasMoreElements()) {
			Integer i = (Integer) e.nextElement();
			if(i%2==0) {
				//System.out.print(i);
			}
		}

		Iterator itr = v.iterator();
		while(itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if(i%4==0) {
			//	System.out.print(i);
			}
		}

		ListIterator litr = al.listIterator();
		while(litr.hasNext()) {
			Integer s1 =  (Integer) litr.next();
			System.out.print(s1);
		}
		System.out.println();
		while(litr.hasPrevious()) {
			Integer s2 = (Integer) litr.previous();
			System.out.print(s2);
		}


	}
}
