package homework9;

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
}
