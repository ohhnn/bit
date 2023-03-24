package bit.basic.obj1;
public class Book {
	private String author="갱미";
	private int price;
	private String publisher;
	private String regdate;
	private String bookName;
	public Book() {
		this("");
	}
	public Book(String author) {
		//this.author=author;
		this(author,0);
	}
	public Book(String author,int price) {
		this(author,price,"");
//		this.author=author;
//		this.price=price;
	}
	public Book(String author,int price,String publisher) {	
		this(author,price,publisher,"");
//		this.author=author;
//		this.price=price;
//		this.publisher=publisher;
	}
	public Book(String author,int price,String publisher,String regdate) {	
		this(author,price,publisher,regdate,"");
//		this.author=author;
//		this.price=price;
//		this.publisher=publisher;
//		this.regdate=regdate;
	}
	public Book(String author,int price,String publisher,String regdate,String bookName) {	
		this.author=author;
		this.price=price;
		this.publisher=publisher;
		this.regdate=regdate;
		this.bookName=bookName;
	}	
	
	//(alt+shift+s)+s
	@Override
	public String toString() {
		return "Book [author=" + author + ", price=" + price + ", publisher=" + publisher + ", regdate=" + regdate
				+ ", bookName=" + bookName + "]";
	}
	public static void main(String[] args) {
		Book book1=new Book("갱미",8000,"비트출판","2023/03/23","오갱끼데스까");
		Book book2=new Book();
		System.out.println(book1);

	}


}











