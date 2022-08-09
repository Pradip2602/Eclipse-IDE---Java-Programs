import java.util.Objects;

class Comapny {
	int id;
	String name;

	public Comapny(int id, String name) {
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

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comapny other = (Comapny) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}

public class Equals_Method {

	public static void main(String[] args) {

		Comapny emp1 = new Comapny(101, "Pranav");
		Comapny emp2 = new Comapny(101, "Pranav");
		Comapny emp3 = new Comapny(103, "Avinash");
		Comapny emp4 = new Comapny(104, "Pooja");
		Comapny emp5 = emp1;

		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp5));

	}

}
