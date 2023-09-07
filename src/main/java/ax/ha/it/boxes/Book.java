package ax.ha.it.boxes;

import java.math.BigDecimal;

public class Book extends SellableItem{

    private final String author;
    private final String isbn;
    private final String title;

    public Book(String title, String author, String isbn, String ean, BigDecimal price, double weight) {
        super(ean, price, weight);
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return "Book: " + title + " by " + author;
    }
}
