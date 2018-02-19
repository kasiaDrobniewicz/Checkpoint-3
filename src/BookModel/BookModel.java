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

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BookModel{" +
                "ISBN=" + ISBN +
                ", autor='" + autor + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publisherYear=" + publisherYear +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
