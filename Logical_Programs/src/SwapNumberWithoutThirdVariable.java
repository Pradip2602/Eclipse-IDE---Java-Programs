
class Test
{
	public static void main(String [] args)
	{
		// swap numbers without using third variable

		int a = 20;
		int b = 10;
		System.out.println("before swapping values are : "+a+"  "+b);

		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("After swapping values are : "+a+"  "+b);
	}

	
}
