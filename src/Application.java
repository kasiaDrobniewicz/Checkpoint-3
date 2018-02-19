import BookDao.BookDao;
import BookModel.BookModel;
import Controller.BookController;
import View.View;
import DbUtil.*;

import java.awt.print.Book;

public class Application {

    public static void main (String [] args){

        BookController bookController = new BookController();
        BookDao bookDao = new BookDao();
        View view = new View();
        View.welcomeUser();
        int action = View.displayMenu();

        while (action != 99) {
            switch(action) {
                case 1:
                    bookController.addBook();
                    break;
                case 2:
                    bookController.updateBook();
                    break;

                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Incorrect option chosen");
            }
            action = View.displayMenu();
        }

        DbUtil.closeDbConnection();
        View.sayGoodBye();

    }

}
