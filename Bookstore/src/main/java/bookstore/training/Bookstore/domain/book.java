package bookstore.training.Bookstore.domain;

public class book {
	private String title;
	private String author;
	private String isbn;
	private int publicationYear;
	private double price;

	public book() {}
	public book(String author, String isbn ,String title, int publicationYear, double price) {
        super();
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.price = price;
        
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

	public int getPublicationYear() {
		return publicationYear;
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}
}