package maksim.epam.mvcproject.model;

import java.util.Objects;

public class Book {

    private long id;
    private String bookTitle;
    private String author;
    private int releaseYear;
    private String description;

    public Book(){}

    public Book(String bookTitle, String author, int releaseYear, String description) {
        this.id = -1L;
        this.bookTitle = bookTitle;
        this.author = author;
        this.releaseYear = releaseYear;
        this.description = description;
    }

    public Book(long id, String bookTitle, String author, int releaseYear, String description) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.author = author;
        this.releaseYear = releaseYear;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", releaseYear=" + releaseYear +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author);
    }
}
