package BookModel;

public class PrintedBook extends BookModel {

    private String type;

    public EBook(int ISBN, String autor, String title, String publisher, int publisherYear, int price) {
        super(ISBN, autor, title, publisher, publisherYear, price);
        this.type = type;

    }

}
