package com.corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ColllectionTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Trainer> al = new ArrayList<Trainer>();
		al.add(new Trainer(101, "Mangesh", "JAVA", 40000));
		al.add(new Trainer(102, "Ravi", "JAVA", 45000));
		al.add(new Trainer(103, "Shubham", "JAVA", 40000));
		al.add(new Trainer(104, "Omkar", "Cpp", 50000));
		al.add(new Trainer(105, "Sargam", "Python", 20000));

		LinkedList<Trainer> tli = new LinkedList<Trainer>();
		Iterator<Trainer> itr = al.iterator();
		while (itr.hasNext()) {
			Trainer trainer = itr.next();
			if ((trainer.salary > 20000) && ((trainer.course).equals("JAVA"))) {
				tli.add(trainer);
			}
		}
		Iterator<Trainer> litr = tli.iterator();
		while (litr.hasNext()) {
			Trainer filteredtrainer = litr.next();
			if (al.contains(tli)) {
				al.remove(litr);
			}
			System.out.print("Tr_Id :" + filteredtrainer.tr_id + " Name :" + filteredtrainer.name + " Course :"
					+ filteredtrainer.course + " Salary : " + filteredtrainer.salary + "\n");
		}
		System.out.println("Original List :");
		Iterator<Trainer> itr1 = al.iterator();
		while (itr1.hasNext()) {
			Trainer trn = itr1.next();
			
			System.out.print("Tr_Id :" + trn.tr_id + " Name :" + trn.name + " Course :" + trn.course + " Salary : "
					+ trn.salary + "\n");
		}

	}
}

class Trainer {
	int tr_id;
	String name;
	String course;
	int salary;

	public Trainer(int tr_id, String name, String course, int salary) {
		super();
		this.tr_id = tr_id;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}

}
