import java.util.ArrayList;
import java.util.Collections;

public class Sort_Emp {

	public static void main(String[] args) {

		ArrayList <Emp> emps = new ArrayList<>();
		
		emps.add(new Emp(101,"Rohan"));
		emps.add(new Emp(102,"Rohit"));
		emps.add(new Emp(103,"Amit"));
		emps.add(new Emp(104,"Shubham"));
		emps.add(new Emp(105,"Ajinkya"));
		emps.add(new Emp(106,"Ramesh"));
	
		// Sorting by comparator with respect to id:
		Collections.sort(emps, (o1, o2) ->{
			return o1.getId() - o2.id;
		});
		System.out.println(emps);
		
		// Sorting by comparator with respect to name:
		Collections.sort(emps, (o1 , o2) -> {
			return o1.getName().compareTo(o2.getName());
		});
		
		System.out.println(emps);
	}
	
	

}
