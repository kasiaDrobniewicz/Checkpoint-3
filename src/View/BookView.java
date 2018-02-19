package View;

import BookModel.BookModel;

import java.util.Scanner;

public class BookView {

    public static void displayText(String text) {
        System.out.println(text);
    }

    public static BookModel askForBookData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type the new ISBN number: ");
        int ISBN = scanner.nextInt();

        System.out.println("Please type the autor: ");
        String autor = scanner.next();

        System.out.println("Please type the title: ");
        String title = scanner.next();

        System.out.println("Please type the publisher: ");
        String publisher = scanner.next();

        System.out.println("Please type the publisher year: ");
        int publisherYear = scanner.nextInt();

        System.out.println("Please type the publisher price: ");
        int price = scanner.nextInt();

        System.out.println("Please type the type: ");
        String type = scanner.next();


        BookModel book= new BookModel(ISBN,autor,title,publisher,publisherYear,price,type); {
        }

        return book;
    }

    public static void displayBookData(BookModel book) {
        System.out.println(book.getISBN() + " " + book.getAutor() + " " +
                book.getTitle() + " " + book.getPublisher() + " " + String.valueOf(book.getPublisherYear()));
    }

    public static int getBookISBN() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose the ISBN of the book you want to update: ");
        int ISBN = scanner.nextInt();

        return ISBN;
    }
}