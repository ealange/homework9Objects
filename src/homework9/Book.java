package homework9;

import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author bookAuthor;
    private int publishingYear;

    public Book(String bookTitle, Author bookAuthor, int publishingYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publishingYear = publishingYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }


    @Override
    public String toString() {
        return "Название: " + bookTitle + " (" + publishingYear + " г.)" + " " + bookAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && bookTitle.equals(book.bookTitle) && bookAuthor.equals(book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookAuthor, publishingYear);
    }
}
