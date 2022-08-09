package snippet;

/* Inheritance ---> Inheritance is the process of accessing states and behaviors
					of parent class into the child class.
	There are 3 types of inheritance in java
	1. single level
	2. multi-level
	3. Hierarchical 
	4. multiple --> not used in java(but used in the interface)
	5. hybrid ---> not used in java.
	
	** We cannot inherit private members of the parent into the child.
 * 
 */

//1) single level inheritance(1 Parent , 1 child)

class Pen // parent class
{
	void write() {
		System.out.println("writes smoothly");
	}
}

class Reynolds extends Pen {
	void comfort() // child class
	{
		System.out.println("Good comfort");
	}
}

// 2) multilevel inheritance (1 Parent, 1 child ,1 grand child)

class Television {
	void Display() {
		System.out.println("it displaying match");
	}
} 

class Haier extends Television {
	void Display1() {
		System.out.println("it displaying movie");
	}
}

class LG extends Haier {
	void Display2() {
		System.out.println("it displaying serial");
	}
}

// 3) Hierarchical inheritance 1 parent , 2 child)

class Electronics {
	void item() {
		System.out.println("it have lots of variety");
	}
}

class Freez extends Electronics {
	void cold() {
		System.out.println(" Its cools ");

	}
}

class Heater extends Electronics {
	void heats() {
		System.out.println("it heats ");

	}
}
//we cannot use private members of the parent into the child.
class Company{
	String ename;
	int eid;
	double sal; // we cannot access the private variable outside class.
	
	void setName(String name) 
	{
		 this.ename = name;
	}
	 String getName() 
	 {
		 return ename;
	 }
}
 
 class Employee extends Company{
	 void setSal(double sal) 
	 {
		 this.sal = sal;
	 }
	 double getSal() 
	 {
		 return sal;
	 }
}

public class Inherit {

	public static void main(String[] args) {
		// 1.
		Reynolds r = new Reynolds();
		r.write(); // with help of child class object we can call methods of parent class
		r.comfort();

		// 2.
		LG t = new LG();
		t.Display1();
		t.Display2();
		t.Display();

		// 3.
		Freez fz = new Freez();
		fz.item();
		fz.cold();

		Heater h = new Heater();
		h.item();
		h.heats();
	
		// we cannot use private members of the parent into the child.
		Employee emp = new Employee();
		emp.setSal(10000);
		System.out.println("The Salary of Employee is: "+emp.getSal());
		emp.setName("Pradip");
		System.out.println("The Name of Employee is:"+emp.getName());
	}

}
