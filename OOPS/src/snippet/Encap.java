package snippet;

class Moped 
{
	private String name = "Shine" ;
	private double price = 59000 ;
	
	void setValue(String n,double d) 
	{
		n = name ;
		d = price ;
	}
	String getValue() 
	{
		return name;
	}
	double getValue1() 
	{
		return price;
	}
	
}
public class Encap 
{

		public static void main(String[] args) {
			Moped v = new Moped();
			System.out.println(v.getValue());
			System.out.println(v.getValue1());
		}
}
