package bookstore.training.Bookstore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import bookstore.training.Bookstore.BookstoreApplication;
import bookstore.training.Bookstore.domain.Book;
import bookstore.training.Bookstore.domain.BookRepository;
import bookstore.training.Bookstore.domain.Category;
import bookstore.training.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository,CategoryRepository C_repository) {
		return (args) -> {
			log.info("example data");
			
			C_repository.save(new Category("Drama"));
			C_repository.save(new Category("Thriller"));
			C_repository.save(new Category("Romance"));
			C_repository.save(new Category("Action"));
			C_repository.save(new Category("Adventure"));
			
			repository.save(new Book("The Snowman", "Jo Nesbo", 1990, "1234567-89", 30.00, C_repository.findByName("Thriller").get(0)));
			repository.save(new Book("Dark forces", "Stephen Leather", 1999, "9876543-21", 25.00, C_repository.findByName("Thriller").get(0)));
			
			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	}
}
