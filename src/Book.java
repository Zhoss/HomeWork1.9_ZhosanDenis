public class Book {
    private final String bookName;
    private final Author authorFullName;
    private int publicationYear;

    public Book(String bookName, Author authorFullName, int publicationYear) {
        this.bookName = bookName;
        this.authorFullName = authorFullName;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorFullName() {
        return this.authorFullName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String authorFullName(Author author1) {
        String authorName = author1.getAuthorName();
        String authorLastName = author1.getAuthorLastName();
        return authorName + " " + authorLastName;
    }

}
