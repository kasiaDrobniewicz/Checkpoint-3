package View;

import java.util.Scanner;

public class View {

    public static void welcomeUser() {
        System.out.println("****************************************************************\n" +
                "****************** JERZY'S HUMBLE HOME LIBRARY ******************\n" +
                "****************************************************************");
    }

    public static int displayMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****************************************************************\n" +
                "1. As Jerzy I would like to add new book to my book collection\n" +
                "2. As Jerzy I would like to edit given book's data.\n" +
                "3. As Jerzy I would like to delete book from collection\n" +
                "4. As Jerzy I would like to search for a books by one of theirs parameters (by ISBN\n" +
                "number, Title, author, publication year, publisher's name)\n" +
                "5. As Jerzy I would like to see all books available in library sorted ascending by name of\n" +
                "books\n" +
                "6. As Jerzy I would like to see all books written by given author\n" +
                "99. Quit application");
        System.out.println("Please choose an action (1-6 or 99): ");
        int action = scanner.nextInt();
        return action;
    }

    public static void sayGoodBye() {
        System.out.println("****************************************************************\n" +
                "************* THANK YOU FOR USING JERZY'S HUMBLE HOME LIBRARY! *************\n" +
                "****************************************************************");
    }

}