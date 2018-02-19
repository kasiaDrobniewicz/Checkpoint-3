package Controller;
import BookDao.BookDao;
import BookModel.BookModel;
import View.BookView;

public class BookController {

    private BookDao bookDao;
    private BookView bookView;

    public BookController() {

        bookDao = new BookDao();
    }

    public void addBook() {
        BookModel book = bookView.askForBookData();
        bookDao.addBook(book);
    }
}
