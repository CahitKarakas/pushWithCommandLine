package day41;

public class Library {
	
	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		book1.setTitle("Grit");
		book1.setAuthor("Angela");
		book1.setPages(400);
		
		
		Book javaBook = new Book();
		
		javaBook.setAuthor("Liang");
		javaBook.setTitle("Intro to Java");
		javaBook.setPages(1000);
		
		
		System.out.println("Title: "+book1.getTitle());
		System.out.println("Author: "+book1.getAuthor());
		System.out.println("Pages: "+book1.getPages());
		
		
		System.out.println("------");
		
		System.out.println("Title: "+javaBook.getTitle());
		System.out.println("Author: "+javaBook.getAuthor());
		System.out.println("Pages: "+javaBook.getPages());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
