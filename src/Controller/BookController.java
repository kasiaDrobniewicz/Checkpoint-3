package Controller;
import BookDao.BookDao;
import BookModel.BookModel;
import View.BookView;

import java.util.List;

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

    public void updateBook() {
        List<BookModel> books = bookDao.getAllBooks();
        for(int i = 0; i < books.size(); i++) {
            BookView.displayBookData(books.get(i));
        }

        int ISBN = BookView.getBookISBN();
        BookModel book = BookView.askForBookData();
        book.setISBN(ISBN);
        bookDao.updateBook(book);
    }



    public void getBookByTitle(String title) {
        List<BookModel> books = bookDao.getBookByTitle(title);

        for(int i = 0; i < books.size(); i++) {
            BookView.displayBookData(books.get(i));

        }
    }
    public void deleteBookByTitle(String title) {
        List<BookModel> books = bookDao.getBookByTitle(title);

        for(int i = 0; i < books.size(); i++) {
            bookDao.deleteBook(books.get(i));
            System.out.println(books.get(i));
        }
    }

}
