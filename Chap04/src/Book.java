
public class Book {
	
	String title;
	String author;
	int isbn;
	
	public Book() {
		this(null, null, 0);	// �� ��° ������ ȣ��
		System.out.println("�⺻ ������");
	}
	
	public Book(String title, int isbn) {
		this(title, "Anonymous", isbn);	// �� ��° ������ ȣ��
		System.out.println("���� 2��¥�� ������");
	}
	
	public Book(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		System.out.println("���� 3��¥�� ������");
	}
	
	
	
	public static void main(String[] args) {
		
//		Book a = new Book("Java", "BIT", 1234);
//		Book b = new Book("Holy Bible", 1);
		Book c = new Book();
		
	}
	
}
