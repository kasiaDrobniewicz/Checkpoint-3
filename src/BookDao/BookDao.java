package BookDao;

import DbUtil.*;
import BookModel.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao {

    private Connection dbConnection;

    public BookDao() {

        dbConnection = DbUtil.getConnection();
    }

    public void addBook(BookModel book) {

        String strStatement = "INSERT INTO books(ISBN,autor,title,publisher,publisher_year,price,type) VALUES (NULL,\'\'\'" +
                book.getISBN() + "\'\'\',\'\'\'" + book.getAutor() + "\'\'\',\'\'\'" + book.getTitle() +
                "\'\'\',\'\'\'" + book.getPublisher() + "\'\'\'," + String.valueOf(book.getPublisherYear()) + "\'\'\'," + String.valueOf(book.getPrice()) + "\'\'\',\'\'\'" + book.getType() + ")";
        try {

            Statement statement = dbConnection.createStatement();

            statement.executeUpdate(strStatement);

            statement.close();
            dbConnection.commit();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }





//    public List<BookModel> getAllBooks() {
//
//        List<BookModel> books = new ArrayList<BookModel>();
//
//        try {
//
//            Statement statement = dbConnection.createStatement();
//
//            ResultSet rs = statement.executeQuery("SELECT * FROM books");
//
//            while (rs.next()) {
//
//                BookModel book = new BookModel();
//
//                book.setISBN(rs.getInt("ISBN"));
//
//                book.setAutor(rs.getString("autor"));
//
//                book.setTitle(rs.getString("title"));
//
//                book.setPublisher(rs.getString("publisher"));
//
//                book.setPublisherYear(rs.getInt("publisher_year"));
//
//                book.setPrice(rs.getInt("price"));
//
//                book.setType(rs.getInt("type"));
//
//                books.add(book);
//
//            }
//
//        } catch (SQLException e) {
//
//            e.printStackTrace();
//        }
//
//        return books;
//    }


}
