package BookModel;

public abstract class BookModel {
    private int ISBN;
    private String autor;
    private String title;
    private String publisher;
    private int publisherYear;
    private int price;
    private String type;

    public BookModel() {
        this.ISBN = 0;
        this.autor = null;
        this.title = null;
        this.publisher = null;
        this.publisherYear = 0;
        this.price = 0;
        this.type = null;
    }


    public BookModel(int ISBN, String autor, String title, String publisher, int publisherYear, int price, String type) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.title = title;
        this.publisher = publisher;
        this.publisherYear = publisherYear;
        this.price = price;
        this.type = type;
    }
}
