package BookModel;

public class PrintedBook extends BookModel {

    private String type;

    public PrintedBook(String type) {
        this.type = type;
    }

    public PrintedBook(int ISBN, String autor, String title, String publisher, int publisherYear, int price, String type, String type1) {
        super(ISBN, autor, title, publisher, publisherYear, price, type);
        this.type = type1;
    }
}
