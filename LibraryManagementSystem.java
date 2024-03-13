package librarySystem;

import java.util.Scanner;


public class LibraryManagementSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the library management system.");
        Library manager = new Library();

        while(true){
        System.out.print("\n\n\nTo add books, press 1\n\nTo add users, press 2\n\nTo see available books, press 3\n\nTo check out books, press 4\n\nTo return books, press 5\n\nTo search for books by book title or author, press 6\n\nTo search for users by user ID, press 7\n\nTo exit, press 8\n\nYour input(1-8): ");
        String option = input.nextLine();
        int num = Integer.parseInt(option);
        switch (num) {
            case 1:
                System.out.print("Book ID: ");
                String bookID = input.nextLine();
                System.out.print("Title: ");
                String title = input.nextLine();
                System.out.print("Author: ");
                String author = input.nextLine();
                System.out.print("Genre: ");
                String genre = input.nextLine();
                Book b1 = new Book(bookID, title, author, genre , true);
                manager.addBook(b1);
                break;
            
            case 2:
                System.out.print("User ID: ");
                String userID = input.nextLine();
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Contact Information: ");
                String contactInfo = input.nextLine();
                System.out.print("Books borrowed?(Y/N) ");
                String choice = input.nextLine();
                if (choice=="Y" || choice=="y"){
                    System.out.print("How many? ");
                    int quantity = input.nextInt();
                    
                    User u1=new User(userID, name, contactInfo, quantity);
                    manager.addUser(u1);
                    
                }
                else if(choice =="N" || choice=="n") {
                    User u1=new User(userID, name, contactInfo, 0);
                    manager.addUser(u1);
                }
                else
                    System.out.println("Invalid input");
                break;
            
            case 3:
                manager.display();
                break;

            case 4:
                System.out.print("Book ID: ");
                String bookID_b = input.nextLine();
                manager.outBook(bookID_b);
                break;
            
            case 5:
                System.out.print("Book ID: ");
                String bookID_c = input.nextLine();
                System.out.print("Title: ");
                String title_c = input.nextLine();
                System.out.print("Author: ");
                String author_c = input.nextLine();
                System.out.print("Genre: ");
                String genre_c = input.nextLine();
                Book b3 = new Book(bookID_c, title_c, author_c, genre_c, true);
                manager.returnBook(b3);
                break;

            case 6:
                System.out.print("Book name or Author name: ");
                String searchBook = input.nextLine();
                Book findByBook= manager.searchByBook(searchBook);
                if (findByBook != null){
                    System.out.println("Book found: "+ findByBook.getTitle()+ " by " + findByBook.getAuthor());
                }
                else{
                    System.out.println("Book not found.");
                }
                break;

            case 7:
                System.out.print("User ID: ");
                String searchUser = input.nextLine();
                User findByUser = manager.searchByUser(searchUser);
                if (findByUser != null){
                    System.out.println("User ID: "+findByUser.getUserID());
                    System.out.println("");
                }
                else{
                    System.out.println("User not found.");
                }
                break;

            case 8:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid input.");
                break;
        }
        }
    }
}
