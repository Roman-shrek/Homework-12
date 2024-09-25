public class Book {
    private String titleBook;
    private Author author;
    private int datePublication;

    public Book(String titleBook, Author author, int datePublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.datePublication = datePublication;
    }
    public String getTitleBook(){
        return this.titleBook;

    }
    public Author getAuthor() {
        return this.author;
    }

    public int getDatePublication() {
        return this.datePublication;
    }

    public void setDatePublication(int datePublication) {
        this.datePublication = datePublication;
    }
}
