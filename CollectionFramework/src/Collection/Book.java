package Collection;

import java.util.PriorityQueue;

public class Book implements Comparable<Book> {
	String name,author,publisher;
	int quantity ,id;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Book b) {
		if(id>b.id) {
			
			return 1;
		}
		else if(id<b.id){
			return 0;
		}
		else return -1;
	}
	
	public static void main(String[] args) {
		PriorityQueue<Book> que= new PriorityQueue<Book>();
		
		Book b1 = new Book(322, "Game of Thrones", "George Martin", "HBO", 50);
		Book b2 = new Book(101, "Stranger Things", "Duffer Brothers", "Netflix", 20);
		Book b3 = new Book(122, "Avatar", "James cameron", "Marvel", 300);
		
		que.add(b1);
		que.add(b2);
		que.add(b3);
		
		for(Book b:que) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
		que.remove();
	// printing after remove 
		for(Book b:que) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
	}
}
