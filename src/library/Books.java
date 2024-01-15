package library;

public class Books {
    private String bookName;
    private String authorName;

    private String category; //Thriller, Drama, Islamic etc
    private int price;

    public Books(String bookName, String authorName, String category, int price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.category = category;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }
}
