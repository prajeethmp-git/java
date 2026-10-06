class Book {
	int bookID;
	String title;
	String author;
	double price;
	static int count = 0;

	Book(int id, String t, String a, double p) {
		bookID = id;
		title = t;
		author = a;
		price = p;
		count++;
	}
	void display() {
		System.out.println("Book ID: " + bookID);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
	void search(int id) {
		if (bookID == id)
			System.out.println("Book found: " + title);
		else
			System.out.println("Book not found");
	}
	void search(String t) {
		if (title.equalsIgnoreCase(t))
			System.out.println("Book found: " + title);
		else
			System.out.println("Book not found");
	}

	Book costlier(Book b) {
		if (price > b.price)
			return this;
		else
			return b;
	}
}
public class Main {
	public static void main(String[] args) {
		Book b1 = new Book(1, "abc", "nishanth", 10000);
		Book b2 = new Book(2, "oops", "shiva", 560);
		Book b3 = new Book(3, "Om", "nishanth jr", 8677.00);

		b1.display();
		System.out.println();
		b2.display();
		System.out.println();
		b3.display();
		System.out.println();
		b1.search(1);
		b2.search("oops");
		Book expensive = b1.costlier(b3);
		System.out.println("\nCostlier Book:");
		expensive.display();
		System.out.println("\nTotal books created: " + Book.count);
	}
}