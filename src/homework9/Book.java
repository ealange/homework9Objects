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

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookAuthor, publishingYear);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
//        проверяем, что совпадает название, автор и год
        return bookTitle == ((Book) obj).getBookTitle() &&
                bookAuthor.equals(((Book) obj).getBookAuthor()) &&
                publishingYear == ((Book) obj).getPublishingYear();
    }

    @Override
    public String toString() {
        return "Название: " + bookTitle + ", автор " + toString(bookAuthor) + "(" + publishingYear + " г.)";
    }
}
