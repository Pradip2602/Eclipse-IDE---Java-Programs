
class Employee{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "EMP["+"ID :"+id+", NAME :"+name+"]";
	}
}


public class To_String_Method {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Aniket");		
		Employee emp2 = new Employee(102,"Pratik");		
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
