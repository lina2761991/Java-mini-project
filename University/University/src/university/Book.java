package university;



public class Book {
	
	
	private String title;
	private String author;
	private String isbn;
	private boolean isAvailable;
	

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	 public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.isAvailable = true;
	    }
	 public void checkOut() {
	        if (isAvailable) {
	            isAvailable = false;
	            System.out.println("	- Book was just lent: " + title);
	        } else {
	            System.out.println("	- Book is not available: " + title);
	        }
	    }

	    public void returnBook() {
	        if (!isAvailable) {
	            isAvailable = true;
	            System.out.println("	- Book returned: " + title);
	        } else {
	            System.out.println("	- Book is already available: " + title);
	        }
	    }
	   

		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", isAvailable=" + isAvailable
					+ "]";
		}
	    
	    
}
