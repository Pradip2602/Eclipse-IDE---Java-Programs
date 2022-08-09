import java.util.Collections;
import java.util.LinkedList;

public class Sort_Book {

	public static void main(String[] args) {

		LinkedList <Book> books = new LinkedList<>();
		
		books.add(new Book(101,"Wings od Fire","APJ Kalam"));
		books.add(new Book(102,"Antman","Stanley"));
		books.add(new Book(103,"Two States","Chetan Bhagat"));
		books.add(new Book(104,"Game of Thrones","George Martin"));
		
	// Sorting by Comparator with respect to id:
		Collections.sort(books,(o1,o2) ->{
			return o1.getId() - o2.getId();
		});
		System.out.println(books);
		
	// Sorting by Comparator with respect to author:
		Collections.sort(books,(o1,o2) ->{
			return o1.getAuthor().compareTo(o2.getAuthor());
		});		
		System.out.println(books);
	}

}
