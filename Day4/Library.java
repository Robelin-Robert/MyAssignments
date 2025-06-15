package firstWeek.Day4;

public class Library {
	
	String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	void issueBook() {
		System.out.println("Book issued successfully");
	}
  public static void main(String[] args) {
	Library lb=new Library();
	lb.addBook("checked");
	lb.issueBook();
}
}
