package BookModel;

public class EBook extends BookModel {

    private String type;

    public EBook(String type) {
        this.type = type;
    }

    public EBook(int ISBN, String autor, String title, String publisher, int publisherYear, int price, String type, String type1) {
        super(ISBN, autor, title, publisher, publisherYear, price, type);
        this.type = type1;
    }
}
